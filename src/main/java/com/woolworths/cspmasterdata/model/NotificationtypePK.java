package com.woolworths.cspmasterdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class NotificationtypePK implements Serializable {
    private String notificationtype;
    private String notificationcat;

    @Column(name = "notificationtype", nullable = false, length = 10)
    @Id
    public String getNotificationtype() {
        return notificationtype;
    }

    public void setNotificationtype(String notificationtype) {
        this.notificationtype = notificationtype;
    }

    @Column(name = "notificationcat", nullable = false, length = 10)
    @Id
    public String getNotificationcat() {
        return notificationcat;
    }

    public void setNotificationcat(String notificationcat) {
        this.notificationcat = notificationcat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationtypePK that = (NotificationtypePK) o;
        return Objects.equals(notificationtype, that.notificationtype) && Objects.equals(notificationcat, that.notificationcat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationtype, notificationcat);
    }
}
