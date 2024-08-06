package edu.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.demo.entities.Customer;
import edu.demo.repos.ProductRepository;

@CrossOrigin("*")
@RestController
public class CustomerControllers {

	 @Autowired
	 private ProductRepository repo;
	 
	 
	 @GetMapping ("/allCustomers")
	 public List<Customer> getProduct()
	 {
		 return repo.findAll();
	 }
	 
	 
	 @PostMapping ("/regCustomer")
	 public String addProduct(@RequestBody Customer customer)
	 {
		 String res;
		 try {
			 repo.save(customer);
			 res="Success";
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 res=e.getMessage();
		 }
		 return res;
	 }
	 
	 @PatchMapping ("/customer/updateUsername")
	 public String updateUsername(@RequestBody Customer customer)
	 {
		 String res;
		 try {
			 repo.save(customer);
			 res="Success";
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 res=e.getMessage();
		 }
		 return res;
	 
}
	 @PatchMapping ("/customer/updatePassword")
	 public String updatePassword(@RequestBody Customer customer)
	 {
		 String res;
		 try {
			 repo.save(customer);
			 res="Success";
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 res=e.getMessage();
		 }
		 return res;
}
}

