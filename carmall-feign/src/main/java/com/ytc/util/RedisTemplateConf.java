/**
 * Copyright (C), 2019, 因特驰
 * FileName: RedisTemplateConf
 * Author:   zyl
 * Date:     2020/9/9 9:23
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.util;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/9/9
 * @since 1.0.0
 */
@Configuration  //代表你是一个配置类  并且是注入到spring中交给spring管理
@EnableCaching  //使用缓存
public class RedisTemplateConf extends CachingConfigurerSupport {
    //把当前这个方法交给spring管理
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(connectionFactory);
        // 使用Jackson2JsonRedisSerializer来序列化/反序列化redis的value值
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(
                Object.class);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL,
                com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY);
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
        // value
        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);

        // 使用StringRedisSerializer来序列化/反序列化redis的key值
        RedisSerializer<?> redisSerializer = new StringRedisSerializer();
        // key
        redisTemplate.setKeySerializer(redisSerializer);
        redisTemplate.setHashKeySerializer(redisSerializer);

        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }
}
