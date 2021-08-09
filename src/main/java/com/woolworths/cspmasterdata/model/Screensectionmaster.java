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
public class Screensectionmaster {
    @Id
    @Column(name = "screensectionid", nullable = false, length = 100)
    private String screensectionid;
    private String description;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "screenid", referencedColumnName = "screenid", insertable = false, updatable = false)
    private Screenmaster screenmaster;

    @OneToMany(targetEntity = Sectionrolexref.class, mappedBy = "screensectionmaster", cascade=CascadeType.ALL)
    private List<Sectionrolexref> sectionrolexrefList = new ArrayList<Sectionrolexref>();
}
