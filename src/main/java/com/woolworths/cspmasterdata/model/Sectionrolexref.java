package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@IdClass(SectionrolexrefPK.class)
public class Sectionrolexref {
    @Id
    @Column(name = "screensectionid", nullable = false, length = 100, insertable = false, updatable = false)
    private String screensectionid;
    @Id
    @Column(name = "accessroleid", nullable = false, length = 100, insertable = false, updatable = false)
    private String accessroleid;
    private String allsectionind;
    private String accesstype;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @ManyToOne
    @JoinColumn(name = "screensectionid", referencedColumnName = "screensectionid", insertable = false, updatable = false)
    private Screensectionmaster screensectionmaster;

    @ManyToOne
    @JoinColumn(name = "accessroleid", referencedColumnName = "accessroleid", insertable = false, updatable = false)
    private Accessrolemaster accessrolemaster;
}
