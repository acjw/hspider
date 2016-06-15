package org.honshe.hspider.service.server;

import org.honshe.hspider.domain.server.Server;
import org.honshe.hspider.jpa.server.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by honshe on 2016/6/15.
 */
@Service
public class ServerService {

    @Autowired
    ServerRepository serverRepository;

    public List<Server> findAll(){
        return serverRepository.findAll();
    }
}
