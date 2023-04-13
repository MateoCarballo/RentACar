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
        Car carToUpdate = findByidCar(car.getIdCar());
        if(carToUpdate != null){
            carToUpdate.setIdCar(car.getIdCar());
            carToUpdate.setLicensePlate(car.getLicensePlate());
        }
    }

    @Override
    public ArrayList<Car> findAll() {
        return cars;
    }

    public Long nextIdAvailable(){
        if(!isEmpty()){
            return cars.get(cars.size()-1).getIdCar() + 1;
        }
        else{
            return 1L;
        }
    }

    @Override
    public void deleteByLicensePlate(String licensePlate) {

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

    @Override
    public Car findById(Long id) {
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

    public boolean isEmpty(){
        if(cars.size() == 0){
            return true;
        }
        return false;
    }




    /**
     Aqui solo tendriamos que enviar el arrayList que
     está dentro de esta clase verda?

     */


    /**
     * Abajo necesito dos metodos y llamarlo o no si encuentro la matricula
     * y si no la encuentro no llamarlo
     * no se que devolver si no encuentra un coche con esa matricula.

     * Esa era la primera opcion cogi una variable auxiliar y la envio siempre
     *
     */








}
