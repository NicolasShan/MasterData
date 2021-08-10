package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(LanelegxrefPK.class)
public class Lanelegxref {
    @Id
    @Column(name = "laneid", nullable = false, precision = 0)
    private BigInteger laneid;
    @Id
    @Column(name = "fromlocationid", nullable = false, length = 100)
    private String fromlocationid;
    @Id
    @Column(name = "tolocationid", nullable = false, length = 100)
    private String tolocationid;
    @Id
    @Column(name = "carrierno", nullable = false, length = 100)
    private String carrierno;
    private BigInteger leadtimeinhours;
    private Date deletedatetime;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "laneid", referencedColumnName = "laneid", insertable = false, updatable = false)
    private Lanemaster lanemaster;

    @ManyToOne
    @JoinColumn(name = "locationid", referencedColumnName = "locationid", insertable = false, updatable = false)
    private Locationmaster locationmaster;

    @ManyToOne
    @JoinColumn(name = "carrierno", referencedColumnName = "carrierno", insertable = false, updatable = false)
    private Carriermaster carriermaster;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "legtypelookupid", referencedColumnName = "lookupid", insertable = false, updatable = false),
            @JoinColumn(name = "legtypelookupval", referencedColumnName = "lookupval", insertable = false, updatable = false)})
    private Globallookup globallookup;

    public BigInteger getLaneid() {
        return laneid;
    }

    public void setLaneid(BigInteger laneid) {
        this.laneid = laneid;
    }

    public String getFromlocationid() {
        return fromlocationid;
    }

    public void setFromlocationid(String fromlocationid) {
        this.fromlocationid = fromlocationid;
    }

    public String getTolocationid() {
        return tolocationid;
    }

    public void setTolocationid(String tolocationid) {
        this.tolocationid = tolocationid;
    }

    public String getCarrierno() {
        return carrierno;
    }

    public void setCarrierno(String carrierno) {
        this.carrierno = carrierno;
    }

    public BigInteger getLeadtimeinhours() {
        return leadtimeinhours;
    }

    public void setLeadtimeinhours(BigInteger leadtimeinhours) {
        this.leadtimeinhours = leadtimeinhours;
    }

    public Date getDeletedatetime() {
        return deletedatetime;
    }

    public void setDeletedatetime(Date deletedatetime) {
        this.deletedatetime = deletedatetime;
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

    public Lanemaster getLanemaster() {
        return lanemaster;
    }

    public void setLanemaster(Lanemaster lanemaster) {
        this.lanemaster = lanemaster;
    }

    public Locationmaster getLocationmaster() {
        return locationmaster;
    }

    public void setLocationmaster(Locationmaster locationmaster) {
        this.locationmaster = locationmaster;
    }

    public Carriermaster getCarriermaster() {
        return carriermaster;
    }

    public void setCarriermaster(Carriermaster carriermaster) {
        this.carriermaster = carriermaster;
    }

    public Globallookup getGloballookup() {
        return globallookup;
    }

    public void setGloballookup(Globallookup globallookup) {
        this.globallookup = globallookup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lanelegxref)) return false;
        Lanelegxref that = (Lanelegxref) o;
        return Objects.equals(getLaneid(), that.getLaneid()) && Objects.equals(getFromlocationid(), that.getFromlocationid()) && Objects.equals(getTolocationid(), that.getTolocationid()) && Objects.equals(getCarrierno(), that.getCarrierno()) && Objects.equals(getLeadtimeinhours(), that.getLeadtimeinhours()) && Objects.equals(getDeletedatetime(), that.getDeletedatetime()) && Objects.equals(getCreatedatetime(), that.getCreatedatetime()) && Objects.equals(getCreateuserid(), that.getCreateuserid()) && Objects.equals(getUpdatedatetime(), that.getUpdatedatetime()) && Objects.equals(getUpdateuserid(), that.getUpdateuserid()) && Objects.equals(getLanemaster(), that.getLanemaster()) && Objects.equals(getLocationmaster(), that.getLocationmaster()) && Objects.equals(getCarriermaster(), that.getCarriermaster()) && Objects.equals(getGloballookup(), that.getGloballookup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLaneid(), getFromlocationid(), getTolocationid(), getCarrierno(), getLeadtimeinhours(), getDeletedatetime(), getCreatedatetime(), getCreateuserid(), getUpdatedatetime(), getUpdateuserid(), getLanemaster(), getLocationmaster(), getCarriermaster(), getGloballookup());
    }

    @Override
    public String toString() {
        return "Lanelegxref{" +
                "laneid=" + laneid +
                ", fromlocationid='" + fromlocationid + '\'' +
                ", tolocationid='" + tolocationid + '\'' +
                ", carrierno='" + carrierno + '\'' +
                ", leadtimeinhours=" + leadtimeinhours +
                ", deletedatetime=" + deletedatetime +
                ", createdatetime=" + createdatetime +
                ", createuserid='" + createuserid + '\'' +
                ", updatedatetime=" + updatedatetime +
                ", updateuserid='" + updateuserid + '\'' +
                ", lanemaster=" + lanemaster +
                ", locationmaster=" + locationmaster +
                ", carriermaster=" + carriermaster +
                ", globallookup=" + globallookup +
                '}';
    }
}
