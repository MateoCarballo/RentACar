package org.example.repository;

import org.example.model.Car;

import java.util.ArrayList;

public class CarRepository implements ICarRepository{

    private ArrayList<Car> cars;

    public CarRepository() {
        cars = new ArrayList<>();
    }

    @Override
    public void addCar(Car car) {
        car.setIdCar(nextIdAvailable());
        cars.add(car);
    }

    @Override
    public void update(Car car) {
        Car carToUpdate = findByIdCar(car.getIdCar());
        if(carToUpdate != null){
            carToUpdate.setIdCar(car.getIdCar());
            carToUpdate.setLicensePlate(car.getLicensePlate());
        }
    }
    @Override
    public ArrayList<Car> findAll() {
        return cars;
    }

    @Override
    public Car findByIdCar(Long idCar) {
        if(!isEmpty()){
            for (Car car : cars) {
                if(car.getIdCar() == idCar){
                    return car;
                }
            }
            return null;
        }
        return null;
    }


    /**
     Aqui porque no devolvemos un Boolean para saber si hemos hecho el borrado
     o no?

     public boolean deleteByIdCar(Long idCar) {
     boolean deleteComplete=false;
     for (int i = 0; i < cars.size(); i++) {
     if (cars.get(i).getIdCar()==idCar){
     cars.remove(i);
     deleteComplete=true;
     }
     }
     return deleteComplete;
     }

     */
    @Override
    public void deleteByIdCar(Long idCar) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getIdCar()==idCar){
                cars.remove(i);
            }
        }
    }
    /**
     * Aquie queria poder buscar por placa de matricula y borrar
     * al encontrarlo
     *
     @Override
     public Car findByLicensePlate(String licensePlate) {
     Car car = new Car("9876-ZZZ");
     car = null;
     for (int i = 0; i < cars.size(); i++) {
     if (cars.get(i).getLicensePlate().equalsIgnoreCase(licensePlate)) {
     car=cars.get(i);
     }
     }
     return car;
     }

     */
    public boolean isEmpty(){
        if(cars.size() == 0){
            return true;
        }
        return false;
    }
    public Long nextIdAvailable(){
        if(!isEmpty()){
            return cars.get(cars.size()-1).getIdCar() + 1;
        }
        else{
            return 1L;
        }
    }
}
