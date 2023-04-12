package org.example.repository;

public interface IRentalWebRental extends IRentalRepository{
    @Override
    void pickUpOffice();

    @Override
    void isFor();

    @Override
    void makes();
}
