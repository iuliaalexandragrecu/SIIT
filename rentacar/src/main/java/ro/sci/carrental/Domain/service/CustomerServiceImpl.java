package ro.sci.carrental.Domain.service;

import ro.sci.carrental.Domain.domain.customer.Customer;
import ro.sci.carrental.Domain.repository.CustomerRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iulia on 5/29/2017.
 */
public class CustomerServiceImpl implements CustomerService<Customer> {

    private CustomerRepositoryImpl customerRepository;

    public CustomerServiceImpl(CustomerRepositoryImpl customerRepository) {

        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll(Customer customers) {return null;}

    public List<Customer> findCustomerByLastName(String lastName) {
        List<Customer> foundCustomers = new ArrayList<Customer>();

        for (Customer customer : customerRepository.getAll()) {
            if (customer.getLastName().equalsIgnoreCase(lastName)) {
                foundCustomers.add(customer);
            }
        }

        return foundCustomers;
    }

    public List<Customer> findCustomerByFullName(String fullName) {
        List<Customer> foundCustomers = new ArrayList<Customer>();

        for (Customer customer : customerRepository.getAll()) {
            if ((customer.getFullName().equalsIgnoreCase(fullName))) {
                foundCustomers.add(customer);
            }
    }
        return foundCustomers;
    }

    public List<Customer> findCustomerByPhone(String phone) {
        List<Customer> foundCustomers = new ArrayList<Customer>();

        for (Customer customer : customerRepository.getAll()) {
            if ((customer.getPhone().equalsIgnoreCase(phone))) {
                foundCustomers.add(customer);
            }
        }

        return foundCustomers;
    }

    public CustomerRepositoryImpl getCustomerRepository(){return customerRepository; }
}



