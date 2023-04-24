package org.example.repository;

import org.example.model.Car.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ICarRepositoryTest {

    CarRepository repository = new CarRepository();


    @BeforeEach
    void setUp() {
        Car car0 = new Car("0000-AAA");
        Car car1 = new Car("1111-BBB");
        repository.addCar(car0);
        repository.addCar(car1);
    }


    @Test
    void addCar() {
        Car carA3 = new Car("3333-CCC");
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