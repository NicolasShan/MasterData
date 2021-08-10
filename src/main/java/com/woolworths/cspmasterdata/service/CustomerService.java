package com.woolworths.cspmasterdata.service;


import com.woolworths.cspmasterdata.model.Customermaster;

import java.util.List;

public interface CustomerService {

    List<Customermaster> getAll();

    Customermaster add(Customermaster customer);

    Customermaster update(Customermaster customer);

    void delete(String id);

    Customermaster getCustomerById(String id);

}
