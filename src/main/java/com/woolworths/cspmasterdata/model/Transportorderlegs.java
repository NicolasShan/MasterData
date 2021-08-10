package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
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

    public BigInteger getTransportorderlegid() {
        return transportorderlegid;
    }

    public void setTransportorderlegid(BigInteger transportorderlegid) {
        this.transportorderlegid = transportorderlegid;
    }

    public String getLegstatus() {
        return legstatus;
    }

    public void setLegstatus(String legstatus) {
        this.legstatus = legstatus;
    }

    public String getTrucktype() {
        return trucktype;
    }

    public void setTrucktype(String trucktype) {
        this.trucktype = trucktype;
    }

    public String getCarrierno() {
        return carrierno;
    }

    public void setCarrierno(String carrierno) {
        this.carrierno = carrierno;
    }

    public String getFromlocationid() {
        return fromlocationid;
    }

    public void setFromlocationid(String fromlocationid) {
        this.fromlocationid = fromlocationid;
    }

    public String getTolocationid() {
        return tolocationid;
    }

    public void setTolocationid(String tolocationid) {
        this.tolocationid = tolocationid;
    }

    public String getLegtype() {
        return legtype;
    }

    public void setLegtype(String legtype) {
        this.legtype = legtype;
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

    public List<Proofofpickupdel> getProoflist() {
        return prooflist;
    }

    public void setProoflist(List<Proofofpickupdel> prooflist) {
        this.prooflist = prooflist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transportorderlegs)) return false;
        Transportorderlegs that = (Transportorderlegs) o;
        return Objects.equals(getTransportorderlegid(), that.getTransportorderlegid()) && Objects.equals(getLegstatus(), that.getLegstatus()) && Objects.equals(getTrucktype(), that.getTrucktype()) && Objects.equals(getCarrierno(), that.getCarrierno()) && Objects.equals(getFromlocationid(), that.getFromlocationid()) && Objects.equals(getTolocationid(), that.getTolocationid()) && Objects.equals(getLegtype(), that.getLegtype()) && Objects.equals(getPickupdate(), that.getPickupdate()) && Objects.equals(getPickuptime(), that.getPickuptime()) && Objects.equals(getDeliverydate(), that.getDeliverydate()) && Objects.equals(getDeliverytime(), that.getDeliverytime()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getTransportorder(), that.getTransportorder()) && Objects.equals(getProoflist(), that.getProoflist());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTransportorderlegid(), getLegstatus(), getTrucktype(), getCarrierno(), getFromlocationid(), getTolocationid(), getLegtype(), getPickupdate(), getPickuptime(), getDeliverydate(), getDeliverytime(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getTransportorder(), getProoflist());
    }
}
