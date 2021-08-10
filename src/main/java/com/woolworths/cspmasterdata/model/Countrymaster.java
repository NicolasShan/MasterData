package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Countrymaster {
    @Id
    @Column(name = "countryid", nullable = false, length = 10)
    private String countryid;
    private String description;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @OneToMany(targetEntity = Carriermaster.class, mappedBy = "countrymaster",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Carriermaster> carrierlist;

    @OneToMany(targetEntity = Customermaster.class, mappedBy = "countrymaster", cascade = CascadeType.ALL)
    private List<Customermaster> customerlist = new ArrayList<Customermaster>();

    @OneToMany(targetEntity = Locationmaster.class, mappedBy = "countrymaster", cascade = CascadeType.ALL)
    private List<Locationmaster> locations = new ArrayList<Locationmaster>();

    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid;
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

    public List<Locationmaster> getLocations() {
        return locations;
    }

    public void setLocations(List<Locationmaster> locations) {
        this.locations = locations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Countrymaster)) return false;
        Countrymaster that = (Countrymaster) o;
        return Objects.equals(getCountryid(), that.getCountryid()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getCarrierlist(), that.getCarrierlist()) && Objects.equals(getCustomerlist(), that.getCustomerlist()) && Objects.equals(getLocations(), that.getLocations());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryid(), getDescription(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getCarrierlist(), getCustomerlist(), getLocations());
    }

    @Override
    public String toString() {
        return "Countrymaster{" +
                "countryid='" + countryid + '\'' +
                ", description='" + description + '\'' +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", carrierlist=" + carrierlist +
                ", customerlist=" + customerlist +
                ", locations=" + locations +
                '}';
    }
}
