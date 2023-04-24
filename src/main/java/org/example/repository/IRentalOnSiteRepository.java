package org.example.repository;

import org.example.model.Car.Car;
import org.example.model.Client;

public interface IRentalOnSiteRepository extends IRentalRepository {
    @Override
    default void pickUpOffice() {

    }

    @Override
    default void isFor() {

    }



    @Override
    default void makeRent(Client customer, Car car) {

    }

}
