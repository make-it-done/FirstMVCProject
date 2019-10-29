package com.rohit.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.dao.CustomerDAO;
import com.rohit.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		return customerDAO.getCustomers();
	}
	@Override
	@Transactional
	public void createUpdateCustomer(Customer customer) {
		customerDAO.createUpdateCustomer(customer);
	}
	@Override
	@Transactional
	public Customer getCustomer(int id) {
		Customer customer=customerDAO.getCustomer(id);
		return customer;
	}
	@Override
	@Transactional
	public void delete(int id) {
		customerDAO.delete(id);
	}

}
