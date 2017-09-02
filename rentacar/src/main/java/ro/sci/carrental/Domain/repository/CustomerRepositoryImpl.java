package ro.sci.carrental.Domain.repository;

import ro.sci.carrental.Domain.domain.customer.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iulia on 5/29/2017.
 */
public class CustomerRepositoryImpl implements CustomerRepository<Customer> {

    private List<Customer> customers = new ArrayList<Customer>();

    public List<Customer> getAll() {
        return customers;
    }

    public List<Customer> getCustomerByID() {return null;}

    public List<Customer> getCustomerByLastName() {
        return null;
    }

    public List<Customer> getCustomerByPhone() {return null;}

    public void add(Customer customer) {customers.add(customer);}

    public void addAll(List<Customer> customers) {customers.addAll(customers);}

    public void delete(Customer customer) {customers.remove (customer);}

    public void update(Customer customer) {customers.set(customers.indexOf(customer), customer);}
}
