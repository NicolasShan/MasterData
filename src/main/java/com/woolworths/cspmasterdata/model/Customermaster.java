package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;
import java.util.*;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customermaster {
    @Id
    @Column(name = "customerno", nullable = false, length = 100)
    private String customerno;
    private String salesforceref;
    private String tmsref;
    private String description;
    private String postcode;
    private String city;
    private String streetaddress;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "countryid", referencedColumnName = "countryid", insertable = false, updatable = false)
    private Countrymaster  countrymaster;

    @ManyToOne
    @JoinColumn(name = "districtid", referencedColumnName = "districtid", insertable = false, updatable = false)
    private Districtmaster districtmaster;

    @OneToMany(targetEntity = Transportorder.class, mappedBy = "customermaster", cascade=CascadeType.ALL)
    private Set<Transportorder> orders = new HashSet<Transportorder>();

    @OneToMany(targetEntity = Locationmaster.class, mappedBy = "customermaster", cascade=CascadeType.ALL)
    private List<Locationmaster> locations = new ArrayList<Locationmaster>();

    @OneToMany(targetEntity = Lanemaster.class, mappedBy = "customermaster", cascade=CascadeType.ALL)
    private List<Lanemaster> lanemasterList = new ArrayList<Lanemaster>();

    @OneToMany(targetEntity = Userdetails.class, mappedBy = "customermaster", cascade=CascadeType.ALL)
    private List<Userdetails> Userdetailslist = new ArrayList<Userdetails>();

    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    public String getSalesforceref() {
        return salesforceref;
    }

    public void setSalesforceref(String salesforceref) {
        this.salesforceref = salesforceref;
    }

    public String getTmsref() {
        return tmsref;
    }

    public void setTmsref(String tmsref) {
        this.tmsref = tmsref;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
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

    public Countrymaster getCountrymaster() {
        return countrymaster;
    }

    public void setCountrymaster(Countrymaster countrymaster) {
        this.countrymaster = countrymaster;
    }

    public Districtmaster getDistrictmaster() {
        return districtmaster;
    }

    public void setDistrictmaster(Districtmaster districtmaster) {
        this.districtmaster = districtmaster;
    }

    public Set<Transportorder> getOrders() {
        return orders;
    }

    public void setOrders(Set<Transportorder> orders) {
        this.orders = orders;
    }

    public List<Locationmaster> getLocations() {
        return locations;
    }

    public void setLocations(List<Locationmaster> locations) {
        this.locations = locations;
    }

    public List<Lanemaster> getLanemasterList() {
        return lanemasterList;
    }

    public void setLanemasterList(List<Lanemaster> lanemasterList) {
        this.lanemasterList = lanemasterList;
    }

    public List<Userdetails> getUserdetailslist() {
        return Userdetailslist;
    }

    public void setUserdetailslist(List<Userdetails> userdetailslist) {
        Userdetailslist = userdetailslist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customermaster)) return false;
        Customermaster that = (Customermaster) o;
        return Objects.equals(getCustomerno(), that.getCustomerno()) && Objects.equals(getSalesforceref(), that.getSalesforceref()) && Objects.equals(getTmsref(), that.getTmsref()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getPostcode(), that.getPostcode()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getStreetaddress(), that.getStreetaddress()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getCountrymaster(), that.getCountrymaster()) && Objects.equals(getDistrictmaster(), that.getDistrictmaster()) && Objects.equals(getOrders(), that.getOrders()) && Objects.equals(getLocations(), that.getLocations()) && Objects.equals(getLanemasterList(), that.getLanemasterList()) && Objects.equals(getUserdetailslist(), that.getUserdetailslist());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerno(), getSalesforceref(), getTmsref(), getDescription(), getPostcode(), getCity(), getStreetaddress(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getCountrymaster(), getDistrictmaster(), getOrders(), getLocations(), getLanemasterList(), getUserdetailslist());
    }

    @Override
    public String toString() {
        return "Customermaster{" +
                "customerno='" + customerno + '\'' +
                ", salesforceref='" + salesforceref + '\'' +
                ", tmsref='" + tmsref + '\'' +
                ", description='" + description + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", streetaddress='" + streetaddress + '\'' +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", countrymaster=" + countrymaster +
                ", districtmaster=" + districtmaster +
                ", orders=" + orders +
                ", locations=" + locations +
                ", lanemasterList=" + lanemasterList +
                ", Userdetailslist=" + Userdetailslist +
                '}';
    }
}
