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
public class Accessrolemaster {
    @Id
    @Column(name = "accessroleid", nullable = false, length = 100)
    private String accessroleid;
    private String description;
    private String roletype;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @OneToMany(targetEntity = Sectionrolexref.class, mappedBy = "accessrolemaster", cascade = CascadeType.ALL)
    private List<Sectionrolexref> sectionrolexrefList = new ArrayList<Sectionrolexref>();

    @OneToMany(targetEntity = Userrolexref.class, mappedBy = "accessrolemaster", cascade = CascadeType.ALL)
    private List<Userrolexref> userrolexrefList = new ArrayList<>();
}
