package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transportorderdetailsaudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private BigInteger transportorderdtlid;
    private String transportorderid;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "transportorderdtlid", nullable = false, precision = 0)
    public BigInteger getTransportorderdtlid() {
        return transportorderdtlid;
    }

    public void setTransportorderdtlid(BigInteger transportorderdtlid) {
        this.transportorderdtlid = transportorderdtlid;
    }

    @Basic
    @Column(name = "transportorderid", nullable = false, length = 100)
    public String getTransportorderid() {
        return transportorderid;
    }

    public void setTransportorderid(String transportorderid) {
        this.transportorderid = transportorderid;
    }

    @Basic
    @Column(name = "commoditytype", nullable = false, length = 100)
    public String getCommoditytype() {
        return commoditytype;
    }

    public void setCommoditytype(String commoditytype) {
        this.commoditytype = commoditytype;
    }

    @Basic
    @Column(name = "producttype", nullable = false, length = 100)
    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    @Basic
    @Column(name = "agentname", nullable = true, length = 200)
    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    @Basic
    @Column(name = "referenceno", nullable = true, length = 100)
    public String getReferenceno() {
        return referenceno;
    }

    public void setReferenceno(String referenceno) {
        this.referenceno = referenceno;
    }

    @Basic
    @Column(name = "qty", nullable = true, precision = 0)
    public BigInteger getQty() {
        return qty;
    }

    public void setQty(BigInteger qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "temperature", nullable = true, precision = 0)
    public BigInteger getTemperature() {
        return temperature;
    }

    public void setTemperature(BigInteger temperature) {
        this.temperature = temperature;
    }

    @Basic
    @Column(name = "pallets", nullable = true, precision = 0)
    public BigInteger getPallets() {
        return pallets;
    }

    public void setPallets(BigInteger pallets) {
        this.pallets = pallets;
    }

    @Basic
    @Column(name = "palletspaces", nullable = true, precision = 0)
    public BigInteger getPalletspaces() {
        return palletspaces;
    }

    public void setPalletspaces(BigInteger palletspaces) {
        this.palletspaces = palletspaces;
    }

    @Basic
    @Column(name = "createdatetime", nullable = true)
    public Date getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    @Basic
    @Column(name = "createuserid", nullable = true, length = 100)
    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transportorderdetailsaudit that = (Transportorderdetailsaudit) o;
        return Objects.equals(transportorderdtlid, that.transportorderdtlid) && Objects.equals(transportorderid, that.transportorderid) && Objects.equals(commoditytype, that.commoditytype) && Objects.equals(producttype, that.producttype) && Objects.equals(agentname, that.agentname) && Objects.equals(referenceno, that.referenceno) && Objects.equals(qty, that.qty) && Objects.equals(temperature, that.temperature) && Objects.equals(pallets, that.pallets) && Objects.equals(palletspaces, that.palletspaces) && Objects.equals(createdatetime, that.createdatetime) && Objects.equals(createuserid, that.createuserid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportorderdtlid, transportorderid, commoditytype, producttype, agentname, referenceno, qty, temperature, pallets, palletspaces, createdatetime, createuserid);
    }
}
