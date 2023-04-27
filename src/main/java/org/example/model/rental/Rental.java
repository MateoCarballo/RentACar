package org.example.model.rental;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import java.util.Date;

public abstract class Rental {

    private int idRent;
    private Date startDate;
    private Date endDate;

    private Client client;

    //TODO creo que con que pase el rentOffice hay podría buscar el coche que alquilo y saber si está o no alquilado

    private Car car;

    private RentalOffice rentalOffice;

    public Rental(int idRent, Date startDate, Date endDate, Client client, Car car) {
        this.idRent = idRent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.client = client;
        this.car = car;
    }

    //TODO mi idea aquí es crearlo vacío y "copiar" un cliente y coche que ya existen
    // Tengo dudas con si hacer el new aquí o no, entiendo que no porque los coches y
    // clientes ya existen antes de crear
    // El alquiler.

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
