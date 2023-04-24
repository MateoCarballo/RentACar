package org.example.service.rental;

import org.example.model.Client;
import org.example.model.rental.Rental;

public interface IWebRental {

    void rent (Client client, Car car);
    void endRent(Client client, Car car);
    //TODO dudo si tengo que tener una para cada clase
    // o puedo ponerlo asi *void updateRent(Rental rental); *
    void updateRent(Rental rental);
}
