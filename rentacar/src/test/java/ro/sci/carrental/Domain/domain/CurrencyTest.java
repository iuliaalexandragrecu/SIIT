package ro.sci.carrental.Domain.domain;

import org.junit.Test;
import ro.sci.carrental.Domain.domain.payment.Currency;

/**
 * Created by iulia on 7/20/2017.
 */
public class CurrencyTest {
    @Test
    public void testCreateInvalidCurrency() throws IllegalArgumentException {
        try {
            Currency currency = Currency.valueOf("dhsjsks");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid currency");
        }

    }
}