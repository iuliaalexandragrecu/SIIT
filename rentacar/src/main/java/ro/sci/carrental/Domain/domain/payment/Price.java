package ro.sci.carrental.Domain.domain.payment;

/**
 * Created by iulia on 7/20/2017.
 */
public class Price {
    private int noOfDays;
    private int pricePerDay;

    public Price(int noOfDays, int pricePerDay) {
        this.noOfDays = noOfDays;
        this.pricePerDay = pricePerDay;
    }

    public void checkPrice() throws IllegalArgumentException{
        try{
            if (noOfDays<0) throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e){
            System.out.println("Number of days can not be negative");
        }
    }
        public double calculatedPrice(int noOfDays, int pricePerDay) {
            double calculatedPrice;
            calculatedPrice = noOfDays * pricePerDay;
            return calculatedPrice;
        }
}




