package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(UserrolexrefPK.class)
public class Userrolexref {
    @Id
    @Column(name = "userid", nullable = false, length = 100, insertable = false, updatable = false)
    private String userid;
    @Id
    @Column(name = "accessroleid", nullable = false, length = 100, insertable = false, updatable = false)
    private String accessroleid;
    @Id
    @Column(name = "customerno", nullable = false, length = 100, insertable = false, updatable = false)
    private String customerno;
    @Id
    @Column(name = "carrierno", nullable = false, length = 100, insertable = false, updatable = false)
    private String carrierno;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "userid", referencedColumnName = "userid", insertable = false, updatable = false),
            @JoinColumn(name = "customerno", referencedColumnName = "customerno", insertable = false, updatable = false),
            @JoinColumn(name = "carrierno", referencedColumnName = "carrierno", insertable = false, updatable = false)})
    private Userdetails userdetails;

    @ManyToOne
    @JoinColumn(name = "accessroleid", referencedColumnName = "accessroleid", insertable = false, updatable = false)
    private Accessrolemaster accessrolemaster;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAccessroleid() {
        return accessroleid;
    }

    public void setAccessroleid(String accessroleid) {
        this.accessroleid = accessroleid;
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

    public Userdetails getUserdetails() {
        return userdetails;
    }

    public void setUserdetails(Userdetails userdetails) {
        this.userdetails = userdetails;
    }

    public Accessrolemaster getAccessrolemaster() {
        return accessrolemaster;
    }

    public void setAccessrolemaster(Accessrolemaster accessrolemaster) {
        this.accessrolemaster = accessrolemaster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Userrolexref)) return false;
        Userrolexref that = (Userrolexref) o;
        return Objects.equals(getUserid(), that.getUserid()) && Objects.equals(getAccessroleid(), that.getAccessroleid()) && Objects.equals(getCustomerno(), that.getCustomerno()) && Objects.equals(getCarrierno(), that.getCarrierno()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getUserdetails(), that.getUserdetails()) && Objects.equals(getAccessrolemaster(), that.getAccessrolemaster());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserid(), getAccessroleid(), getCustomerno(), getCarrierno(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getUserdetails(), getAccessrolemaster());
    }
}
