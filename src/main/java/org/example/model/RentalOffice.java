package org.example.model;

import org.example.model.Car.Car;

import java.util.ArrayList;

public class RentalOffice {
    String address;
    int feeForDelivery;

    public ArrayList<Car> carsAsigned;

    public RentalOffice(String address, int feeForDelivery) {
        this.address = address;
        this.feeForDelivery = feeForDelivery;
        this.carsAsigned = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFeeForDelivery() {
        return feeForDelivery;
    }

    public void setFeeForDelivery(int feeForDelivery) {
        this.feeForDelivery = feeForDelivery;
    }
}
