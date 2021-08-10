package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;
import java.util.*;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Locationmaster {
    @Id
    @Column(name = "locationid", nullable = false, length = 100)
    private String locationid;
    private String shortdescription;
    private String description;
    private String postcode;
    private String city;
    private String streetaddress;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "customerno", referencedColumnName = "customerno", insertable = false, updatable = false)
    private Customermaster customermaster;

    @ManyToOne
    @JoinColumn(name = "districtid", referencedColumnName = "districtid", insertable = false, updatable = false)
    private Districtmaster districtmaster;

    @ManyToOne
    @JoinColumn(name = "countryid", referencedColumnName = "countryid", insertable = false, updatable = false)
    private Countrymaster countrymaster;

    @OneToMany(targetEntity = Transportorder.class, mappedBy = "locationmaster", cascade=CascadeType.ALL)
    private Set<Transportorder> orders = new HashSet<Transportorder>();

    @OneToMany(targetEntity = Lanemaster.class, mappedBy = "locationmaster", cascade=CascadeType.ALL)
    private List<Lanemaster> lanemasterList = new ArrayList<Lanemaster>();

    @OneToMany(targetEntity = Lanelegxref.class, mappedBy = "locationmaster", cascade=CascadeType.ALL)
    private List<Lanelegxref> lanelegxrefList = new ArrayList<Lanelegxref>();

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    public String getShortdescription() {
        return shortdescription;
    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
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

    public Customermaster getCustomermaster() {
        return customermaster;
    }

    public void setCustomermaster(Customermaster customermaster) {
        this.customermaster = customermaster;
    }

    public Districtmaster getDistrictmaster() {
        return districtmaster;
    }

    public void setDistrictmaster(Districtmaster districtmaster) {
        this.districtmaster = districtmaster;
    }

    public Countrymaster getCountrymaster() {
        return countrymaster;
    }

    public void setCountrymaster(Countrymaster countrymaster) {
        this.countrymaster = countrymaster;
    }

    public Set<Transportorder> getOrders() {
        return orders;
    }

    public void setOrders(Set<Transportorder> orders) {
        this.orders = orders;
    }

    public List<Lanemaster> getLanemasterList() {
        return lanemasterList;
    }

    public void setLanemasterList(List<Lanemaster> lanemasterList) {
        this.lanemasterList = lanemasterList;
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
        if (!(o instanceof Locationmaster)) return false;
        Locationmaster that = (Locationmaster) o;
        return Objects.equals(getLocationid(), that.getLocationid()) && Objects.equals(getShortdescription(), that.getShortdescription()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getPostcode(), that.getPostcode()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getStreetaddress(), that.getStreetaddress()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getCustomermaster(), that.getCustomermaster()) && Objects.equals(getDistrictmaster(), that.getDistrictmaster()) && Objects.equals(getCountrymaster(), that.getCountrymaster()) && Objects.equals(getOrders(), that.getOrders()) && Objects.equals(getLanemasterList(), that.getLanemasterList()) && Objects.equals(getLanelegxrefList(), that.getLanelegxrefList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocationid(), getShortdescription(), getDescription(), getPostcode(), getCity(), getStreetaddress(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getCustomermaster(), getDistrictmaster(), getCountrymaster(), getOrders(), getLanemasterList(), getLanelegxrefList());
    }

    @Override
    public String toString() {
        return "Locationmaster{" +
                "locationid='" + locationid + '\'' +
                ", shortdescription='" + shortdescription + '\'' +
                ", description='" + description + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", streetaddress='" + streetaddress + '\'' +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", customermaster=" + customermaster +
                ", districtmaster=" + districtmaster +
                ", countrymaster=" + countrymaster +
                ", orders=" + orders +
                ", lanemasterList=" + lanemasterList +
                ", lanelegxrefList=" + lanelegxrefList +
                '}';
    }
}
