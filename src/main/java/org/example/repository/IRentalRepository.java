package org.example.repository;

import org.example.model.Car.Car;
import org.example.model.Client;

import java.util.Date;

public interface IRentalRepository {
// TODO aqui puedes buscar las oficinas por ID, en funcion de la direccion de la oficina
    void pickUpOffice(String address);
    void isFor();

    Client searchClient(int clientId);
    Car searchCar(int carId);

    void makeRent(Client customer, Car car);
}
