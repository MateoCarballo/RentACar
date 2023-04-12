package org.example.repository;

import org.example.model.Car;
import org.example.model.Client;

import java.util.ArrayList;

public class CarRepository implements ICarRepository{

    private ArrayList<Car> cars;

    public CarRepository() {
        cars = new ArrayList<>();
    }

    public int nextIdAvailable(){
        if(!isEmpty()){
            return cars.get(cars.size()-1).getIdCar() + 1;
        }
        else{
            return 1;
        }
    }

    public boolean isEmpty(){
        if(cars.size() == 0){
            return true;
        }
        return false;
    }
    @Override
    public void addCar(Car car) {
        car.setIdCar(nextIdAvailable());
        cars.add(car);
    }

    @Override
    public void deleteByLicensePlate(String licensePlate) {

    }

    @Override
    public ArrayList<Car> findAll() {
        return null;
    }

    @Override
    public Car findByLicensePlate(String licensePlate) {
        return null;
    }

    @Override
    public void update(Car car) {

    }

    @Override
    public Car findById(int id) {
        if(!isEmpty()){
            for (Car car : cars) {
                if(car.getIdCar() == id){
                    return car;
                }
            }
            return null;
        }
        return null;
    }

}
