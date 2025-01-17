package org.example.repository;

import org.example.model.Car.Car;

import java.util.ArrayList;

public interface ICarRepository {

    void addCar(Car carA);
    void deleteByIdCar(Long idCar);
    ArrayList findAll();
    Car findByIdCar(Long idCar);
    void update(Car carA);


}
