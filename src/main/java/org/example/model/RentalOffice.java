package org.example.model;

import org.example.model.Car.Car;

import java.util.ArrayList;

public class RentalOffice {
    String address;
    int feeForDelivery;

    public ArrayList<Car> carsAsigned = new ArrayList<>();

    public RentalOffice(String address, int feeForDelivery, ArrayList<Car> carsAsigned) {
        this.address = address;
        this.feeForDelivery = feeForDelivery;
        this.carsAsigned = carsAsigned;
    }

    public RentalOffice(String address, int feeForDelivery) {
        this.address = address;
        this.feeForDelivery = feeForDelivery;
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
