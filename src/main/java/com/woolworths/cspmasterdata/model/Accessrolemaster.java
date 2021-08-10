package com.woolworths.cspmasterdata.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Accessrolemaster {
    @Id
    @Column(name = "accessroleid", nullable = false, length = 100)
    private String accessroleid;
    private String description;
    private String roletype;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @OneToMany(targetEntity = Sectionrolexref.class, mappedBy = "accessrolemaster", cascade = CascadeType.ALL)
    private List<Sectionrolexref> sectionrolexrefList = new ArrayList<Sectionrolexref>();

    @OneToMany(targetEntity = Userrolexref.class, mappedBy = "accessrolemaster", cascade = CascadeType.ALL)
    private List<Userrolexref> userrolexrefList = new ArrayList<>();

    public Accessrolemaster() {
    }

    public Accessrolemaster(String accessroleid, String description, String roletype, Date createdatetime, String createuserid, Date updatedatetime, String updateuserid, List<Sectionrolexref> sectionrolexrefList, List<Userrolexref> userrolexrefList) {
        this.accessroleid = accessroleid;
        this.description = description;
        this.roletype = roletype;
        this.createdatetime = createdatetime;
        this.createuserid = createuserid;
        this.updatedatetime = updatedatetime;
        this.updateuserid = updateuserid;
        this.sectionrolexrefList = sectionrolexrefList;
        this.userrolexrefList = userrolexrefList;
    }

    public String getAccessroleid() {
        return accessroleid;
    }

    public void setAccessroleid(String accessroleid) {
        this.accessroleid = accessroleid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype;
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

    public List<Sectionrolexref> getSectionrolexrefList() {
        return sectionrolexrefList;
    }

    public void setSectionrolexrefList(List<Sectionrolexref> sectionrolexrefList) {
        this.sectionrolexrefList = sectionrolexrefList;
    }

    public List<Userrolexref> getUserrolexrefList() {
        return userrolexrefList;
    }

    public void setUserrolexrefList(List<Userrolexref> userrolexrefList) {
        this.userrolexrefList = userrolexrefList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Accessrolemaster)) return false;
        Accessrolemaster that = (Accessrolemaster) o;
        return Objects.equals(getAccessroleid(), that.getAccessroleid()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getRoletype(), that.getRoletype()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getSectionrolexrefList(), that.getSectionrolexrefList()) && Objects.equals(getUserrolexrefList(), that.getUserrolexrefList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccessroleid(), getDescription(), getRoletype(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getSectionrolexrefList(), getUserrolexrefList());
    }

    @Override
    public String toString() {
        return "Accessrolemaster{" +
                "accessroleid='" + accessroleid + '\'' +
                ", description='" + description + '\'' +
                ", roletype='" + roletype + '\'' +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", sectionrolexrefList=" + sectionrolexrefList +
                ", userrolexrefList=" + userrolexrefList +
                '}';
    }
}
