package ro.sci.carrental.Domain.service;

import ro.sci.carrental.Domain.domain.car.Car;
import ro.sci.carrental.Domain.repository.CarRepository;
import ro.sci.carrental.Domain.repository.CarRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iulia on 5/21/2017.
 */
public class CarServiceImpl implements CarService {

    private CarRepositoryImpl carRepository;

    public CarServiceImpl (CarRepositoryImpl carRepository){

        this.carRepository = carRepository;
    }


    public List<Car> findCarsByMake(String make) {
        List<Car> foundCars = new ArrayList<Car>();

        for (Car car : carRepository.getAll()) {
            if (car.getMake().equalsIgnoreCase(make)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    public List<Car> findCarsByMakeAndModel(String make, String model) {
        List<Car> foundCars = new ArrayList<Car>();

        for (Car car : carRepository.getAll()) {
            if ((car.getModel().equalsIgnoreCase(model)) && (car.getMake().equalsIgnoreCase(make))) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    public List<Car> findCarsByMakeModelColorAndSeats(String make, String model, String color, int seats) {
        List<Car> foundCars = new ArrayList<Car>();

        for (Car car : carRepository.getAll()) {
            if ((car.getModel().equalsIgnoreCase(model)) && (car.getMake().equalsIgnoreCase(make))
                    && (car.getColor().equalsIgnoreCase(color)) && (car.getSeats() == seats)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    public CarRepositoryImpl getCarRepository() {
        return carRepository;
    }
    }

