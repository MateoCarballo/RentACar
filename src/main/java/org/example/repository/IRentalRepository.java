package org.example.repository;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;

import java.util.Date;

public interface IRentalRepository {
    void createRent(Client client, Car car, RentalOffice rentalOffice, Date startDate, Date endDate);
    void modifyRent(int idRental,RentalOffice rentalOffice);
}
