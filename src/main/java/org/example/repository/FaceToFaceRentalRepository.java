package org.example.repository;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;

import java.util.Date;

public class FaceToFaceRentalRepository implements IRentalRepository{
    @Override
    public void createRent(Client client, Car car, RentalOffice rentalOffice, Date startDate, Date endDate) {

    }

    @Override
    public void modifyRent(int idRental, RentalOffice rentalOffice) {

    }
}
