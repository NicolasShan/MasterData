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
@IdClass(NotificationtypePK.class)
public class Notificationtype {
    @Id
    @Column(name = "notificationtype", nullable = false, length = 10)
    private String notificationtype;
    @Id
    @Column(name = "notificationcat", nullable = false, length = 10)
    private String notificationcat;
    private String description;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @OneToMany(targetEntity = Usernotificationxref.class, mappedBy = "notificationtypes", cascade=CascadeType.ALL)
    private List<Usernotificationxref> usernotificationxrefList = new ArrayList<Usernotificationxref>();
}
