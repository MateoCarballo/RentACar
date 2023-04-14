package org.example.model.Car;

public class CarA extends Car {

    private Long idCar=-1L;
    private String licensePlate;

    private Modelos modelo;

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

    public CarA(){}

    public CarA(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public CarA(String licensePlate, Long idCar,Modelos modelo){
        this.licensePlate=licensePlate;
        this.idCar=idCar;
        this.modelo= Modelos.MODELO_A;
    }
}
