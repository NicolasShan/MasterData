package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(GloballookupPK.class)
public class Globallookup {
    @Id
    @Column(name = "lookupid", nullable = false, length = 100)
    private String lookupid;
    @Id
    @Column(name = "lookupval", nullable = false, length = 200)
    private String lookupval;
    private String lookupchar;
    private BigInteger lookupnum;
    private Date lookupdate;
    private String lookupremarks;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @OneToMany(targetEntity = Lanelegxref.class, mappedBy = "globallookup", cascade=CascadeType.ALL)
    private List<Lanelegxref> lanelegxrefList = new ArrayList<Lanelegxref>();

    public String getLookupid() {
        return lookupid;
    }

    public void setLookupid(String lookupid) {
        this.lookupid = lookupid;
    }

    public String getLookupval() {
        return lookupval;
    }

    public void setLookupval(String lookupval) {
        this.lookupval = lookupval;
    }

    public String getLookupchar() {
        return lookupchar;
    }

    public void setLookupchar(String lookupchar) {
        this.lookupchar = lookupchar;
    }

    public BigInteger getLookupnum() {
        return lookupnum;
    }

    public void setLookupnum(BigInteger lookupnum) {
        this.lookupnum = lookupnum;
    }

    public Date getLookupdate() {
        return lookupdate;
    }

    public void setLookupdate(Date lookupdate) {
        this.lookupdate = lookupdate;
    }

    public String getLookupremarks() {
        return lookupremarks;
    }

    public void setLookupremarks(String lookupremarks) {
        this.lookupremarks = lookupremarks;
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

    public List<Lanelegxref> getLanelegxrefList() {
        return lanelegxrefList;
    }

    public void setLanelegxrefList(List<Lanelegxref> lanelegxrefList) {
        this.lanelegxrefList = lanelegxrefList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Globallookup)) return false;
        Globallookup that = (Globallookup) o;
        return Objects.equals(getLookupid(), that.getLookupid()) && Objects.equals(getLookupval(), that.getLookupval()) && Objects.equals(getLookupchar(), that.getLookupchar()) && Objects.equals(getLookupnum(), that.getLookupnum()) && Objects.equals(getLookupdate(), that.getLookupdate()) && Objects.equals(getLookupremarks(), that.getLookupremarks()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getLanelegxrefList(), that.getLanelegxrefList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLookupid(), getLookupval(), getLookupchar(), getLookupnum(), getLookupdate(), getLookupremarks(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getLanelegxrefList());
    }

    @Override
    public String toString() {
        return "Globallookup{" +
                "lookupid='" + lookupid + '\'' +
                ", lookupval='" + lookupval + '\'' +
                ", lookupchar='" + lookupchar + '\'' +
                ", lookupnum=" + lookupnum +
                ", lookupdate=" + lookupdate +
                ", lookupremarks='" + lookupremarks + '\'' +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", lanelegxrefList=" + lanelegxrefList +
                '}';
    }
}
