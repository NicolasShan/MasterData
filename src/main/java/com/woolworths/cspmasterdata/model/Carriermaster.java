package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Carriermaster {
    @Id
    private String carrierno;
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

    @OneToMany(targetEntity = Userdetails.class, mappedBy = "carriermaster", cascade=CascadeType.ALL)
    private List<Userdetails> Userdetailslist = new ArrayList<Userdetails>();

    @OneToMany(targetEntity = Lanelegxref.class, mappedBy = "carriermaster", cascade=CascadeType.ALL)
    private List<Lanelegxref> lanelegxrefList = new ArrayList<Lanelegxref>();
}
