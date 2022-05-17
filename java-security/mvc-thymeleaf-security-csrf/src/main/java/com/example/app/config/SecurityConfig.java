package com.example.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig {
	
    
	@Configuration
	@Order(1)
	public static class GreetingConfig extends WebSecurityConfigurerAdapter {
    	
    	@Value(value = "${basic.username}")
        private String username;
        @Value(value = "${basic.password}")
        private String password;
		
    	@Override
        protected void configure(HttpSecurity http) throws Exception {
       	
        	http
        		.antMatcher("/greeting")        	
        			.authorizeRequests()
        				.antMatchers("/greeting").hasRole("USER")
        		.and()
            		.httpBasic();

        }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        	
            auth.inMemoryAuthentication()
                    .withUser(username).password("{noop}"+password).roles("USER");
            
        }   
	    
	} 
	
	@Configuration
	@Order(2)
	public static class SecuredConfig extends WebSecurityConfigurerAdapter {
    	
    	@Value(value = "${basic.username}")
        private String username;
        @Value(value = "${basic.password}")
        private String password;
		
    	@Override
        protected void configure(HttpSecurity http) throws Exception {
       	
        	http
        		.antMatcher("/secured-csrf/**")        	
        			.authorizeRequests()
        				.antMatchers("/secured-csrf/greeting", "/secured-csrf/greeting-submit").hasRole("USER")
        		.and()
            		.httpBasic();

        }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        	
            auth.inMemoryAuthentication()
                    .withUser(username).password("{noop}"+password).roles("USER");
            
        }   
	    
	}  
    
    @Configuration
	@Order(3)
	public static class NotSecuredConfig extends WebSecurityConfigurerAdapter {
    	
    	@Value(value = "${basic.username}")
        private String username;
        @Value(value = "${basic.password}")
        private String password;
		
    	@Override
        protected void configure(HttpSecurity http) throws Exception {
       	
        	http.
        		antMatcher("/not-secured-csrf/**")
        			.authorizeRequests()
        				.antMatchers("/not-secured-csrf/greeting", "/not-secured-csrf/greeting-submit").hasRole("USER")
        			.and()
            			.httpBasic()
            		.and()
            			.csrf()
            				.disable();

        }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        	
            auth.inMemoryAuthentication()
                    .withUser(username).password("{noop}"+password).roles("USER");
            
        }   
	    
	}  

}
