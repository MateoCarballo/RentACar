package org.example.service.rental;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import org.example.model.rental.Rental;
import org.example.repository.ClientRepository;
import org.example.repository.IClientRepository;
import org.example.repository.IRentalRepository;
import org.example.repository.WebRentalRepository;

import java.util.ArrayList;
import java.util.Date;

public class WebRentalServiceImp implements IRentalService{

   private IRentalRepository repository;
    public WebRentalServiceImp() {
        repository = new WebRentalRepository();
    }

    @Override
    public void createRent(Client client, Car car, RentalOffice rentalOffice, Date startDate, Date endDate) {
        repository.createRent(client,car,rentalOffice,startDate,endDate);
    }

    @Override
    public void modifyRent(int idRental, RentalOffice rentalOffice) {
        repository.modifyRent(idRental, rentalOffice);
    }
}
