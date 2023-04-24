package org.example.repository;

import org.example.model.Client;
import org.example.model.RentalOffice;

public class WebRentalRepository implements IRentalRepository {

    @Override
    public void isFor() {
        
    }

    @Override
    public RentalOffice searchOffice(String address) {
        return null;
    }

    @Override
    public Client searchClient(int clientId) {
        return null;
    }

    @Override
    public Car searchCar(int carId) {
        return null;
    }

    @Override
    public void makeRent(Client customer, Car car, RentalOffice rentalOffice) {

    }
}
