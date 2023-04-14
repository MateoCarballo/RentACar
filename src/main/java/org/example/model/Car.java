package org.example.model;

public class Car {

    Long idCar=-1L;
    String licensePlate;

    Modelos modelo;

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
// TODO esto se puede hacer así? Mi idea es que Modelo sea una enumeración y cojas
//  la que necesites para crear cada Modelo de coche con su precio y su nombre en conjunto
//  solucionariamos así la relacion (1--*)?
    public void setLicensePlate(String licensePlate,Modelos modelo) {
        this.licensePlate = licensePlate;
        this.modelo= Modelos.MODELO_A;

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
