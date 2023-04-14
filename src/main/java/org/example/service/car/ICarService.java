package org.example.service.car;

import org.example.model.Car.CarA;

import java.util.ArrayList;

public interface ICarService {
    void add(CarA carA);
    void deleteById(Long idCar);
    ArrayList findAll();
    CarA findById(Long idCar);
    void update(CarA carA);
}
