package org.example.model.rental;

import org.example.model.Car.Car;
import org.example.model.Client;

import java.util.Date;

public abstract class Rental {

    private int idRent;
    private Date startDate;
    private Date endDate;

    private Client client;

    private Car carA;

    public Rental(int idRent, Date startDate, Date endDate, Client client, Car car) {
        this.idRent = idRent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.client = client;
        this.carA = carA;
    }

    //TODO mi idea aqui es crearlo vacio y "copiar" un cliente y coche que ya existen
    // Tengo dudas con si hacer el new aqui o no, entiendo que no porque los coches y clientes ya existen antes de crear
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
