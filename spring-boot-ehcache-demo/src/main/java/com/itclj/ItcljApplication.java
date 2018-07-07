package com.itclj;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Ehcache demo
 * Created by lujun.chen on 2017/3/6.
 */
@EnableCaching
@EnableScheduling
@SpringBootApplication
public class ItcljApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(ItcljApplication.class)
                .profiles("app").run(args);
    }

}
