package org.honshe.hspider.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by honshe on 2016/6/15.
 */
@RestController
@RequestMapping("server")
public class ServerRestController {
    
    @RequestMapping(value = "myServers",method = RequestMethod.GET)
    public String myServers() {
        return "myServers";
    }
}
