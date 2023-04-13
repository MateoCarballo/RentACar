package org.example.repository;

import org.example.model.Car;

import java.util.ArrayList;

public interface ICarRepository {

    void addCar(Car car);

    void deleteByLicensePlate(String licensePlate);
    void deleteByIdCar(Long idCar);

    Car findById(Long id);
    Car findByLicensePlate(String licensePlate);
    ArrayList<Car> findAll();

    void update(Car car);


}
