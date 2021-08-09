package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
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
}
