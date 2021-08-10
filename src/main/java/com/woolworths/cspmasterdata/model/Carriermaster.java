package com.woolworths.cspmasterdata.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Carriermaster {
    @Id
    private String carrierno;
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

    @OneToMany(targetEntity = Userdetails.class, mappedBy = "carriermaster", cascade=CascadeType.ALL)
    private List<Userdetails> Userdetailslist = new ArrayList<Userdetails>();

    @OneToMany(targetEntity = Lanelegxref.class, mappedBy = "carriermaster", cascade=CascadeType.ALL)
    private List<Lanelegxref> lanelegxrefList = new ArrayList<Lanelegxref>();

    public String getCarrierno() {
        return carrierno;
    }

    public void setCarrierno(String carrierno) {
        this.carrierno = carrierno;
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

    public List<Userdetails> getUserdetailslist() {
        return Userdetailslist;
    }

    public void setUserdetailslist(List<Userdetails> userdetailslist) {
        Userdetailslist = userdetailslist;
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
        if (!(o instanceof Carriermaster)) return false;
        Carriermaster that = (Carriermaster) o;
        return Objects.equals(getCarrierno(), that.getCarrierno()) && Objects.equals(getSalesforceref(), that.getSalesforceref()) && Objects.equals(getTmsref(), that.getTmsref()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getPostcode(), that.getPostcode()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getStreetaddress(), that.getStreetaddress()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getCountrymaster(), that.getCountrymaster()) && Objects.equals(getDistrictmaster(), that.getDistrictmaster()) && Objects.equals(getUserdetailslist(), that.getUserdetailslist()) && Objects.equals(getLanelegxrefList(), that.getLanelegxrefList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarrierno(), getSalesforceref(), getTmsref(), getDescription(), getPostcode(), getCity(), getStreetaddress(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getCountrymaster(), getDistrictmaster(), getUserdetailslist(), getLanelegxrefList());
    }

    @Override
    public String toString() {
        return "Carriermaster{" +
                "carrierno='" + carrierno + '\'' +
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
                ", Userdetailslist=" + Userdetailslist +
                ", lanelegxrefList=" + lanelegxrefList +
                '}';
    }
}
