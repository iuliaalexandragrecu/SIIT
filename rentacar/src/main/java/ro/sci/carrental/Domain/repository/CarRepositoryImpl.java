package ro.sci.carrental.Domain.repository;

import ro.sci.carrental.Domain.domain.car.Car;
import ro.sci.carrental.Domain.domain.car.FuelType;
import ro.sci.carrental.Domain.domain.car.GearboxType;
import ro.sci.carrental.Domain.domain.car.VehicleCategory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iulia on 5/21/2017.
 */

public class CarRepositoryImpl implements CarRepository<Car> {

    private List<Car> cars = new ArrayList<Car>();

    public List<Car> getAll() {
        return cars;
    }

    public List<Car> getCarsByMake(String make) {
        return null;
    }

    public List<Car> getCarsByModel(String model) {
        return null;
    }

    public List<Car> getCarsByFuelType(FuelType fueltype) {
        return null;
    }

    public void add(Car car) {
        cars.add(car);
    }

    public void addAll(List<Car> cars) {
        cars.addAll(cars);
    }

    public void delete(Car car) {
        cars.remove(car);
    }

    public void update(Car car) {
        cars.set(cars.indexOf(car), car);

    }
}