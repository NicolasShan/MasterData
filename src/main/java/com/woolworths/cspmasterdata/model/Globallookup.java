package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
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
}
