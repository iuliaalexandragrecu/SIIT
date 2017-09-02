package ro.sci.carrental.Domain.domain.calendar;

import ro.sci.carrental.Domain.domain.car.Car;
import ro.sci.carrental.Domain.domain.customer.Customer;

/**
 * Created by iulia on 6/14/2017.
 */
public class RentalCalendarImpl implements RentalCalendar {
    public void pickupTime(Car car, Customer customer, String dateOfHire) {
        System.out.println("Autoturismul" + car.getMake() + " va fi ridicat de catre clientul "
                + customer.getLastName() + " la data si ora " + dateOfHire);
        car.setOnLoan(true);

    }

    public void returnTime(Car car, Customer customer, String dateOfReturn) {
        System.out.println("Autoturismul" + car.getMake() + " va fi returnat de catre clientul "
                + customer.getLastName() + " la data si ora " + dateOfReturn);
        car.setOnLoan(false);

    }
}
