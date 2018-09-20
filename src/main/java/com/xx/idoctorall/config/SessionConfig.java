package com.xx.idoctorall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

//这个类用配置redis服务器的连接
//maxInactiveIntervalInSeconds为SpringSession的过期时间（单位：秒）
/*@EnableRedisHttpSession(maxInactiveIntervalInSeconds= 1800)*/
public class SessionConfig {
    @Bean
    public JedisConnectionFactory connectionFactory() {
        JedisConnectionFactory connection = new JedisConnectionFactory();
        return connection;
    }
}