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
@ToString
@Data
@Entity
public class Transportorderlegsaudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private BigInteger transportorderlegid;
    private String transportorderid;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "transportorderlegid", nullable = false, precision = 0)
    public BigInteger getTransportorderlegid() {
        return transportorderlegid;
    }

    public void setTransportorderlegid(BigInteger transportorderlegid) {
        this.transportorderlegid = transportorderlegid;
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
    @Column(name = "legstatus", nullable = false, length = 100)
    public String getLegstatus() {
        return legstatus;
    }

    public void setLegstatus(String legstatus) {
        this.legstatus = legstatus;
    }

    @Basic
    @Column(name = "trucktype", nullable = false, length = 100)
    public String getTrucktype() {
        return trucktype;
    }

    public void setTrucktype(String trucktype) {
        this.trucktype = trucktype;
    }

    @Basic
    @Column(name = "carrierno", nullable = false, length = 100)
    public String getCarrierno() {
        return carrierno;
    }

    public void setCarrierno(String carrierno) {
        this.carrierno = carrierno;
    }

    @Basic
    @Column(name = "fromlocationid", nullable = false, length = 100)
    public String getFromlocationid() {
        return fromlocationid;
    }

    public void setFromlocationid(String fromlocationid) {
        this.fromlocationid = fromlocationid;
    }

    @Basic
    @Column(name = "tolocationid", nullable = false, length = 100)
    public String getTolocationid() {
        return tolocationid;
    }

    public void setTolocationid(String tolocationid) {
        this.tolocationid = tolocationid;
    }

    @Basic
    @Column(name = "legtype", nullable = false, length = 100)
    public String getLegtype() {
        return legtype;
    }

    public void setLegtype(String legtype) {
        this.legtype = legtype;
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
        Transportorderlegsaudit that = (Transportorderlegsaudit) o;
        return Objects.equals(transportorderlegid, that.transportorderlegid) && Objects.equals(transportorderid, that.transportorderid) && Objects.equals(legstatus, that.legstatus) && Objects.equals(trucktype, that.trucktype) && Objects.equals(carrierno, that.carrierno) && Objects.equals(fromlocationid, that.fromlocationid) && Objects.equals(tolocationid, that.tolocationid) && Objects.equals(legtype, that.legtype) && Objects.equals(pickupdate, that.pickupdate) && Objects.equals(pickuptime, that.pickuptime) && Objects.equals(deliverydate, that.deliverydate) && Objects.equals(deliverytime, that.deliverytime) && Objects.equals(createdatetime, that.createdatetime) && Objects.equals(createuserid, that.createuserid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportorderlegid, transportorderid, legstatus, trucktype, carrierno, fromlocationid, tolocationid, legtype, pickupdate, pickuptime, deliverydate, deliverytime, createdatetime, createuserid);
    }
}
