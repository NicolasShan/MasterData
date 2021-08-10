package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
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

    public String getTransportorderid() {
        return transportorderid;
    }

    public void setTransportorderid(String transportorderid) {
        this.transportorderid = transportorderid;
    }

    public String getOrderref() {
        return orderref;
    }

    public void setOrderref(String orderref) {
        this.orderref = orderref;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Date getPickupdate() {
        return pickupdate;
    }

    public void setPickupdate(Date pickupdate) {
        this.pickupdate = pickupdate;
    }

    public String getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(String pickuptime) {
        this.pickuptime = pickuptime;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getExportind() {
        return exportind;
    }

    public void setExportind(String exportind) {
        this.exportind = exportind;
    }

    public BigInteger getImportbatchid() {
        return importbatchid;
    }

    public void setImportbatchid(BigInteger importbatchid) {
        this.importbatchid = importbatchid;
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

    public Locationmaster getLocationmaster() {
        return locationmaster;
    }

    public void setLocationmaster(Locationmaster locationmaster) {
        this.locationmaster = locationmaster;
    }

    public Customermaster getCustomermaster() {
        return customermaster;
    }

    public void setCustomermaster(Customermaster customermaster) {
        this.customermaster = customermaster;
    }

    public Set<Transportorderlegs> getOrderlegs() {
        return orderlegs;
    }

    public void setOrderlegs(Set<Transportorderlegs> orderlegs) {
        this.orderlegs = orderlegs;
    }

    public Set<Transportorderdetails> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(Set<Transportorderdetails> orderdetails) {
        this.orderdetails = orderdetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transportorder)) return false;
        Transportorder that = (Transportorder) o;
        return Objects.equals(getTransportorderid(), that.getTransportorderid()) && Objects.equals(getOrderref(), that.getOrderref()) && Objects.equals(getOrderstatus(), that.getOrderstatus()) && Objects.equals(getPickupdate(), that.getPickupdate()) && Objects.equals(getPickuptime(), that.getPickuptime()) && Objects.equals(getDeliverydate(), that.getDeliverydate()) && Objects.equals(getDeliverytime(), that.getDeliverytime()) && Objects.equals(getExportind(), that.getExportind()) && Objects.equals(getImportbatchid(), that.getImportbatchid()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getLocationmaster(), that.getLocationmaster()) && Objects.equals(getCustomermaster(), that.getCustomermaster()) && Objects.equals(getOrderlegs(), that.getOrderlegs()) && Objects.equals(getOrderdetails(), that.getOrderdetails());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTransportorderid(), getOrderref(), getOrderstatus(), getPickupdate(), getPickuptime(), getDeliverydate(), getDeliverytime(), getExportind(), getImportbatchid(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getLocationmaster(), getCustomermaster(), getOrderlegs(), getOrderdetails());
    }

    @Override
    public String toString() {
        return "Transportorder{" +
                "transportorderid='" + transportorderid + '\'' +
                ", orderref='" + orderref + '\'' +
                ", orderstatus='" + orderstatus + '\'' +
                ", pickupdate=" + pickupdate +
                ", pickuptime='" + pickuptime + '\'' +
                ", deliverydate=" + deliverydate +
                ", deliverytime='" + deliverytime + '\'' +
                ", exportind='" + exportind + '\'' +
                ", importbatchid=" + importbatchid +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", locationmaster=" + locationmaster +
                ", customermaster=" + customermaster +
                ", orderlegs=" + orderlegs +
                ", orderdetails=" + orderdetails +
                '}';
    }
}
