package org.example.service.rental;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import org.example.model.rental.Rental;

import java.util.Date;

public interface IRentalService {

    /**
     *
     void rent (Client client, Car car);
     void endRent(Client client, Car car);
     //TODO esto era lo que tenia, antes existian dos interfaces una por cada tipo de alquiler
     // o puedo ponerlo asi *void updateRent(Rental rental); *
     void updateRent(Rental rental);
     */

    void createRent(Client client, Car car, RentalOffice rentalOffice, Date startDate, Date endDate);
    void modifyRent(int idRental,RentalOffice rentalOffice);
}
