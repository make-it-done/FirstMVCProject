package com.rohit.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rohit.dao.CustomerDAO;
import com.rohit.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping("/list")
	public String showCustomers(Model model) {

//		List<String > customers=new ArrayList<>();
//		customers.add("rohit");
//		customers.add("kumar");
//		customers.add("gupta");

		List<Customer> customers = customerDAO.getCustomers();
		model.addAttribute("customers", customers);
		return "customer-list";

	}

}
