package org.example.repository;

import org.example.model.CarA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ICarRepositoryTest {

    CarRepository repository = new CarRepository();


    @BeforeEach
    void setUp() {
        CarA carA0 = new CarA("0000-AAA");
        CarA carA1 = new CarA("1111-BBB");
        repository.addCar(carA0);
        repository.addCar(carA1);
    }


    @Test
    void addCar() {
        CarA carA3 = new CarA("3333-CCC");
        repository.addCar(carA3);
        Assertions.assertEquals(carA3, repository.findByIdCar(3L));

    }

    @Test
    void deleteByIdCar() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findByIdCar() {
    }

    @Test
    void update() {
    }
}