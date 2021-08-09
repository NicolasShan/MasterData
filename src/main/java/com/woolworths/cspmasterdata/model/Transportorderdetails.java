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
public class Transportorderdetails {
    @Id
    @Column(name = "transportorderdtlid", nullable = false, precision = 0)
    private BigInteger transportorderdtlid;
    private String commoditytype;
    private String producttype;
    private String agentname;
    private String referenceno;
    private BigInteger qty;
    private BigInteger temperature;
    private BigInteger pallets;
    private BigInteger palletspaces;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "transportorderid", referencedColumnName = "transportorderid", insertable = false, updatable = false)
    private Transportorder transportorder;
}
