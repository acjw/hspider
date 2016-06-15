package org.honshe.hspider.spider;

import org.honshe.hspider.jpa.spider.SpiderViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by honshe on 2016/6/15.
 */
@Service
public class SpiderViewService {

    @Autowired
    SpiderViewRepository spiderViewRepository;


}
