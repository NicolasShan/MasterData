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
public class Districtmaster {
    @Id
    @Column(name = "districtid", nullable = false, length = 10)
    private String districtid;
    private String description;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @OneToMany(targetEntity = Locationmaster.class, mappedBy = "districtmaster", cascade=CascadeType.ALL)
    private List<Locationmaster> locations = new ArrayList<Locationmaster>();

    @OneToMany(targetEntity = Carriermaster.class, mappedBy = "districtmaster", cascade=CascadeType.ALL)
    private List<Carriermaster> carrierlist = new ArrayList<Carriermaster>();

    @OneToMany(targetEntity = Customermaster.class, mappedBy = "districtmaster", cascade=CascadeType.ALL)
    private List<Customermaster> customerlist = new ArrayList<Customermaster>();
}
