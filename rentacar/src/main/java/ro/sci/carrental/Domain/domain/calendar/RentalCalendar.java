package ro.sci.carrental.Domain.domain.calendar;

import ro.sci.carrental.Domain.domain.car.Car;
import ro.sci.carrental.Domain.domain.customer.Customer;

/**
 * Created by iulia on 6/14/2017.
 */
public interface RentalCalendar {
    /**
     * Method pickupTime() simulates a car pickup by a client
     * @param car
     * @param customer
     * @param dateOfHire
     */
    void pickupTime(Car car, Customer customer, String dateOfHire);
    /**
     * Method returnTime() simulates a return of a car previously picked up
     * @param car
     * @param customer
     * @param dateOfReturn
     */
    void returnTime(Car car, Customer customer, String dateOfReturn);
}
