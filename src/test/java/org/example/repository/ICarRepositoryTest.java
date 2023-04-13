package org.example.repository;

import org.example.model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ICarRepositoryTest {

    CarRepository repository= new CarRepository();



    @BeforeEach
    void setUp(){
        Car car0=   new Car("0000-AAA");
        Car car1=   new Car("1111-BBB");
        repository.addCar(car0);
        repository.addCar(car1);
    }


    @Test
    void addCar() {
        Car car3=new Car("3333-CCC");
        repository.addCar(car3);
        Assertions.assertEquals(car3,repository.findById(3L));

    }

    @Test
    void deleteByLicensePlate() {

    }

    @Test
    void findAll() {
    }

    @Test
    void findByLicensePlate() {
    }

    @Test
    void update() {
    }
}