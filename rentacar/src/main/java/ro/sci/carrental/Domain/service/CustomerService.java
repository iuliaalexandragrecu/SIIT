package ro.sci.carrental.Domain.service;

import ro.sci.carrental.Domain.domain.customer.Customer;

import java.util.List;

/**
 * Created by iulia on 5/29/2017.
 */
public interface CustomerService {
    /**
     * Find all customers
     * @param customers
     * @return List <Customer>
     */

    List<Customer> findAll (Customer custumers);

    /**
     * Find customers by last name.
     * @param lastName
     * @return List</Customer>
     */
    List<Customer> findCustomerByLastName(String lastName);

    /**
     * Find customers by full name.
     * @param fullName
     * @return List</Customer>
     */
    List<Customer> findCustomerByFullName(String fullName);

    /**
     * Find customers by phone.
     * @param phone
     * @return List</Customer>
     */
    List<Customer> findCustomerByPhone(String phone);

}

