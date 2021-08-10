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

    public BigInteger getTransportorderdtlid() {
        return transportorderdtlid;
    }

    public void setTransportorderdtlid(BigInteger transportorderdtlid) {
        this.transportorderdtlid = transportorderdtlid;
    }

    public String getCommoditytype() {
        return commoditytype;
    }

    public void setCommoditytype(String commoditytype) {
        this.commoditytype = commoditytype;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public String getReferenceno() {
        return referenceno;
    }

    public void setReferenceno(String referenceno) {
        this.referenceno = referenceno;
    }

    public BigInteger getQty() {
        return qty;
    }

    public void setQty(BigInteger qty) {
        this.qty = qty;
    }

    public BigInteger getTemperature() {
        return temperature;
    }

    public void setTemperature(BigInteger temperature) {
        this.temperature = temperature;
    }

    public BigInteger getPallets() {
        return pallets;
    }

    public void setPallets(BigInteger pallets) {
        this.pallets = pallets;
    }

    public BigInteger getPalletspaces() {
        return palletspaces;
    }

    public void setPalletspaces(BigInteger palletspaces) {
        this.palletspaces = palletspaces;
    }

    public Date getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid;
    }

    public Date getUpdatedatetime() {
        return updatedatetime;
    }

    public void setUpdatedatetime(Date updatedatetime) {
        this.updatedatetime = updatedatetime;
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid;
    }

    public Transportorder getTransportorder() {
        return transportorder;
    }

    public void setTransportorder(Transportorder transportorder) {
        this.transportorder = transportorder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transportorderdetails)) return false;
        Transportorderdetails that = (Transportorderdetails) o;
        return Objects.equals(getTransportorderdtlid(), that.getTransportorderdtlid()) && Objects.equals(getCommoditytype(), that.getCommoditytype()) && Objects.equals(getProducttype(), that.getProducttype()) && Objects.equals(getAgentname(), that.getAgentname()) && Objects.equals(getReferenceno(), that.getReferenceno()) && Objects.equals(getQty(), that.getQty()) && Objects.equals(getTemperature(), that.getTemperature()) && Objects.equals(getPallets(), that.getPallets()) && Objects.equals(getPalletspaces(), that.getPalletspaces()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getTransportorder(), that.getTransportorder());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTransportorderdtlid(), getCommoditytype(), getProducttype(), getAgentname(), getReferenceno(), getQty(), getTemperature(), getPallets(), getPalletspaces(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getTransportorder());
    }
}
