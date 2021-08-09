package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Proofofpickupdel {
    @Id
    @Column(name = "proofofpickupdelid", nullable = false, precision = 0)
    private BigInteger proofofpickupdelid;
    private String transportorderid;
    private String actiontype;
    private String document;
    private String primemoverrego;
    private String trailerrego;
    private String trucktype;
    private String sealnumber;
    private BigInteger pickuptemperature;
    private BigInteger pallets;
    private BigInteger palletspaces;
    private String driver;
    private String remarks;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "transportorderlegid", referencedColumnName = "transportorderlegid", insertable = false, updatable = false)
    private Transportorderlegs transportorderlegs;
}
