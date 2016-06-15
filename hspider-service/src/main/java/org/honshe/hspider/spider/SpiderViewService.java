package org.honshe.hspider.spider;

import org.honshe.hspider.domain.spider.SpiderView;
import org.honshe.hspider.jpa.spider.SpiderViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by honshe on 2016/6/15.
 */
@Service
public class SpiderViewService {

    @Autowired
    SpiderViewRepository spiderViewRepository;

    public List<SpiderView> findAll(){
        return spiderViewRepository.findAll();
    }

    public List<SpiderView> findAll(Map<String,String> condition){
        return spiderViewRepository.findAll();
    }
}
