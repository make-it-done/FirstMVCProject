package com.rohit.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.rohit.entity.Customer;
import com.rohit.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	public String showCustomers(Model model) {

//		List<String > customers=new ArrayList<>();
//		customers.add("rohit");
//		customers.add("kumar");
//		customers.add("gupta");

		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "customer-list";

	}

	@RequestMapping("/addNewCustomer")
	public String addCustomer(Model model) {

		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "add-customer";
	}

	@RequestMapping("/create-update-customer")
	public String createUpdateCustomer(@ModelAttribute("customer") Customer customer) {
		System.out.println(customer.toString());
		customerService.createUpdateCustomer(customer);
		return "redirect:list";
	}

	@RequestMapping("/updateCustomer")
	public String updateCustomer(@RequestParam("id") int id, Model model) {

		Customer customer = customerService.getCustomer(id);
		model.addAttribute("customer", customer);
		return "add-customer";
	}

	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("id") int id) {
		customerService.delete(id);
		return "redirect:list";
	}

}
