package org.example.repository;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import org.example.model.rental.Rental;
import org.example.model.rental.WebRental;

import java.util.ArrayList;
import java.util.Date;

public class WebRentalRepository implements IRentalRepository {

    private ArrayList<WebRental> Rentals;

    public WebRentalRepository(){
        Rentals=new ArrayList<>();
    }
    @Override
    public void createRent(Client client, Car car, RentalOffice rentalOffice, Date startDate, Date endDate) {
        Rentals.add(new WebRental(nextIdAvailable(),startDate,endDate,client,car,rentalOffice));
    }

    @Override
    public void modifyRent(int idRental) {
        for (WebRental wr : Rentals) {
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
            for (int i = 0; i < Rentals.size(); i++) {
                if(Rentals.get(i).getIdRent()==idRent){
                    return Rentals.get(i);
                }
                return null;
            }
        }
        return null;
    }
    public int nextIdAvailable() {
        if (!isEmpty())
            return Rentals.get(Rentals.size() - 1).getIdRent() + 1;
        else return 1;
    }
    public boolean isEmpty() {
        if (Rentals.size() == 0)
            return true;
        return false;
    }
}
