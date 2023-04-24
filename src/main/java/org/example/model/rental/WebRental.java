package org.example.model.rental;

import org.example.model.Car.CarA;
import org.example.model.Client;
import org.example.model.RentalOffice;

import java.util.Date;

public class WebRental extends Rental {

    private int deliveryTime;
    private RentalOffice deliveryOffice;

    public WebRental(int idRent, Date startDate, Date endDate, Client client, CarA carA, int deliveryTime, RentalOffice deliveryOffice) {
        super(idRent, startDate, endDate, client, carA);
        this.deliveryTime = deliveryTime;
        this.deliveryOffice= deliveryOffice;
    }
}
