package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transportorderaudit {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String transportorderid;
    private String orderref;
    private String orderstatus;
    private String originlocationid;
    private String destlocationid;
    private Date pickupdate;
    private String pickuptime;
    private Date deliverydate;
    private String deliverytime;
    private String customerno;
    private String exportind;
    private BigInteger importbatchid;
    private Date createdatetime;
    private String createuserid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "orderref", nullable = false, length = 100)
    public String getOrderref() {
        return orderref;
    }

    public void setOrderref(String orderref) {
        this.orderref = orderref;
    }

    @Basic
    @Column(name = "orderstatus", nullable = false, length = 100)
    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    @Basic
    @Column(name = "originlocationid", nullable = false, length = 100)
    public String getOriginlocationid() {
        return originlocationid;
    }

    public void setOriginlocationid(String originlocationid) {
        this.originlocationid = originlocationid;
    }

    @Basic
    @Column(name = "destlocationid", nullable = false, length = 100)
    public String getDestlocationid() {
        return destlocationid;
    }

    public void setDestlocationid(String destlocationid) {
        this.destlocationid = destlocationid;
    }

    @Basic
    @Column(name = "pickupdate", nullable = false)
    public Date getPickupdate() {
        return pickupdate;
    }

    public void setPickupdate(Date pickupdate) {
        this.pickupdate = pickupdate;
    }

    @Basic
    @Column(name = "pickuptime", nullable = false, length = 10)
    public String getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(String pickuptime) {
        this.pickuptime = pickuptime;
    }

    @Basic
    @Column(name = "deliverydate", nullable = false)
    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    @Basic
    @Column(name = "deliverytime", nullable = false, length = 10)
    public String getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
    }

    @Basic
    @Column(name = "customerno", nullable = false, length = 100)
    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    @Basic
    @Column(name = "exportind", nullable = false, length = 1)
    public String getExportind() {
        return exportind;
    }

    public void setExportind(String exportind) {
        this.exportind = exportind;
    }

    @Basic
    @Column(name = "importbatchid", nullable = true, precision = 0)
    public BigInteger getImportbatchid() {
        return importbatchid;
    }

    public void setImportbatchid(BigInteger importbatchid) {
        this.importbatchid = importbatchid;
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
        Transportorderaudit that = (Transportorderaudit) o;
        return Objects.equals(transportorderid, that.transportorderid) && Objects.equals(orderref, that.orderref) && Objects.equals(orderstatus, that.orderstatus) && Objects.equals(originlocationid, that.originlocationid) && Objects.equals(destlocationid, that.destlocationid) && Objects.equals(pickupdate, that.pickupdate) && Objects.equals(pickuptime, that.pickuptime) && Objects.equals(deliverydate, that.deliverydate) && Objects.equals(deliverytime, that.deliverytime) && Objects.equals(customerno, that.customerno) && Objects.equals(exportind, that.exportind) && Objects.equals(importbatchid, that.importbatchid) && Objects.equals(createdatetime, that.createdatetime) && Objects.equals(createuserid, that.createuserid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportorderid, orderref, orderstatus, originlocationid, destlocationid, pickupdate, pickuptime, deliverydate, deliverytime, customerno, exportind, importbatchid, createdatetime, createuserid);
    }
}
