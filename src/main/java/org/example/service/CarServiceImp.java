package org.example.service;

import org.example.model.CarA;
import org.example.repository.CarRepository;
import org.example.repository.ICarRepository;

import java.util.ArrayList;

public class CarServiceImp implements ICarService{

    private ICarRepository repositoryCar;

    public CarServiceImp(){
        repositoryCar= new CarRepository();
    }

    @Override
    public void add(CarA carA) {
        repositoryCar.addCar(carA);
    }

    @Override
    public void deleteById(Long idCar) {
        repositoryCar.deleteByIdCar(idCar);
    }
    @Override
    public ArrayList findAll() {
        return repositoryCar.findAll();
    }

    @Override
    public CarA findById(Long idCar) {
        return repositoryCar.findByIdCar(idCar);
    }

    @Override
    public void update(CarA carA) {

    }

}
