package org.example.repository;

import org.example.model.Car;

import java.util.ArrayList;

public interface ICarRepository {

    void addCar(Car car);
    void deleteByIdCar(Long idCar);
    ArrayList findAll();
    Car findByIdCar(Long idCar);
    void update(Car car);


}
