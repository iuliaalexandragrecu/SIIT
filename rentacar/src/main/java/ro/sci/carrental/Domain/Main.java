package ro.sci.carrental.Domain;

import ro.sci.carrental.Domain.domain.car.Car;
import ro.sci.carrental.Domain.domain.car.FuelType;
import ro.sci.carrental.Domain.domain.customer.Customer;
import ro.sci.carrental.Domain.repository.CarRepository;
import ro.sci.carrental.Domain.repository.CarRepositoryImpl;
import ro.sci.carrental.Domain.repository.CustomerRepository;
import ro.sci.carrental.Domain.repository.CustomerRepositoryImpl;
import ro.sci.carrental.Domain.service.CarService;
import ro.sci.carrental.Domain.service.CarServiceImpl;

import javax.jws.soap.SOAPMessageHandlers;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by iulia on 5/21/2017.
 */
public class Main {

    public static void main(String[] args) {

        //initializam masini
        Car volkswagenJetta = new Car("Volkswagen", "Jetta", FuelType.Diesel);
        Car fordFocus = new Car("Ford", "Focus", FuelType.Electric);
        Car renaultMegane = new Car("Renault", "Megane", FuelType.Petrol);

        CarRepositoryImpl carRepository = new CarRepositoryImpl();

        //adaugam masini
        carRepository.add(volkswagenJetta);
        carRepository.add(fordFocus);
        carRepository.add(renaultMegane);

        //initializam clienti
        Customer customer1 = new Customer ("Pop", "0744658456");
        Customer customer2 = new Customer ("Moldovan", "0744632456");
        Customer customer3 = new Customer ("Marginean", "0744658986");

        CustomerRepositoryImpl customerRepository= new CustomerRepositoryImpl();

        //adaugam clienti
        customerRepository.add(customer1);
        customerRepository.add(customer2);
        customerRepository.add(customer3);





    }

}