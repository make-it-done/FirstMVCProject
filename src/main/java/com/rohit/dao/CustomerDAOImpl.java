package com.rohit.dao;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rohit.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		// session.beginTransaction();
		List<Customer> customers = session.createQuery("From Customer").getResultList();
		// session.getTransaction().commit();
		return customers;
	}

	@Override
	public void createUpdateCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
		return ;
	}

	@Override
	public Customer getCustomer(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}

	@Override
	public void delete(int id) {
		Session session =sessionFactory.getCurrentSession();
		Customer customer = getCustomer(id);
		session.delete(customer);
		return ;
	}

}
