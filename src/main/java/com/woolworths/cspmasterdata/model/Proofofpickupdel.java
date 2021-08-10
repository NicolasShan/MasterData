package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
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

    public BigInteger getProofofpickupdelid() {
        return proofofpickupdelid;
    }

    public void setProofofpickupdelid(BigInteger proofofpickupdelid) {
        this.proofofpickupdelid = proofofpickupdelid;
    }

    public String getTransportorderid() {
        return transportorderid;
    }

    public void setTransportorderid(String transportorderid) {
        this.transportorderid = transportorderid;
    }

    public String getActiontype() {
        return actiontype;
    }

    public void setActiontype(String actiontype) {
        this.actiontype = actiontype;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPrimemoverrego() {
        return primemoverrego;
    }

    public void setPrimemoverrego(String primemoverrego) {
        this.primemoverrego = primemoverrego;
    }

    public String getTrailerrego() {
        return trailerrego;
    }

    public void setTrailerrego(String trailerrego) {
        this.trailerrego = trailerrego;
    }

    public String getTrucktype() {
        return trucktype;
    }

    public void setTrucktype(String trucktype) {
        this.trucktype = trucktype;
    }

    public String getSealnumber() {
        return sealnumber;
    }

    public void setSealnumber(String sealnumber) {
        this.sealnumber = sealnumber;
    }

    public BigInteger getPickuptemperature() {
        return pickuptemperature;
    }

    public void setPickuptemperature(BigInteger pickuptemperature) {
        this.pickuptemperature = pickuptemperature;
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

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Transportorderlegs getTransportorderlegs() {
        return transportorderlegs;
    }

    public void setTransportorderlegs(Transportorderlegs transportorderlegs) {
        this.transportorderlegs = transportorderlegs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proofofpickupdel)) return false;
        Proofofpickupdel that = (Proofofpickupdel) o;
        return Objects.equals(getProofofpickupdelid(), that.getProofofpickupdelid()) && Objects.equals(getTransportorderid(), that.getTransportorderid()) && Objects.equals(getActiontype(), that.getActiontype()) && Objects.equals(getDocument(), that.getDocument()) && Objects.equals(getPrimemoverrego(), that.getPrimemoverrego()) && Objects.equals(getTrailerrego(), that.getTrailerrego()) && Objects.equals(getTrucktype(), that.getTrucktype()) && Objects.equals(getSealnumber(), that.getSealnumber()) && Objects.equals(getPickuptemperature(), that.getPickuptemperature()) && Objects.equals(getPallets(), that.getPallets()) && Objects.equals(getPalletspaces(), that.getPalletspaces()) && Objects.equals(getDriver(), that.getDriver()) && Objects.equals(getRemarks(), that.getRemarks()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getTransportorderlegs(), that.getTransportorderlegs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProofofpickupdelid(), getTransportorderid(), getActiontype(), getDocument(), getPrimemoverrego(), getTrailerrego(), getTrucktype(), getSealnumber(), getPickuptemperature(), getPallets(), getPalletspaces(), getDriver(), getRemarks(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getTransportorderlegs());
    }

    @Override
    public String toString() {
        return "Proofofpickupdel{" +
                "proofofpickupdelid=" + proofofpickupdelid +
                ", transportorderid='" + transportorderid + '\'' +
                ", actiontype='" + actiontype + '\'' +
                ", document='" + document + '\'' +
                ", primemoverrego='" + primemoverrego + '\'' +
                ", trailerrego='" + trailerrego + '\'' +
                ", trucktype='" + trucktype + '\'' +
                ", sealnumber='" + sealnumber + '\'' +
                ", pickuptemperature=" + pickuptemperature +
                ", pallets=" + pallets +
                ", palletspaces=" + palletspaces +
                ", driver='" + driver + '\'' +
                ", remarks='" + remarks + '\'' +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", transportorderlegs=" + transportorderlegs +
                '}';
    }
}
