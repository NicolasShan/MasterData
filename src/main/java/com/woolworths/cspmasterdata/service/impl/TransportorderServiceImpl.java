package com.woolworths.cspmasterdata.service.impl;

import com.woolworths.cspmasterdata.model.Transportorder;
import com.woolworths.cspmasterdata.repository.TransportorderRepository;
import com.woolworths.cspmasterdata.service.TransportorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TransportorderServiceImpl implements TransportorderService {

    @Autowired
    private TransportorderRepository transportorderRepository;

    @Override
    public List<Transportorder> getAll() {
        return transportorderRepository.findAll();
    }

    @Override
    public Transportorder getTransportorderById(String id) {
        return transportorderRepository.getById(id);
    }

    @Override
    public Transportorder get(Transportorder transportorder) {
        return transportorderRepository.getById(transportorder.getTransportorderid());
    }

    @Override
    public Transportorder add(Transportorder transportorder) {
        return this.transportorderRepository.save(transportorder);
    }

    @Override
    public Transportorder update(Transportorder transportorder) {
        Optional<Transportorder> optTransportorder = this.transportorderRepository.findById(transportorder.getTransportorderid());
        if (!optTransportorder.isPresent())
            return null;
        Transportorder repTransportorder = optTransportorder.get();
        return this.transportorderRepository.save(repTransportorder);
    }

    @Override
    public void deleteById(String id) {
            this.transportorderRepository.deleteById(id);
    }

    @Override
    public void delete(Transportorder transportorder) {
        this.transportorderRepository.deleteById(transportorder.getTransportorderid());
    }
}
