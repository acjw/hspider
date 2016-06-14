package org.honshe.hspider.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by honshe on 2016/6/14.
 */
@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @Column(name = "admin_id")
    private Long adminId;

    private String name;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
