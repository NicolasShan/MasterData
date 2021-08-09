package com.woolworths.cspmasterdata.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Customermaster {
    @Id
    @Column(name = "customerno", nullable = false, length = 100)
    private String customerno;
    private String salesforceref;
    private String tmsref;
    private String description;
    private String postcode;
    private String city;
    private String streetaddress;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "countryid", referencedColumnName = "countryid", insertable = false, updatable = false)
    private Countrymaster  countrymaster;

    @ManyToOne
    @JoinColumn(name = "districtid", referencedColumnName = "districtid", insertable = false, updatable = false)
    private Districtmaster districtmaster;

    @OneToMany(targetEntity = Transportorder.class, mappedBy = "customermaster", cascade=CascadeType.ALL)
    private Set<Transportorder> orders = new HashSet<Transportorder>();

    @OneToMany(targetEntity = Locationmaster.class, mappedBy = "customermaster", cascade=CascadeType.ALL)
    private List<Locationmaster> locations = new ArrayList<Locationmaster>();

    @OneToMany(targetEntity = Lanemaster.class, mappedBy = "customermaster", cascade=CascadeType.ALL)
    private List<Lanemaster> lanemasterList = new ArrayList<Lanemaster>();

    @OneToMany(targetEntity = Userdetails.class, mappedBy = "customermaster", cascade=CascadeType.ALL)
    private List<Userdetails> Userdetailslist = new ArrayList<Userdetails>();
}
