package org.honshe.hspider.jpa.spider;

import org.honshe.hspider.domain.spider.SpiderView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by honshe on 2016/6/15.
 */
@Repository
public interface SpiderViewRepository extends JpaRepository<SpiderView,Long> {
}
