package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Districtmaster {
    @Id
    @Column(name = "districtid", nullable = false, length = 10)
    private String districtid;
    private String description;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @OneToMany(targetEntity = Locationmaster.class, mappedBy = "districtmaster", cascade=CascadeType.ALL)
    private List<Locationmaster> locations = new ArrayList<Locationmaster>();

    @OneToMany(targetEntity = Carriermaster.class, mappedBy = "districtmaster", cascade=CascadeType.ALL)
    private List<Carriermaster> carrierlist = new ArrayList<Carriermaster>();

    @OneToMany(targetEntity = Customermaster.class, mappedBy = "districtmaster", cascade=CascadeType.ALL)
    private List<Customermaster> customerlist = new ArrayList<Customermaster>();

    public String getDistrictid() {
        return districtid;
    }

    public void setDistrictid(String districtid) {
        this.districtid = districtid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<Locationmaster> getLocations() {
        return locations;
    }

    public void setLocations(List<Locationmaster> locations) {
        this.locations = locations;
    }

    public List<Carriermaster> getCarrierlist() {
        return carrierlist;
    }

    public void setCarrierlist(List<Carriermaster> carrierlist) {
        this.carrierlist = carrierlist;
    }

    public List<Customermaster> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(List<Customermaster> customerlist) {
        this.customerlist = customerlist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Districtmaster)) return false;
        Districtmaster that = (Districtmaster) o;
        return Objects.equals(getDistrictid(), that.getDistrictid()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getLocations(), that.getLocations()) && Objects.equals(getCarrierlist(), that.getCarrierlist()) && Objects.equals(getCustomerlist(), that.getCustomerlist());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDistrictid(), getDescription(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getLocations(), getCarrierlist(), getCustomerlist());
    }

    @Override
    public String toString() {
        return "Districtmaster{" +
                "districtid='" + districtid + '\'' +
                ", description='" + description + '\'' +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", locations=" + locations +
                ", carrierlist=" + carrierlist +
                ", customerlist=" + customerlist +
                '}';
    }
}
