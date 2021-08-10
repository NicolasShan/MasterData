package com.woolworths.cspmasterdata.service;


import com.woolworths.cspmasterdata.model.Customermaster;

import java.util.List;

public interface CustomerService {

    List<Customermaster> getAll();

    Customermaster getCustomerById(String id);

    Customermaster get(Customermaster customer);

    Customermaster add(Customermaster customer);

    Customermaster update(Customermaster customer);

    void deleteById(String id);

    void delete(Customermaster customer);

}
