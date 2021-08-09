package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.*;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Transportorderlegs {
    @Id
    @Column(name = "transportorderlegid", nullable = false, precision = 0)
    private BigInteger transportorderlegid;
    private String legstatus;
    private String trucktype;
    private String carrierno;
    private String fromlocationid;
    private String tolocationid;
    private String legtype;
    private Date pickupdate;
    private String pickuptime;
    private Date deliverydate;
    private String deliverytime;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "transportorderid", referencedColumnName = "transportorderid", insertable = false, updatable = false)
    private Transportorder transportorder;

    @OneToMany(targetEntity = Proofofpickupdel.class, mappedBy = "transportorderlegs", cascade=CascadeType.ALL)
    private List<Proofofpickupdel> prooflist = new ArrayList<Proofofpickupdel>();
}
