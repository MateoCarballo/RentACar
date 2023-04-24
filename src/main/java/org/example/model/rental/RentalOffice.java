package org.example.model.rental;

public class RentalOffice {
    String address;
    int feeForDelivery;

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