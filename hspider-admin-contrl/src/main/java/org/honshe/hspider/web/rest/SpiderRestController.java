package org.honshe.hspider.web.rest;

import org.honshe.hspider.domain.server.Server;
import org.honshe.hspider.domain.spider.SpiderBaseInfo;
import org.honshe.hspider.domain.spider.SpiderView;
import org.honshe.hspider.service.server.ServerService;
import org.honshe.hspider.spider.SpiderBaseInfoService;
import org.honshe.hspider.spider.SpiderViewService;
import org.honshe.msg.RestResult;
import org.honshe.util.number.NumberFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by honshe on 2016/6/15.
 */
@RestController
@RequestMapping("spider")
public class SpiderRestController {

    @Autowired
    SpiderViewService spiderViewService;
    @Autowired
    SpiderBaseInfoService spiderBaseInfoService;
    
    @RequestMapping(value = "mySpiders",method = RequestMethod.GET)
    public RestResult myServers() {
        RestResult result = new RestResult();
        List<SpiderView> spiderViews = spiderViewService.findAll();
        result.getData().put("spiders", spiderViews);
        return result;
    }

    @RequestMapping(value = "spiderDetail", method = RequestMethod.GET)
    public RestResult spiderDetail(String spiderId) {
        Long sid = NumberFormat.String2Long(spiderId);
        SpiderBaseInfo spider = spiderBaseInfoService.findOne(sid);
        RestResult result = new RestResult();
        result.getData().put("spider", spider);
        return result;
    }
}
