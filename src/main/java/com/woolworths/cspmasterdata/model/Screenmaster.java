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
public class Screenmaster {
    @Id
    @Column(name = "screenid", nullable = false, length = 100)
    private String screenid;
    private String description;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @OneToMany(targetEntity = Screensectionmaster.class, mappedBy = "screenmaster", cascade=CascadeType.ALL)
    private List<Screensectionmaster> screensectionmasterList = new ArrayList<Screensectionmaster>();

    public String getScreenid() {
        return screenid;
    }

    public void setScreenid(String screenid) {
        this.screenid = screenid;
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

    public List<Screensectionmaster> getScreensectionmasterList() {
        return screensectionmasterList;
    }

    public void setScreensectionmasterList(List<Screensectionmaster> screensectionmasterList) {
        this.screensectionmasterList = screensectionmasterList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Screenmaster)) return false;
        Screenmaster that = (Screenmaster) o;
        return Objects.equals(getScreenid(), that.getScreenid()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getScreensectionmasterList(), that.getScreensectionmasterList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScreenid(), getDescription(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getScreensectionmasterList());
    }

    @Override
    public String toString() {
        return "Screenmaster{" +
                "screenid='" + screenid + '\'' +
                ", description='" + description + '\'' +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", screensectionmasterList=" + screensectionmasterList +
                '}';
    }
}
