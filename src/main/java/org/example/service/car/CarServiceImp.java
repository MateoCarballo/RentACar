package org.example.service.car;

import org.example.model.Car.Car;
import org.example.repository.CarRepository;
import org.example.repository.ICarRepository;

import java.util.ArrayList;

public class CarServiceImp implements ICarService {

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
        repositoryCar.deleteByIdCar(idCar);
    }
    @Override
    public ArrayList findAll() {
        return repositoryCar.findAll();
    }

    @Override
    public Car findById(Long idCar) {
        return repositoryCar.findByIdCar(idCar);
    }

    @Override
    public void update(Car car) {

    }

}
