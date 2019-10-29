package com.rohit.service;

import java.util.List;
import com.rohit.entity.Customer;
public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void createUpdateCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void delete(int id);

}
