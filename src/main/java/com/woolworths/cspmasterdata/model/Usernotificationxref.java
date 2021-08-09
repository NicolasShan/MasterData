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
@IdClass(UsernotificationxrefPK.class)
public class Usernotificationxref {
    @Id
    @Column(insertable = false, updatable = false, name = "userid", nullable = false, length = 100)
    private String userid;
    @Id
    @Column(name = "notificationtype", nullable = false, length = 10, insertable = false, updatable = false)
    private String notificationtype;
    @Id
    @Column(name = "notificationcat", nullable = false, length = 10, insertable = false, updatable = false)
    private String notificationcat;
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
    @JoinColumns({@JoinColumn(name = "notificationtype", referencedColumnName = "notificationtype", insertable = false, updatable = false),
            @JoinColumn(name = "notificationcat", referencedColumnName = "notificationcat", insertable = false, updatable = false)})
    private Notificationtype notificationtypes;
}
