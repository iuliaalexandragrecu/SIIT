package ro.sci.carrental.Domain.service;

import ro.sci.carrental.Domain.domain.car.Car;

import java.util.List;

/**
 * Created by iulia on 5/29/2017.
 */
public interface CarService {
    /**
     * Find the same make car in the system
     * @param make car make
     * @return List<car>
     */
    List<Car> findCarsByMake (String make);

    /**
     * Find the same make and model in the system
     * @param make car make
     * @param model car model
     * @return List<car>
     */
    List<Car> findCarsByMakeAndModel (String make, String model);

    /**
     * Find the same make, model, color and number of seats in the system
     * @param make car make
     * @param model car model
     * @param color car color
     * @param seats car seats
     */
    List<Car> findCarsByMakeModelColorAndSeats (String make, String model, String color, int seats);
}
