package org.example.repository;

import org.example.model.Client;
import org.example.model.RentalOffice;

public interface IRentalRepository {
    void isFor();
    RentalOffice searchOffice(String address);
    Client searchClient(int clientId);
    Car searchCar(int carId);
    void makeRent(Client customer, Car car, RentalOffice rentalOffice);
}
