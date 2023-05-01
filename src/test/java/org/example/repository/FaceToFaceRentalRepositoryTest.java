package org.example.repository;

import org.example.model.Car.Car;
import org.example.model.Client;
import org.example.model.RentalOffice;
import org.example.model.rental.FaceToFaceRental;
import org.example.view.Dialog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FaceToFaceRentalRepositoryTest {

FaceToFaceRentalRepository repository;
ClientRepository clientRepository;
CarRepository carRepository;

    @BeforeEach
    void setUp() {
        repository = new FaceToFaceRentalRepository();
        clientRepository= new ClientRepository();
        carRepository = new CarRepository();

        Client client0 = new Client("00000000A", "Aaaaaa", "Aaaaaa");
        Client client1 = new Client("11111111B", "Bbbbbb", "Bbbbbb");
        client0.setId(0L);
        client1.setId(1L);
        Car car0 = new Car("0000-AAA");
        Car car1 = new Car("1111-BBB");
        car0.setIdCar(0L);
        car0.setIdCar(1L);
        RentalOffice rOffice0 = new RentalOffice("addres0",0);
        RentalOffice rOffice1 = new RentalOffice("addres1",100);

        FaceToFaceRental fRental0 = new FaceToFaceRental(0,convertirStringDate("01/01/01"),convertirStringDate("01/01/01"),client0,car0,rOffice0);
        FaceToFaceRental fRental1 = new FaceToFaceRental(1,convertirStringDate("02/02/02"),convertirStringDate("02/02/02"),client1,car1,rOffice1);

    }

    @Test
    void createRent() {
        Client client2 = new Client("33333333A", "Cccccc", "Bbbbb");
        Car car2 = new Car("2222-CCC");
        RentalOffice rOffice2 = new RentalOffice("addres0",300);
        FaceToFaceRental rent2 = new FaceToFaceRental(2,Dialog.convertirStringDate("03/03/03"),Dialog.convertirStringDate("03/03/03"), client2,car2,rOffice2);
        repository.createRent(Dialog.convertirStringDate("03/03/03"),Dialog.convertirStringDate("03/03/03"), client2,car2,rOffice2);

        //Assertions.assertEquals((repository.searchRent(2)).getIdRent(),2);

        Assertions.assertEquals(repository.searchRent(0).getIdRent(),0L);

        //Assertions.assertEquals((repository.searchRent(2)).getClient(),client2);

        //Assertions.assertEquals((repository.searchRent(2)).getRentalOffice(),rOffice2);
    }

    @Test
    void modifyRent() {
        //modifico nombre en cliente por la letra "z"
        //modifico las letras de la placa de matricula por "z"
        //modifico la direccion de la oficicna por "z"
    }

    @Test
    void searchRent() {
    }
    public static Date convertirStringDate(String entrada){
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
        Date fecha = null;
        while (fecha == null) {
            try {
                fecha = formato.parse(entrada);
            } catch (ParseException e) {
                System.out.println("El formato de la fecha no es válido.");
            }
        }
        return fecha;
    }
}
