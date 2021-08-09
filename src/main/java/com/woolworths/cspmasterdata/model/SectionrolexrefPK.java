package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Embeddable
public class SectionrolexrefPK implements Serializable {
    private String screensectionid;
    private String accessroleid;

    @Column(name = "screensectionid", nullable = false, length = 100, insertable = false, updatable = false)
    @Id
    public String getScreensectionid() {
        return screensectionid;
    }

    public void setScreensectionid(String screensectionid) {
        this.screensectionid = screensectionid;
    }

    @Column(name = "accessroleid", nullable = false, length = 100, insertable = false, updatable = false)
    @Id
    public String getAccessroleid() {
        return accessroleid;
    }

    public void setAccessroleid(String accessroleid) {
        this.accessroleid = accessroleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SectionrolexrefPK that = (SectionrolexrefPK) o;
        return Objects.equals(screensectionid, that.screensectionid) && Objects.equals(accessroleid, that.accessroleid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screensectionid, accessroleid);
    }
}
