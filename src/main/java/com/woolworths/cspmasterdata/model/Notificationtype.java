package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
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
@IdClass(NotificationtypePK.class)
public class Notificationtype {
    @Id
    @Column(name = "notificationtype", nullable = false, length = 10)
    private String notificationtype;
    @Id
    @Column(name = "notificationcat", nullable = false, length = 10)
    private String notificationcat;
    private String description;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @OneToMany(targetEntity = Usernotificationxref.class, mappedBy = "notificationtypes", cascade=CascadeType.ALL)
    private List<Usernotificationxref> usernotificationxrefList = new ArrayList<Usernotificationxref>();

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

    public List<Usernotificationxref> getUsernotificationxrefList() {
        return usernotificationxrefList;
    }

    public void setUsernotificationxrefList(List<Usernotificationxref> usernotificationxrefList) {
        this.usernotificationxrefList = usernotificationxrefList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notificationtype)) return false;
        Notificationtype that = (Notificationtype) o;
        return Objects.equals(getNotificationtype(), that.getNotificationtype()) && Objects.equals(getNotificationcat(), that.getNotificationcat()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getUsernotificationxrefList(), that.getUsernotificationxrefList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNotificationtype(), getNotificationcat(), getDescription(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getUsernotificationxrefList());
    }

    @Override
    public String toString() {
        return "Notificationtype{" +
                "notificationtype='" + notificationtype + '\'' +
                ", notificationcat='" + notificationcat + '\'' +
                ", description='" + description + '\'' +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", usernotificationxrefList=" + usernotificationxrefList +
                '}';
    }
}
