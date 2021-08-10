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
@IdClass(SectionrolexrefPK.class)
public class Sectionrolexref {
    @Id
    @Column(name = "screensectionid", nullable = false, length = 100, insertable = false, updatable = false)
    private String screensectionid;
    @Id
    @Column(name = "accessroleid", nullable = false, length = 100, insertable = false, updatable = false)
    private String accessroleid;
    private String allsectionind;
    private String accesstype;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "screensectionid", referencedColumnName = "screensectionid", insertable = false, updatable = false)
    private Screensectionmaster screensectionmaster;

    @ManyToOne
    @JoinColumn(name = "accessroleid", referencedColumnName = "accessroleid", insertable = false, updatable = false)
    private Accessrolemaster accessrolemaster;

    public String getScreensectionid() {
        return screensectionid;
    }

    public void setScreensectionid(String screensectionid) {
        this.screensectionid = screensectionid;
    }

    public String getAccessroleid() {
        return accessroleid;
    }

    public void setAccessroleid(String accessroleid) {
        this.accessroleid = accessroleid;
    }

    public String getAllsectionind() {
        return allsectionind;
    }

    public void setAllsectionind(String allsectionind) {
        this.allsectionind = allsectionind;
    }

    public String getAccesstype() {
        return accesstype;
    }

    public void setAccesstype(String accesstype) {
        this.accesstype = accesstype;
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

    public Screensectionmaster getScreensectionmaster() {
        return screensectionmaster;
    }

    public void setScreensectionmaster(Screensectionmaster screensectionmaster) {
        this.screensectionmaster = screensectionmaster;
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
        if (!(o instanceof Sectionrolexref)) return false;
        Sectionrolexref that = (Sectionrolexref) o;
        return Objects.equals(getScreensectionid(), that.getScreensectionid()) && Objects.equals(getAccessroleid(), that.getAccessroleid()) && Objects.equals(getAllsectionind(), that.getAllsectionind()) && Objects.equals(getAccesstype(), that.getAccesstype()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getScreensectionmaster(), that.getScreensectionmaster()) && Objects.equals(getAccessrolemaster(), that.getAccessrolemaster());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScreensectionid(), getAccessroleid(), getAllsectionind(), getAccesstype(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getScreensectionmaster(), getAccessrolemaster());
    }

    @Override
    public String toString() {
        return "Sectionrolexref{" +
                "screensectionid='" + screensectionid + '\'' +
                ", accessroleid='" + accessroleid + '\'' +
                ", allsectionind='" + allsectionind + '\'' +
                ", accesstype='" + accesstype + '\'' +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", screensectionmaster=" + screensectionmaster +
                ", accessrolemaster=" + accessrolemaster +
                '}';
    }
}
