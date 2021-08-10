package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UserdetailsPK implements Serializable {
    private String userid;
    private String customerno;
    private String carrierno;

    @Column(name = "userid", nullable = false, length = 100, insertable = false, updatable = false)
    @Id
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Column(name = "customerno", nullable = false, length = 100, insertable = false, updatable = false)
    @Id
    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
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
        UserdetailsPK that = (UserdetailsPK) o;
        return Objects.equals(userid, that.userid) && Objects.equals(customerno, that.customerno) && Objects.equals(carrierno, that.carrierno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, customerno, carrierno);
    }
}
