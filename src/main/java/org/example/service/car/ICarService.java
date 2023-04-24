package org.example.service.car;

import org.example.model.Car.Car;

import java.util.ArrayList;

public interface ICarService {
    void add(Car carA);
    void deleteById(Long idCar);
    ArrayList findAll();
    Car findById(Long idCar);
    void update(Car carA);
}
