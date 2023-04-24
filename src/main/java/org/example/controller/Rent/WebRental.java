package org.example.controller.Rent;

import java.util.Date;

public class WebRental extends Rent{
    int deliveryTime;

    public WebRental(Date startDate, Date endDate, int deliveryTime) {
        super(startDate, endDate);
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
