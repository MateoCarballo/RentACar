package org.example.model;

public class Car {

    Long idCar=-1L;
    String licensePlate;

    public Long getIdCar() {
        return idCar;
    }

    public void setIdCar(Long idCar) {
        this.idCar = idCar;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Car(){}

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Car(String licensePlate, Long idCar){
        this.licensePlate=licensePlate;
        this.idCar=idCar;
    }
}
