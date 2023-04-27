package org.example.controller;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import org.example.service.rental.IRentalService;
import org.example.service.rental.WebRentalServiceImp;

import java.util.Date;

public class WebRentController {
    private IRentalService service;
    public WebRentController(){ service= new WebRentalServiceImp(); }


    public void createRent(Client client, Car car, RentalOffice rOffice, Date starDate, Date endDate){

    }
    public void modifyRent(int idRental) {

    }

    public void searchRent(int idWebRent){

    }
    //TODO estas dos lineas de codigo de abajo no acabo de entenderlas muy bien las verdad
    //
    /*
    private IRentalService service;
    public WebRentController(){ service= new WebRentalServiceImp(); }
     */


}
