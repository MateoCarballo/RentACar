package org.example.model.rental;

import org.example.model.rental.Rental;

import java.util.Date;

public class WebRental extends Rental {

    private int deliveryTime;

    public WebRental(Date startDate,int deliveryTime) {
        super(startDate);
        this.deliveryTime=deliveryTime;
    }

    public WebRental(Date startDate, Date endDate,int deliveryTime) {
        super(startDate, endDate);
        this.deliveryTime=deliveryTime;
    }
}
