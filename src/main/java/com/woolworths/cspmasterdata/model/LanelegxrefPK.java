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
import java.math.BigInteger;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class LanelegxrefPK implements Serializable {
    private BigInteger laneid;
    private String fromlocationid;
    private String tolocationid;
    private String carrierno;

    @Column(name = "laneid", nullable = false, precision = 0)
    @Id
    public BigInteger getLaneid() {
        return laneid;
    }

    public void setLaneid(BigInteger laneid) {
        this.laneid = laneid;
    }

    @Column(name = "fromlocationid", nullable = false, length = 100)
    @Id
    public String getFromlocationid() {
        return fromlocationid;
    }

    public void setFromlocationid(String fromlocationid) {
        this.fromlocationid = fromlocationid;
    }

    @Column(name = "tolocationid", nullable = false, length = 100)
    @Id
    public String getTolocationid() {
        return tolocationid;
    }

    public void setTolocationid(String tolocationid) {
        this.tolocationid = tolocationid;
    }

    @Column(name = "carrierno", nullable = false, length = 100, insertable = false, updatable = false)
    @Id
    public String getCarrierno() {
        return carrierno;
    }

    public void setCarrierno(String carrierno) {
        this.carrierno = carrierno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanelegxrefPK that = (LanelegxrefPK) o;
        return Objects.equals(laneid, that.laneid) && Objects.equals(fromlocationid, that.fromlocationid) && Objects.equals(tolocationid, that.tolocationid) && Objects.equals(carrierno, that.carrierno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(laneid, fromlocationid, tolocationid, carrierno);
    }
}
