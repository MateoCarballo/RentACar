package org.example.model;

import java.util.Date;

public class WebRental extends Rental{

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
