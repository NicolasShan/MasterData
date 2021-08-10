package com.woolworths.cspmasterdata.repository;

import com.woolworths.cspmasterdata.model.Transportorder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface TransportorderRepository extends JpaRepository<Transportorder, String>,
        JpaSpecificationExecutor<Transportorder>, Serializable {

}
