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
public class Countrymaster {
    @Id
    @Column(name = "countryid", nullable = false, length = 10)
    private String countryid;
    private String description;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @OneToMany(targetEntity = Carriermaster.class, mappedBy = "countrymaster",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Carriermaster> carrierlist;

    @OneToMany(targetEntity = Customermaster.class, mappedBy = "countrymaster", cascade = CascadeType.ALL)
    private List<Customermaster> customerlist = new ArrayList<Customermaster>();

    @OneToMany(targetEntity = Locationmaster.class, mappedBy = "countrymaster", cascade = CascadeType.ALL)
    private List<Locationmaster> locations = new ArrayList<Locationmaster>();
}
