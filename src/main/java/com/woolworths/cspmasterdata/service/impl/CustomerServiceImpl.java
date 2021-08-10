package com.woolworths.cspmasterdata.service.impl;

import com.woolworths.cspmasterdata.model.Customermaster;
import com.woolworths.cspmasterdata.repository.CustomermasterRepository;
import com.woolworths.cspmasterdata.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomermasterRepository customerRepository;

	@Override
	public List<Customermaster> getAll() {
		return this.customerRepository.findAll();
	}

	@Override
	public Customermaster add(Customermaster customer) {
		return this.customerRepository.save(customer);
	}

	@Override
	public Customermaster update(Customermaster customer) {
		Optional<Customermaster> optCustomer = this.customerRepository.findById(customer.getCustomerno());
		if (!optCustomer.isPresent())
			return null;
		Customermaster repCustomer = optCustomer.get();
		return this.customerRepository.save(repCustomer);
	}

	@Override
	public void deleteById(String id) {
		this.customerRepository.deleteById(id);
	}

	@Override
	public void delete(Customermaster customer) {
		this.customerRepository.deleteById(customer.getCustomerno());
	}

	@Override
	public Customermaster getCustomerById(String id) {
		return this.customerRepository.findById(id).orElse(null);
	}

	@Override
	public Customermaster get(Customermaster customer) {
		return this.customerRepository.findById(customer.getCustomerno()).orElse(null);
	}

}
