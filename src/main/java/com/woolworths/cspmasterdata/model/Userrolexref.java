package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@IdClass(UserrolexrefPK.class)
public class Userrolexref {
    @Id
    @Column(name = "userid", nullable = false, length = 100, insertable = false, updatable = false)
    private String userid;
    @Id
    @Column(name = "accessroleid", nullable = false, length = 100, insertable = false, updatable = false)
    private String accessroleid;
    @Id
    @Column(name = "customerno", nullable = false, length = 100, insertable = false, updatable = false)
    private String customerno;
    @Id
    @Column(name = "carrierno", nullable = false, length = 100, insertable = false, updatable = false)
    private String carrierno;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "userid", referencedColumnName = "userid", insertable = false, updatable = false),
            @JoinColumn(name = "customerno", referencedColumnName = "customerno", insertable = false, updatable = false),
            @JoinColumn(name = "carrierno", referencedColumnName = "carrierno", insertable = false, updatable = false)})
    private Userdetails userdetails;

    @ManyToOne
    @JoinColumn(name = "accessroleid", referencedColumnName = "accessroleid", insertable = false, updatable = false)
    private Accessrolemaster accessrolemaster;
}
