package top.cfish.redis.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.io.Serializable;

/**
 * @author: isisiwish
 * @date: 2019/5/15
 * @time: 14:20
 */

@Configuration
public class RedisConfig extends CachingConfigurerSupport
{
	@Bean
	public RedisTemplate<String, Serializable> redisTemplate(LettuceConnectionFactory connectionFactory)
	{
		RedisTemplate<String, Serializable> redisTemplate = new RedisTemplate<>();
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
		redisTemplate.setConnectionFactory(connectionFactory);
		return redisTemplate;
	}
}
