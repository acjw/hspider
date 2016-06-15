package org.honshe.hspider.jpa.server;

import org.honshe.hspider.domain.server.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by honshe on 2016/6/15.
 */
@Repository
public interface ServerRepository extends JpaRepository<Long,Server> {
}
