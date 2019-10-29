package com.rohit.dao;

import java.util.List;

import com.rohit.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void createUpdateCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void delete(int id);

}
