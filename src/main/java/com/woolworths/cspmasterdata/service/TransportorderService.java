package com.woolworths.cspmasterdata.service;

import com.woolworths.cspmasterdata.model.Transportorder;

import java.util.List;

public interface TransportorderService {

    List<Transportorder> getAll();

    Transportorder getTransportorderById(String id);

    Transportorder get(Transportorder transportorder);

    Transportorder add(Transportorder transportorder);

    Transportorder update(Transportorder transportorder);

    void deleteById(String id);

    void delete(Transportorder transportorder);
}
