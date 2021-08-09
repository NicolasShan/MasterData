package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;
import java.util.*;
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Locationmaster {
    @Id
    @Column(name = "locationid", nullable = false, length = 100)
    private String locationid;
    private String shortdescription;
    private String description;
    private String postcode;
    private String city;
    private String streetaddress;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;
    @ManyToOne
    @JoinColumn(name = "customerno", referencedColumnName = "customerno", insertable = false, updatable = false)
    private Customermaster customermaster;

    @ManyToOne
    @JoinColumn(name = "districtid", referencedColumnName = "districtid", insertable = false, updatable = false)
    private Districtmaster districtmaster;

    @ManyToOne
    @JoinColumn(name = "countryid", referencedColumnName = "countryid", insertable = false, updatable = false)
    private Countrymaster countrymaster;

    @OneToMany(targetEntity = Transportorder.class, mappedBy = "locationmaster", cascade=CascadeType.ALL)
    private Set<Transportorder> orders = new HashSet<Transportorder>();

    @OneToMany(targetEntity = Lanemaster.class, mappedBy = "locationmaster", cascade=CascadeType.ALL)
    private List<Lanemaster> lanemasterList = new ArrayList<Lanemaster>();

    @OneToMany(targetEntity = Lanelegxref.class, mappedBy = "locationmaster", cascade=CascadeType.ALL)
    private List<Lanelegxref> lanelegxrefList = new ArrayList<Lanelegxref>();
}
