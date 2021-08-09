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
public class Lanemaster {
    @Id
    @Column(name = "laneid", nullable = false, precision = 0)
    private BigInteger laneid;
    private BigInteger lanepriority;
    private Date deletedatetime;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "locationid", referencedColumnName = "locationid", insertable = false, updatable = false)
    private Locationmaster locationmaster;

    @ManyToOne
    @JoinColumn(name = "customerno", referencedColumnName = "customerno", insertable = false, updatable = false)
    private Customermaster customermaster;

    @OneToMany(targetEntity = Lanelegxref.class, mappedBy = "lanemaster", cascade=CascadeType.ALL)
    private List<Lanelegxref> lanelegxrefList = new ArrayList<Lanelegxref>();
}
