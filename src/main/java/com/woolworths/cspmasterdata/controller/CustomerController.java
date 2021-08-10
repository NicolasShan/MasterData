package com.woolworths.cspmasterdata.controller;

import com.woolworths.cspmasterdata.model.Customermaster;
import com.woolworths.cspmasterdata.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping(value = "/customer")
	public ResponseEntity<Object> getAllCustomers() {
		List<Customermaster> customers = this.customerService.getAll();
		return ResponseEntity.ok(customers);
	}

	@GetMapping(value = "/customer/{id}")
	public ResponseEntity<Object> getCustomerById(@PathVariable("id") String id) {
		Customermaster customer = this.customerService.getCustomerById(id.trim());
		return ResponseEntity.ok(customer);
	}

	@GetMapping(value = "/customer")
	public ResponseEntity<Object> getCustomer(@RequestBody Customermaster customer) {
		Customermaster getcustomer = this.customerService.get(customer);
		return ResponseEntity.ok(getcustomer);
	}

	@PostMapping(value = "/customer")
	public ResponseEntity<Object> addCustomer(@RequestBody Customermaster customer) {
		Customermaster created = this.customerService.add(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(created);
	}

	@PutMapping(value = "/customer")
	public ResponseEntity<Object> updateCustomer(@RequestBody Customermaster customer) {
		Customermaster updated = this.customerService.update(customer);
		return ResponseEntity.ok(updated);
	}

	@DeleteMapping(value = "/customer")
	public ResponseEntity<Object> deleteCustomer(@RequestBody Customermaster customer) {
		this.customerService.delete(customer);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping(value = "/customer/{id}")
	public ResponseEntity<Object> deleteCustomerById(@PathVariable("id") String id) {
		this.customerService.deleteById(id.trim());
		return ResponseEntity.ok().build();
	}
}
