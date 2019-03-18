package com.hyecheon.cardatabase.web;

import com.hyecheon.cardatabase.domain.Car;
import com.hyecheon.cardatabase.domain.CarRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @RequestMapping("/cars")
    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }
}
