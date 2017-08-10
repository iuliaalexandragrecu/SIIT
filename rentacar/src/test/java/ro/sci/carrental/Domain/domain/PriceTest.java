package ro.sci.carrental.Domain.domain;

import org.junit.Test;
import ro.sci.carrental.Domain.domain.Payment.Price;

import static org.junit.Assert.assertEquals;

/**
 * Created by iulia on 7/21/2017.
 */
public class PriceTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testCalculatePrice() {
        //given
        Price p1 = new Price(5, 20);
        // then
        double calculatedPrice = p1.calculatedPrice(5, 20);

        //evaluate
        assertEquals(100, calculatedPrice, DELTA);

    }

    @Test

    public void testCalculatePrice2() {
        //given
        Price p2 = new Price(0, 0);
        // then
        double calculatedPrice = p2.calculatedPrice(0, 0);

        //evaluate
        assertEquals(0, calculatedPrice, DELTA);
    }

    @Test
    public void testCreateInvalidnoOfDays() throws IllegalArgumentException {
        try {
            Price p3 = new Price(-1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid number of days. Days should be positive and starting with 1");
        }
    }

    @Test
    public void testCreateInvalidpricePerDay() throws IllegalArgumentException {
        try {
            Price p4 = new Price(5, -10);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid price per Day");
        }
    }
}