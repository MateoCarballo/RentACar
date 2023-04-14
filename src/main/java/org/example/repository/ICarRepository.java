package org.example.repository;

import org.example.model.Car.CarA;

import java.util.ArrayList;

public interface ICarRepository {

    void addCar(CarA carA);
    void deleteByIdCar(Long idCar);
    ArrayList findAll();
    CarA findByIdCar(Long idCar);
    void update(CarA carA);


}
