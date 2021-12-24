//package tiny;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import tiny.domain.TinyUrlModel;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//@Configuration
//public class RedisConfig {
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    private RedisConnectionFactory redisConnectionFactory;
//
//    @SuppressWarnings({"rawtypes", "unchecked"})
//    @Bean
//    public RedisTemplate<String, TinyUrlModel> redisTemplate() {
//        final Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(TinyUrlModel.class);
//        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
//        final RedisTemplate<String, TinyUrlModel> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(redisConnectionFactory);
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
//        return redisTemplate;
//    }
//}
