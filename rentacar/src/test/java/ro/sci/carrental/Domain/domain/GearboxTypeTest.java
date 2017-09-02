package ro.sci.carrental.Domain.domain;

import org.junit.Test;
import ro.sci.carrental.Domain.domain.car.GearboxType;

/**
 * Created by iulia on 7/21/2017.
 */
public class GearboxTypeTest {
    @Test
    public void testCreateInvalidGearBoxType() throws IllegalArgumentException {
        try {
            GearboxType gearboxType = GearboxType.valueOf("12kshdkdm");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid gearbox type");
        }

    }
}