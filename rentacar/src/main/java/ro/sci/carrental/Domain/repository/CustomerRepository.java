package ro.sci.carrental.Domain.repository;

/**
 * Created by iulia on 5/29/2017.
 */

import ro.sci.carrental.Domain.domain.customer.Customer;

import java.util.List;

/**
 * repository interface for Customer, this will help managing all persistence operations related to Customer.
 *
 */
public interface CustomerRepository {
    /**
     * Get all Customer in the system
     * @return List<Customer>
     */
    List<Customer> getAll();

    /**
     * Return customers by ID
     * @return List</Customer>
     */
    List<Customer> getCustomerByID ();

    /**
     * Return customers by last name
     * @return List<Customer>
     */
    List<Customer> getCustomerByLastName();

    /**
     * Return customer by phone number
     * @return List<Customer>
     */

    List<Customer> getCustomerByPhone();

    /**
     * Add a customer in the system
     */
    void add (Customer customer);

    /**
     * Add all customers in the system
     */

    void addAll (List<Customer> customers);

    /**
     * Remove a customer from the system
     */
    void delete (Customer customer);

    /**
     * Update customer details
     */
    void update (Customer customer);
}
