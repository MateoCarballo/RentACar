package org.example.service;

import org.example.model.Car;
import org.example.model.Client;

import java.util.ArrayList;

public interface ICarService {

    void add(Car car);
    void deleteById(Long idCar);
    ArrayList findAll();
    Car findById(Long idCar);
    void update(Client client);

    void update(Car car);
}
