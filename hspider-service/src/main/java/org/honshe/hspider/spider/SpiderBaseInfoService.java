package org.honshe.hspider.spider;

import org.honshe.hspider.domain.spider.SpiderBaseInfo;
import org.honshe.hspider.jpa.spider.SpiderBaseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by honshe on 2016/6/15.
 */
@Service
public class SpiderBaseInfoService {

    @Autowired
    SpiderBaseInfoRepository spiderBaseInfoRepository;

    public SpiderBaseInfo findOne(Long spiderId) {
        return spiderBaseInfoRepository.findOne(spiderId);
    }
}
