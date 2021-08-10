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
public class Screensectionmaster {
    @Id
    @Column(name = "screensectionid", nullable = false, length = 100)
    private String screensectionid;
    private String description;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "screenid", referencedColumnName = "screenid", insertable = false, updatable = false)
    private Screenmaster screenmaster;

    @OneToMany(targetEntity = Sectionrolexref.class, mappedBy = "screensectionmaster", cascade=CascadeType.ALL)
    private List<Sectionrolexref> sectionrolexrefList = new ArrayList<Sectionrolexref>();

    public String getScreensectionid() {
        return screensectionid;
    }

    public void setScreensectionid(String screensectionid) {
        this.screensectionid = screensectionid;
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

    public Screenmaster getScreenmaster() {
        return screenmaster;
    }

    public void setScreenmaster(Screenmaster screenmaster) {
        this.screenmaster = screenmaster;
    }

    public List<Sectionrolexref> getSectionrolexrefList() {
        return sectionrolexrefList;
    }

    public void setSectionrolexrefList(List<Sectionrolexref> sectionrolexrefList) {
        this.sectionrolexrefList = sectionrolexrefList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Screensectionmaster)) return false;
        Screensectionmaster that = (Screensectionmaster) o;
        return Objects.equals(getScreensectionid(), that.getScreensectionid()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getScreenmaster(), that.getScreenmaster()) && Objects.equals(getSectionrolexrefList(), that.getSectionrolexrefList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScreensectionid(), getDescription(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getScreenmaster(), getSectionrolexrefList());
    }

    @Override
    public String toString() {
        return "Screensectionmaster{" +
                "screensectionid='" + screensectionid + '\'' +
                ", description='" + description + '\'' +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", screenmaster=" + screenmaster +
                ", sectionrolexrefList=" + sectionrolexrefList +
                '}';
    }
}
