package com.hdbandit.cache_control_starter;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.hdbandit.cache_control.CacheControlConfig;

@Configuration
@Import(CacheControlConfig.class)
public class CacheControlAutoConfiguration {


}
