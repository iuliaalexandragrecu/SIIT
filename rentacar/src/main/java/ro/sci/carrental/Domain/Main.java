package ro.sci.carrental.Domain;

import ro.sci.carrental.Domain.domain.car.Car;
import ro.sci.carrental.Domain.domain.customer.Customer;
import ro.sci.carrental.Domain.reader.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by iulia on 5/21/2017.
 */
public abstract class Main {

    private static final Logger LOGGER = Logger.getLogger("Cars");

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        File file = new File("carsinput.txt");
        EntityReader ent = new EntityReader();
        List<String> lines = ent.readLines(file);
        CarConvertor carConvertor = new CarConvertor();
        int i = 0;
        for (String line : lines) {
            i++;
            Car car = null;
            try {
                car = carConvertor.convert(line);
                System.out.println(car);
            } catch (InvalidEntityException e) {

                System.out.println("invalid car for: [" + line + "] at line: " + i);
            }
        }

        List<Customer> customerList = new ArrayList<>();
        File file1 = new File("customerinput.txt");
        EntityReader ent1 = new EntityReader();
        List<String> lines1 = ent1.readLines(file1);
        CustomerConverter customerConverter = new CustomerConverter();
        int j = 0;
        for (String line1 : lines1) {
            j++;
            Customer customer = null;
            try {
                customer = customerConverter.convert(line1);
                System.out.println(customer);
            } catch (InvalidEntityException e) {

                System.out.println("invalid car for: [" + line1 + "] at line: " + j);
            }
        }
    }

        /**
        LOGGER.info("Start main");

        List<Car> carList = new ArrayList<Car>();

        //initializam masini
        Car volkswagenJetta = new Car("Volkswagen","Jetta",FuelType.Diesel  );
        Car fordFocus = new Car("Ford", "Focus", FuelType.Electric);
        Car renaultMegane = new Car("Renault","Megane", FuelType.Petrol );

        //adaugam masini
        carList.add(volkswagenJetta);
        carList.add(fordFocus);
        carList.add(renaultMegane);

        List<Customer> customerList = new ArrayList<Customer>();
        //initializam clienti
        Customer customer1 = new Customer("Pop", "0744658456");
        Customer customer2 = new Customer("Moldovan", "0744632456");
        Customer customer3 = new Customer("Marginean","0744658986");

        //adaugam clienti
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        LOGGER.info("End main");

        searchCarList(carList);
        searchCustomerList(customerList);

    }*/

    public static void searchCarList(List<Car> carList) {

        LOGGER.log(Level.INFO, "Lista autoturimelor este:\n");

        for (Car car : carList) {
            System.out.println(car.getMake() + " " + car.getModel() + " " + car.getFuelType());
        }
    }


    public static void searchCustomerList(List<Customer> customerList) {
        LOGGER.log(Level.INFO,"Lista clientilor este:\n");

        for (Customer customer : customerList) {
            System.out.println(customer.getLastName() + " " + customer.getPhone());
        }
        System.out.println();
    }
}


