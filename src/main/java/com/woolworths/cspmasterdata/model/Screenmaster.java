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
public class Screenmaster {
    @Id
    @Column(name = "screenid", nullable = false, length = 100)
    private String screenid;
    private String description;
    private Date createdatetime;
    private String createuserid;
    private Date updatedatetime;
    private String updateuserid;

    @OneToMany(targetEntity = Screensectionmaster.class, mappedBy = "screenmaster", cascade=CascadeType.ALL)
    private List<Screensectionmaster> screensectionmasterList = new ArrayList<Screensectionmaster>();
}
