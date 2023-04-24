package org.example.model.rental;

import org.example.model.Car.CarA;
import org.example.model.Client;
import org.example.model.RentalOffice;

import java.util.Date;

public class RentalOnSite extends Rental {

    private String comments;

    private RentalOffice rentalOffice;

    public RentalOnSite(int idRent, Date startDate, Date endDate, Client client, CarA carA, String comments,RentalOffice rentalOffice) {
        super(idRent, startDate, endDate, client, carA);
        this.comments = comments;
        this.rentalOffice=rentalOffice;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
