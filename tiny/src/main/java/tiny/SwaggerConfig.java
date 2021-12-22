package tiny;


import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author armdev
 */
@Configuration
class SwaggerConfig {

  ///http://localhost:8003/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/search-controller/find
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("tiny")
                .pathsToMatch("/api/**")
                .build();
    }


}
