package org.example.service.rental;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import org.example.repository.FaceToFaceRentalRepository;
import org.example.repository.IRentalRepository;
import java.util.Date;

public class FaceToFaceRentalServiceImp implements IRentalService{

    private IRentalRepository repository;
    public FaceToFaceRentalServiceImp() {
        repository = new FaceToFaceRentalRepository();
    }
    @Override
    public void createRent(Client client, Car car, RentalOffice rentalOffice, Date startDate, Date endDate) {

    }
    @Override
    public void modifyRent(int idRental, RentalOffice rentalOffice) {

    }
}
