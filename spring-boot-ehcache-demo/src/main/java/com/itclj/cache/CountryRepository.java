package com.itclj.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created by lujun.chen on 2017/3/6.
 */
@Component
@CacheConfig(cacheNames = "countries")
public class CountryRepository {

    private Logger logger = LoggerFactory.getLogger(CountryRepository.class);

    @Cacheable(key = "'country'+#code")
    public Country findByCode(String code) {
        logger.info("---> Loading country with code '{}'",code);
        return new Country(code);
    }

}
