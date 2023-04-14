package org.example.controller;


import org.example.model.Car.CarA;
import org.example.model.Car.Modelos;
import org.example.service.car.CarServiceImp;
import org.example.service.car.ICarService;

import java.util.ArrayList;

public class CarController {

    private ICarService serviceCar;

    public CarController(){
        serviceCar=new CarServiceImp();
    }

    /**
     * Abajo uso la misma forma que veo en client
     * Tienes el constructor sobrecargado e hice lo mismo para
     * poder crear un coche sin idCoche solo con su matrícula.
     */
    public void add (String licensePlate){
        CarA carA = new CarA(licensePlate);
    }

    public void deleteByIdCar(Long idCar){
        serviceCar.deleteById(idCar);
    }

    public ArrayList<CarA> findAll(){
        return serviceCar.findAll();
    }
    public CarA findByIdCar(Long idCar){
        return serviceCar.findById(idCar);
    }
    public void updateCar (Long idCar,String licensePlate){
        CarA carA = new CarA(licensePlate,idCar, Modelos.MODELO_A);
        serviceCar.update(carA);
    }
}
