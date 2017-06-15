package ro.sci.carrental.Domain.domain.customer;

/**
 * Created by iulia on 5/28/2017.
 */
public class CustomerAddress {
    private String streetName;
    private String streetNumber;
    private String postalCode;
    private String county;
    private String country;

    public CustomerAddress(String streetName, String streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public String getStreetName () {return streetName; }
    public void setStreetName(String streetName) {this.streetName =streetName; }

    public String getStreetNumber () {return streetNumber; }
    public void setStreetNumber (String streetNumber) {this.streetNumber= streetNumber; }

    public String getPostalCode() {return postalCode; }
    public void setPostalCode(String postalCode) {this.postalCode= postalCode;}

    public String getCounty() {return county;}
    public void setCounty(String county) {this.county= county;}

    public String getCountry() {return country;}
    public void setCountry(String country) {this.country= country;}

}
