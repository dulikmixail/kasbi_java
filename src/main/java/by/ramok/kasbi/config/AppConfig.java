package by.ramok.kasbi.config;

        import by.ramok.kasbi.controllers.api.RequestInterceptor;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.data.domain.ExampleMatcher;
        import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
        import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    private final RequestInterceptor requestInterceptor;

    @Autowired
    public AppConfig(RequestInterceptor requestInterceptor) {
        this.requestInterceptor = requestInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestInterceptor);
    }

    @Bean
    public ExampleMatcher MyDefaultExampleMatcher(){
        return ExampleMatcher.matching().withIgnoreNullValues();
    }
}
