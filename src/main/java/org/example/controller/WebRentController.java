package org.example.controller;

import org.example.service.rental.IRentalService;
import org.example.service.rental.WebRentalServiceImp;

public class WebRentController {
    private IRentalService service;
    public WebRentController(){ service= new WebRentalServiceImp(); }

    //TODO estas dos lineas de codigo de abajo no acabo de entenderlas muy bien las verdad
    //
    /*
    private IRentalService service;
    public WebRentController(){ service= new WebRentalServiceImp(); }
     */


}
