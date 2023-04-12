package org.example.repository;

import org.example.model.Car;

import java.util.ArrayList;

public interface ICarRepository {

    void addCar(Car car);
    void deleteByLicensePlate(String licensePlate);
    ArrayList<Car> findAll();
    Car findByLicensePlate(String licensePlate);

    Car findById(int id);
    void update(Car car);
}
