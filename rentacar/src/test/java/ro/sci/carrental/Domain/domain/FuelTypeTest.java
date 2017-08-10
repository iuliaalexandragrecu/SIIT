package ro.sci.carrental.Domain.domain;

import org.junit.Test;
import ro.sci.carrental.Domain.domain.car.FuelType;

/**
 * Created by iulia on 7/21/2017.
 */
public class FuelTypeTest {
    @Test
    public void testCreateInvalidFuelType() throws IllegalArgumentException {
        try {
            FuelType fuelType= FuelType.valueOf("none");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid fuel type");
        }

    }

}