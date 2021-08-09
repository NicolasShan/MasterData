package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Transportorder {
    @Id
    @Column(name = "transportorderid", nullable = false, length = 100)
    private String transportorderid;
    private String orderref;
    private String orderstatus;
    private Date pickupdate;
    private String pickuptime;
    private Date deliverydate;
    private String deliverytime;
    private String exportind;
    private BigInteger importbatchid;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "locationid", referencedColumnName = "locationid", insertable = false, updatable = false)
    private Locationmaster locationmaster;

    @ManyToOne
    @JoinColumn(name = "customerno", referencedColumnName = "customerno", insertable = false, updatable = false)
    private Customermaster customermaster;

    @OneToMany(targetEntity = Transportorderlegs.class, mappedBy = "transportorder", cascade=CascadeType.ALL)
    private Set<Transportorderlegs> orderlegs = new HashSet<Transportorderlegs>();

    @OneToMany(targetEntity = Transportorderdetails.class, mappedBy = "transportorder", cascade=CascadeType.ALL)
    private Set<Transportorderdetails> orderdetails = new HashSet<Transportorderdetails>();
}
