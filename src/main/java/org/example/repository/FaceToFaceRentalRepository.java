package org.example.repository;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import org.example.model.rental.FaceToFaceRental;
import org.example.model.rental.Rental;
import org.example.model.rental.WebRental;

import java.util.ArrayList;
import java.util.Date;

public class FaceToFaceRentalRepository implements IRentalRepository{

    private ArrayList<FaceToFaceRental> fRentals;

    public FaceToFaceRentalRepository(){
        fRentals =new ArrayList<>();
    }

       @Override
    public void createRent(Date startDate, Date endDate, Client client, Car car, RentalOffice rentalOffice) {
        FaceToFaceRental f2fRental=(new FaceToFaceRental(nextIdAvailable(),startDate,endDate,client,car,rentalOffice));
        addRent(f2fRental);
    }
    public void addRent(FaceToFaceRental f2fRental){
        fRentals.add(f2fRental);
    }

    @Override
    public void modifyRent(int idRental) {
            for (FaceToFaceRental fr : fRentals) {
                if(fr.getIdRent()==idRental){
                /*
                Codigo que quisieramos ejecutar amplicar una fecha de entrega
                Modificar precio, etc.

                Para simplicar si lo encuentra cambia el nombre de todos los objetos
                dentro por la letra "Z"
                 */
                }
            }
    }

    @Override
    public Rental searchRent(int idRent) {
        if (!isEmpty()) {
            for (FaceToFaceRental frental : fRentals) {
                if (frental.getIdRent() == idRent) {
                    return frental;
                }
                return null;
            }
        }
        return null;
    }

    public int nextIdAvailable() {
        if (isEmpty())
            return fRentals.get(fRentals.size() - 1).getIdRent() + 1;
        else return 1;
    }
    public boolean isEmpty() {
        if (fRentals.size() == 0) {
            return false;
        }
        return true;
    }

}
