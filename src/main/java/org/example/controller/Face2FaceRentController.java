package org.example.controller;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import org.example.service.rental.FaceToFaceRentalServiceImp;
import org.example.service.rental.IRentalService;
import org.example.service.rental.WebRentalServiceImp;

import java.util.Calendar;
import java.util.Date;

public class Face2FaceRentController {
    private IRentalService service;
    public Face2FaceRentController(){ service= new FaceToFaceRentalServiceImp(); }

    public void createRent(Client client, Car car, RentalOffice rOffice, Date starDate, Date endDate){

    }
    public void modifyRent(int idRental) {

    }

    public void searcchRent(int idF2FRent){

    }



}
