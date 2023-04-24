package org.example.model.rental;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;

import java.util.Date;

public class FaceToFaceRental extends Rental {

    private String comments;

    private RentalOffice rentalOffice;

    public FaceToFaceRental(int idRent, Date startDate, Date endDate, Client client, Car car, String comments, RentalOffice rentalOffice) {
        super(idRent, startDate, endDate, client, car);
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
