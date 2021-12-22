package tiny.services;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import tiny.domain.TinyUrlModel;

/**
 *
 * @author lilith
 */
@Service
public class TinyUrlService {

    @Autowired
    private RedisTemplate<String, TinyUrlModel> redisTemplate;

    @Value("${spring.redis.ttl}")
    private long ttl;

    public String createUrl(String url) {
        final String id = Hashing.murmur3_32().hashString(url, StandardCharsets.UTF_8).toString();
        TinyUrlModel tinyUrl = new TinyUrlModel(id, url, LocalDateTime.now());
        redisTemplate.opsForValue().set(id, tinyUrl, ttl, TimeUnit.DAYS);
        return id;
    }
}
