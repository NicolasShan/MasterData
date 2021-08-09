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
@IdClass(UserdetailsPK.class)
public class Userdetails {
    @Id
    @Column(name = "userid", nullable = false, length = 100, insertable = false, updatable = false)
    private String userid;
    @Id
    @Column(name = "customerno", nullable = false, length = 100, insertable = false, updatable = false)
    private String customerno;
    @Id
    @Column(name = "carrierno", nullable = false, length = 100, insertable = false, updatable = false)
    private String carrierno;
    private String firstname;
    private String middlename;
    private String lastname;
    private String phonenumber;
    private String profilephoto;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "customerno", referencedColumnName = "customerno", insertable = false, updatable = false)
    private Customermaster customermaster;

    @ManyToOne
    @JoinColumn(name = "carrierno", referencedColumnName = "carrierno", insertable = false, updatable = false)
    private Carriermaster carriermaster;

    @OneToMany(targetEntity = Userrolexref.class, mappedBy = "userdetails", cascade=CascadeType.ALL)
    private List<Userrolexref> userrolexrefList = new ArrayList<Userrolexref>();

    @OneToMany(targetEntity = Usernotificationxref.class, mappedBy = "userdetails", cascade=CascadeType.ALL)
    private List<Usernotificationxref> usernotificationxrefList = new ArrayList<Usernotificationxref>();
}
