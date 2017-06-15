package ro.sci.carrental.Domain.domain.customer;

/**
 * Created by iulia on 5/28/2017.
 */
public class Customer {
    private int ID;
    private String fullName;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private CustomerAddress customerAddress ;
    private PaymentMethod paymentMethod;


    public Customer(int ID, String lastName, String phone) {
        this.ID = ID;
        this.lastName = lastName;
        this.phone = phone;
    }

    public int getID () {return ID; }
    public void setID(int ID) {this.ID =ID; }

    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}

    public String getFirstName () {return firstName; }
    public void setFirstName(String FirstName) {this.firstName= firstName; }

    public String getLastName() {return lastName; }
    public void setLastName(String LastName) {this.lastName= lastName;}

    public String getPhone() {return phone;}
    public void setPhone(String Phone) {this.phone= phone;}

    public String getEmail() {return email;}
    public void setEmail(String Email) {this.email= email;}

    public CustomerAddress getCustomerAddress () {return customerAddress;}
    public void setCustomerAddress (CustomerAddress CustomerAddress) {this.customerAddress= customerAddress; }

    public PaymentMethod getPaymentMethod () {return paymentMethod;}
    public void setPaymentMethod (PaymentMethod paymentMethod) {this.paymentMethod= paymentMethod;}
}
