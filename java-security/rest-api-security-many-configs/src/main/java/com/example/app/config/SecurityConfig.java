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
	public static class SecuredConfig extends WebSecurityConfigurerAdapter {
    	
    	@Value(value = "${basic.username.security-one}")
        private String username;
        @Value(value = "${basic.password.security-one}")
        private String password;
		
    	@Override
        protected void configure(HttpSecurity http) throws Exception {
       	
        	http
        		.antMatcher("/security-one/**")        	
        			.authorizeRequests()
        				.antMatchers("/security-one/greeting").hasRole("SECURITY-ONE")
        		.and()
            		.httpBasic();

        }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        	
            auth.inMemoryAuthentication()
                    .withUser(username).password("{noop}"+password).roles("SECURITY-ONE");
            
        }   
	    
	}  
    
    @Configuration
	@Order(2)
	public static class NotSecuredConfig extends WebSecurityConfigurerAdapter {
    	
    	@Value(value = "${basic.username.security-two}")
        private String username;
        @Value(value = "${basic.password.security-two}")
        private String password;
		
    	@Override
        protected void configure(HttpSecurity http) throws Exception {
       	
        	http.
        		antMatcher("/security-two/**")
        			.authorizeRequests()
        				.antMatchers("/security-two/greeting").hasRole("SECURITY-TWO")
        			.and()
            			.httpBasic()
            		.and()
            			.csrf()
            				.disable();

        }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        	
            auth.inMemoryAuthentication()
                    .withUser(username).password("{noop}"+password).roles("SECURITY-TWO");
            
        }   
	    
	}  

}
