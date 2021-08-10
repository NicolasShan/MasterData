package com.woolworths.cspmasterdata.repository;

import com.woolworths.cspmasterdata.model.Customermaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository   //deal with hibernate Repositories
public interface CustomermasterRepository extends JpaRepository<Customermaster, String>,
        JpaSpecificationExecutor<Customermaster>, Serializable {

}