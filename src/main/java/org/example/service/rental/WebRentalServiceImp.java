package org.example.service.rental;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import org.example.repository.IRentalRepository;
import org.example.repository.WebRentalRepository;
import java.util.Date;

public class WebRentalServiceImp implements IRentalService{

    private IRentalRepository repository;
    public WebRentalServiceImp() {
        repository = new WebRentalRepository();
    }

    @Override
    public void createRent(Client client, Car car, RentalOffice rentalOffice, Date startDate, Date endDate) {
        repository.createRent(startDate,endDate,client,car,rentalOffice);
    }

    public void modifyRent(int idRental, RentalOffice rentalOffice) {
        repository.modifyRent(idRental);
    }
}
