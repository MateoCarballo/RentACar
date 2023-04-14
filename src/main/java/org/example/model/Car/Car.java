package org.example.model.Car;

public abstract class Car {
    private Long idCar;
    private String licensePLate;
    private Modelos modelo;
    public abstract Long getIdCar();
    public abstract void setIdCar(Long idCar);
    public abstract String getLicensePlate();
    public abstract void setLicensePlate(String licensePlate);
}
