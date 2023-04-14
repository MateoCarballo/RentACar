package org.example.repository;

import org.example.model.CarA;

import java.util.ArrayList;

public class CarRepository implements ICarRepository{

    private ArrayList<CarA> carAS;

    public CarRepository() {
        carAS = new ArrayList<>();
    }

    @Override
    public void addCar(CarA carA) {
        carA.setIdCar(nextIdAvailable());
        carAS.add(carA);
    }

    @Override
    public void update(CarA carA) {
        CarA carAToUpdate = findByIdCar(carA.getIdCar());
        if(carAToUpdate != null){
            carAToUpdate.setIdCar(carA.getIdCar());
            carAToUpdate.setLicensePlate(carA.getLicensePlate());
        }
    }
    @Override
    public ArrayList<CarA> findAll() {
        return carAS;
    }

    @Override
    public CarA findByIdCar(Long idCar) {
        if(!isEmpty()){
            for (CarA carA : carAS) {
                if(carA.getIdCar() == idCar){
                    return carA;
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
        for (int i = 0; i < carAS.size(); i++) {
            if (carAS.get(i).getIdCar()==idCar){
                carAS.remove(i);
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
        if(carAS.size() == 0){
            return true;
        }
        return false;
    }
    public Long nextIdAvailable(){
        if(!isEmpty()){
            return carAS.get(carAS.size()-1).getIdCar() + 1;
        }
        else{
            return 1L;
        }
    }
}
