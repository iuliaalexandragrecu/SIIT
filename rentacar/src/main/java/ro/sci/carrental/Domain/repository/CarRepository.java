package ro.sci.carrental.Domain.repository;

/**
 * Created by iulia on 5/28/2017.
 */

import ro.sci.carrental.Domain.domain.car.Car;
import ro.sci.carrental.Domain.domain.car.FuelType;
import ro.sci.carrental.Domain.domain.car.GearboxType;
import ro.sci.carrental.Domain.domain.car.VehicleCategory;

import java.util.List;

/**
 * repository interface for car, this will help managing all persistence operations related to car.
 *
 */
public interface CarRepository<Car> {
    /**
     * Get All cars in the system
     * @return List<Car>
     */
    List<Car> getAll();
    /**
     * Return cars of a certain maker
     * @param make
     * @return List<Car>
     */
    List<Car> getCarsByMake (String make);

    /**
     * Return cars by model
     * @param model
     * @return List<Car>
     */
    List<Car> getCarsByModel (String model);

    /**
     * Return cars by fuel type
     * @param fueltype
     * @return List<Car>
     */
    List<Car> getCarsByFuelType (FuelType fueltype);

    /**
     * Add a car in the system
     * @param car
     */
    void add (Car car);

    /**
     * Add all cars in the system
     * @param cars
     */
    void addAll (List<Car> cars);

    /**
     * Delete a car from the system
     * @param car
     */
    void delete (Car car);

    /**
     * Updates car information in the system
     * @param car
     */
    void update (Car car);
}
