package com.woolworths.cspmasterdata.service;


import com.woolworths.cspmasterdata.model.Customermaster;

import java.util.List;

public interface CustomerService {
	
	public List<Customermaster> getAll();

	public Customermaster add(Customermaster customer);

	public Customermaster update(Customermaster customer);

	public void delete(long id);

	public Customermaster getCustomerById(long id);

}
