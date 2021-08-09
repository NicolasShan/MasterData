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
public class GloballookupPK implements Serializable {
    private String lookupid;
    private String lookupval;

    @Column(name = "lookupid", nullable = false, length = 100)
    @Id
    public String getLookupid() {
        return lookupid;
    }

    public void setLookupid(String lookupid) {
        this.lookupid = lookupid;
    }

    @Column(name = "lookupval", nullable = false, length = 200)
    @Id
    public String getLookupval() {
        return lookupval;
    }

    public void setLookupval(String lookupval) {
        this.lookupval = lookupval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GloballookupPK that = (GloballookupPK) o;
        return Objects.equals(lookupid, that.lookupid) && Objects.equals(lookupval, that.lookupval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lookupid, lookupval);
    }
}
