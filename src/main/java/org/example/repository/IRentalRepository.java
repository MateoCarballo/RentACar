package org.example.repository;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import org.example.model.rental.Rental;
import org.example.model.rental.WebRental;

import java.util.Date;

public interface IRentalRepository {

    void createRent(Date startDate, Date endDate, Client client, Car car, RentalOffice rentalOffice);

    void modifyRent(int idRental);
    Rental searchRent(int idRent);

}
