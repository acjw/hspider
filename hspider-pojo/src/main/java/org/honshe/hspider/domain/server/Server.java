package org.honshe.hspider.domain.server;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by honshe on 2016/6/15.
 */
@Entity
@Table(name = "server")
public class Server implements Serializable {

    @Id
    @Column(name = "server_id")
    private Long serverId;
    @Column(name = "server_name")
    private String serverName;
    @Column(name = "server_ip")
    private String serverIp;
    @Column(name = "create_time")
    private Date createTime;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
