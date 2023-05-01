package org.example.repository;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import org.example.model.rental.Rental;
import org.example.model.rental.WebRental;

import java.util.ArrayList;
import java.util.Date;

public class WebRentalRepository implements IRentalRepository {

    private ArrayList<WebRental> wRentals;

    public WebRentalRepository(){
        wRentals =new ArrayList<>();
    }

    @Override
    public void createRent(Date startDate, Date endDate, Client client, Car car, RentalOffice rentalOffice) {
        wRentals.add(new WebRental(nextIdAvailable(),startDate,endDate,client,car,rentalOffice));
    }

    @Override
    public void modifyRent(int idRental) {
        for (WebRental wr : wRentals) {
            if(wr.getIdRent()==idRental){
                /*
                Codigo que quisieramos ejecutar amplicar una fecha de entrega
                Modificar precio, etc.
                 */
            }
        }
    }

    @Override
    public Rental searchRent(int idRent) {
        if (!isEmpty()) {
            for (WebRental rental : wRentals) {
                if (rental.getIdRent() == idRent) {
                    return rental;
                }
                return null;
            }
        }
        return null;
    }
    public int nextIdAvailable() {
        if (!isEmpty())
            return wRentals.get(wRentals.size() - 1).getIdRent() + 1;
        else return 1;
    }
    public boolean isEmpty() {
        if (wRentals.size() == 0) {
            return true;
        }
        return false;
    }
}
