package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
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
public class Lanemaster {
    @Id
    @Column(name = "laneid", nullable = false, precision = 0)
    private BigInteger laneid;
    private BigInteger lanepriority;
    private Date deletedatetime;
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

    @OneToMany(targetEntity = Lanelegxref.class, mappedBy = "lanemaster", cascade=CascadeType.ALL)
    private List<Lanelegxref> lanelegxrefList = new ArrayList<Lanelegxref>();

    public BigInteger getLaneid() {
        return laneid;
    }

    public void setLaneid(BigInteger laneid) {
        this.laneid = laneid;
    }

    public BigInteger getLanepriority() {
        return lanepriority;
    }

    public void setLanepriority(BigInteger lanepriority) {
        this.lanepriority = lanepriority;
    }

    public Date getDeletedatetime() {
        return deletedatetime;
    }

    public void setDeletedatetime(Date deletedatetime) {
        this.deletedatetime = deletedatetime;
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

    public List<Lanelegxref> getLanelegxrefList() {
        return lanelegxrefList;
    }

    public void setLanelegxrefList(List<Lanelegxref> lanelegxrefList) {
        this.lanelegxrefList = lanelegxrefList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lanemaster)) return false;
        Lanemaster that = (Lanemaster) o;
        return Objects.equals(getLaneid(), that.getLaneid()) && Objects.equals(getLanepriority(), that.getLanepriority()) && Objects.equals(getDeletedatetime(), that.getDeletedatetime()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getLocationmaster(), that.getLocationmaster()) && Objects.equals(getCustomermaster(), that.getCustomermaster()) && Objects.equals(getLanelegxrefList(), that.getLanelegxrefList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLaneid(), getLanepriority(), getDeletedatetime(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getLocationmaster(), getCustomermaster(), getLanelegxrefList());
    }
}
