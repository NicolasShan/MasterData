package com.woolworths.cspmasterdata.service.impl;

import com.woolworths.cspmasterdata.model.Customermaster;
import com.woolworths.cspmasterdata.repository.CustomermasterRepository;
import com.woolworths.cspmasterdata.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@CacheConfig(cacheNames = "customerCache")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomermasterRepository customerRepository;

	@Cacheable(cacheNames = "customers")
	@Override
	public List<Customermaster> getAll() {
		return this.customerRepository.findAll();
	}

	@CacheEvict(cacheNames = "customers", allEntries = true)
	@Override
	public Customermaster add(Customermaster customer) {
		return this.customerRepository.save(customer);
	}

	@CacheEvict(cacheNames = "customers", allEntries = true)
	@Override
	public Customermaster update(Customermaster customer) {


//		Optional<Customermaster> optCustomer = this.customerRepository.findById(customer.getId());
//		if (!optCustomer.isPresent())
//			return null;
//		Customermaster repCustomer = optCustomer.get();
		return this.customerRepository.save(customer);
	}

	@Caching(evict = { @CacheEvict(cacheNames = "customer", key = "#id"),
			@CacheEvict(cacheNames = "customers", allEntries = true) })
	@Override
	public void delete(long id) {
		this.customerRepository.deleteById(id);
	}

	@Cacheable(cacheNames = "customer", key = "#id", unless = "#result == null")
	@Override
	public Customermaster getCustomerById(long id) {
		return this.customerRepository.findById(id).orElse(null);
	}

}
