package org.example.controller;

import org.example.service.rental.FaceToFaceRentalServiceImp;
import org.example.service.rental.IRentalService;
import org.example.service.rental.WebRentalServiceImp;

public class Face2FaceRentController {
    private IRentalService service;
    public Face2FaceRentController(){ service= new FaceToFaceRentalServiceImp(); }

}
