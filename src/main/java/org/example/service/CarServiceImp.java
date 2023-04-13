package org.example.service;

import org.example.model.Car;
import org.example.repository.CarRepository;
import org.example.repository.ICarRepository;

import java.util.ArrayList;

public class CarServiceImp implements ICarService{

    private ICarRepository repositoryCar;

    public CarServiceImp(){
        repositoryCar= new CarRepository();
    }

    @Override
    public void add(Car car) {
        repositoryCar.addCar(car);
    }

    @Override
    public void deleteById(Long idCar) {

    }

    @Override
    public ArrayList findAll() {
        return null;
    }

    @Override
    public Car findById(Long idCar) {
        return null;
    }

    @Override
    public void update(Car car) {

    }


    /*
    public CarServiceImp(){
        repository= new CarRepository();
    }

    @Override
    public void add(Car car) {
        repository.addCar(car);
    }

    @Override
    public void deleteById(Long idCar) {

    }

    @Override
    public ArrayList findAll() {
        return null;
    }

    @Override
    public Car findById(int idCar) {
        return null;
    }

    @Override
    public void update(Client client) {

    }
     */
}
