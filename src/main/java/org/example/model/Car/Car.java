package org.example.model.Car;

import org.example.model.RentalOffice;

public abstract class Car {
    private Long idCar;
    private String licensePLate;
    private Modelos modelo;
    private RentalOffice rentalOfficeAssiged;
    public abstract Long getIdCar();
    public abstract void setIdCar(Long idCar);
    public abstract String getLicensePlate();
    public abstract void setLicensePlate(String licensePlate);
}
