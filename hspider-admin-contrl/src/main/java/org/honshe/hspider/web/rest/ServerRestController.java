package org.honshe.hspider.web.rest;

import org.honshe.hspider.domain.server.Server;
import org.honshe.hspider.service.server.ServerService;
import org.honshe.msg.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by honshe on 2016/6/15.
 */
@RestController
@RequestMapping("server")
public class ServerRestController {

    @Autowired
    ServerService serverService;
    
    @RequestMapping(value = "myServers",method = RequestMethod.GET)
    public RestResult myServers() {
        RestResult result = new RestResult();
        List<Server> servers = serverService.findAll();
        result.getData().put("servers", servers);
        return result;
    }
}
