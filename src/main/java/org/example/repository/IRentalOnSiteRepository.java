package org.example.repository;

public interface IRentalOnSiteRepository extends IRentalRepository {
    @Override
    void pickUpOffice();

    @Override
    void isFor();

    @Override
    void makes();
}
