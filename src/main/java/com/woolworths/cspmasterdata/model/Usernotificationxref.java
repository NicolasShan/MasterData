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
@IdClass(UsernotificationxrefPK.class)
public class Usernotificationxref {
    @Id
    @Column(insertable = false, updatable = false, name = "userid", nullable = false, length = 100)
    private String userid;
    @Id
    @Column(name = "notificationtype", nullable = false, length = 10, insertable = false, updatable = false)
    private String notificationtype;
    @Id
    @Column(name = "notificationcat", nullable = false, length = 10, insertable = false, updatable = false)
    private String notificationcat;
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
    @JoinColumns({@JoinColumn(name = "notificationtype", referencedColumnName = "notificationtype", insertable = false, updatable = false),
            @JoinColumn(name = "notificationcat", referencedColumnName = "notificationcat", insertable = false, updatable = false)})
    private Notificationtype notificationtypes;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getNotificationtype() {
        return notificationtype;
    }

    public void setNotificationtype(String notificationtype) {
        this.notificationtype = notificationtype;
    }

    public String getNotificationcat() {
        return notificationcat;
    }

    public void setNotificationcat(String notificationcat) {
        this.notificationcat = notificationcat;
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

    public Notificationtype getNotificationtypes() {
        return notificationtypes;
    }

    public void setNotificationtypes(Notificationtype notificationtypes) {
        this.notificationtypes = notificationtypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usernotificationxref)) return false;
        Usernotificationxref that = (Usernotificationxref) o;
        return Objects.equals(getUserid(), that.getUserid()) && Objects.equals(getNotificationtype(), that.getNotificationtype()) && Objects.equals(getNotificationcat(), that.getNotificationcat()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getUserdetails(), that.getUserdetails()) && Objects.equals(getNotificationtypes(), that.getNotificationtypes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserid(), getNotificationtype(), getNotificationcat(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getUserdetails(), getNotificationtypes());
    }
}
