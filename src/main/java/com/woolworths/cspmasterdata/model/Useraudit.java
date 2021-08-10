package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Useraudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String userid;
    private Date acesstime;
    private String screenid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userid", nullable = false, length = 100)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "acesstime", nullable = false)
    public Date getAcesstime() {
        return acesstime;
    }

    public void setAcesstime(Date acesstime) {
        this.acesstime = acesstime;
    }

    @Basic
    @Column(name = "screenid", nullable = false, length = 100)
    public String getScreenid() {
        return screenid;
    }

    public void setScreenid(String screenid) {
        this.screenid = screenid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Useraudit useraudit = (Useraudit) o;
        return Objects.equals(userid, useraudit.userid) && Objects.equals(acesstime, useraudit.acesstime) && Objects.equals(screenid, useraudit.screenid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, acesstime, screenid);
    }
}
