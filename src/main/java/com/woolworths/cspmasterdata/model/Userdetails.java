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
@IdClass(UserdetailsPK.class)
public class Userdetails {
    @Id
    @Column(name = "userid", nullable = false, length = 100, insertable = false, updatable = false)
    private String userid;
    @Id
    @Column(name = "customerno", nullable = false, length = 100, insertable = false, updatable = false)
    private String customerno;
    @Id
    @Column(name = "carrierno", nullable = false, length = 100, insertable = false, updatable = false)
    private String carrierno;
    private String firstname;
    private String middlename;
    private String lastname;
    private String phonenumber;
    private String profilephoto;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "customerno", referencedColumnName = "customerno", insertable = false, updatable = false)
    private Customermaster customermaster;

    @ManyToOne
    @JoinColumn(name = "carrierno", referencedColumnName = "carrierno", insertable = false, updatable = false)
    private Carriermaster carriermaster;

    @OneToMany(targetEntity = Userrolexref.class, mappedBy = "userdetails", cascade=CascadeType.ALL)
    private List<Userrolexref> userrolexrefList = new ArrayList<Userrolexref>();

    @OneToMany(targetEntity = Usernotificationxref.class, mappedBy = "userdetails", cascade=CascadeType.ALL)
    private List<Usernotificationxref> usernotificationxrefList = new ArrayList<Usernotificationxref>();

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    public String getCarrierno() {
        return carrierno;
    }

    public void setCarrierno(String carrierno) {
        this.carrierno = carrierno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getProfilephoto() {
        return profilephoto;
    }

    public void setProfilephoto(String profilephoto) {
        this.profilephoto = profilephoto;
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

    public Carriermaster getCarriermaster() {
        return carriermaster;
    }

    public void setCarriermaster(Carriermaster carriermaster) {
        this.carriermaster = carriermaster;
    }

    public List<Userrolexref> getUserrolexrefList() {
        return userrolexrefList;
    }

    public void setUserrolexrefList(List<Userrolexref> userrolexrefList) {
        this.userrolexrefList = userrolexrefList;
    }

    public List<Usernotificationxref> getUsernotificationxrefList() {
        return usernotificationxrefList;
    }

    public void setUsernotificationxrefList(List<Usernotificationxref> usernotificationxrefList) {
        this.usernotificationxrefList = usernotificationxrefList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Userdetails)) return false;
        Userdetails that = (Userdetails) o;
        return Objects.equals(getUserid(), that.getUserid()) && Objects.equals(getCustomerno(), that.getCustomerno()) && Objects.equals(getCarrierno(), that.getCarrierno()) && Objects.equals(getFirstname(), that.getFirstname()) && Objects.equals(getMiddlename(), that.getMiddlename()) && Objects.equals(getLastname(), that.getLastname()) && Objects.equals(getPhonenumber(), that.getPhonenumber()) && Objects.equals(getProfilephoto(), that.getProfilephoto()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getCustomermaster(), that.getCustomermaster()) && Objects.equals(getCarriermaster(), that.getCarriermaster()) && Objects.equals(getUserrolexrefList(), that.getUserrolexrefList()) && Objects.equals(getUsernotificationxrefList(), that.getUsernotificationxrefList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserid(), getCustomerno(), getCarrierno(), getFirstname(), getMiddlename(), getLastname(), getPhonenumber(), getProfilephoto(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getCustomermaster(), getCarriermaster(), getUserrolexrefList(), getUsernotificationxrefList());
    }
}
