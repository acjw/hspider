package org.honshe.hspider.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by honshe on 2016/6/14.
 */
@ConfigurationProperties(value = "hspider",locations = "classpath:hspider.preperties")
public class HSpiderProperties {

    private final ServerConfig config = new ServerConfig();

    public ServerConfig getConfig() {
        return config;
    }

    public static class ServerConfig {
        @Value("${hspider.fileserver.root:}")
        private String fileServerRoot;

        public ServerConfig() {
        }

        public String getFileServerRoot() {
            return fileServerRoot;
        }

        public void setFileServerRoot(String fileServerRoot) {
            this.fileServerRoot = fileServerRoot;
        }
    }
}
