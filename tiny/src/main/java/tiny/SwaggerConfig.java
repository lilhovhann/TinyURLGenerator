package tiny;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author lilith
 */
@Configuration
class SwaggerConfig {

    //http://localhost:8004/swagger-ui/index.html
    
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("tiny")
                .pathsToMatch("/api/**")
                .build();
    }


}
