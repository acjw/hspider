package org.honshe.hspider.domain.spider;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by honshe on 2016/6/15.
 */
@Entity
@Table(name = "spider_base_info")
public class SpiderBaseInfo {

    @Id
    @Column(name = "spider_id")
    private Long spiderId;
    @Column(name = "server_id")
    private Long serverId;
    @Column(name = "spider_name")
    private String spiderName;


    public Long getSpiderId() {
        return spiderId;
    }

    public void setSpiderId(Long spiderId) {
        this.spiderId = spiderId;
    }

    public String getSpiderName() {
        return spiderName;
    }

    public void setSpiderName(String spiderName) {
        this.spiderName = spiderName;
    }
}
