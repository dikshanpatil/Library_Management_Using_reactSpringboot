package com.dikshadesign.springbootlibrary.config;

import com.okta.spring.boot.oauth.Okta;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;

@Configuration
public class SecurityConfiguaration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        //disable cross site request forgery
        http.csrf().disable();

        //protect end point with /api/<type>/secure
        http.authorizeRequests(configurer ->
                configurer
                        .antMatchers("/api/books/secure/**",
                                                 "/api/reviews/secure/**",
                                                 "/api/messages/secure/**",
                                                  "/api/admin/secure/**")
                        .authenticated())
                        .oauth2ResourceServer()
                        .jwt();

        //aadd CORS filter to api endpoints
        http.cors();

        //add content to negotiating stratergy
        http.setSharedObject(ContentNegotiationStrategy.class,
                            new HeaderContentNegotiationStrategy());

        //force a non empty responsee body for 401 to make the response friendly
        Okta.configureResourceServer401ResponseBody(http);

        return http.build();
    }
}
