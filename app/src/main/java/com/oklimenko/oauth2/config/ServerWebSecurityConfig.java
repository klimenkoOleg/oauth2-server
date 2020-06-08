package com.oklimenko.oauth2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
@EnableWebSecurity
//!!!!! remove EnableGlobalAuthentication - after this!!
@EnableGlobalAuthentication
public class ServerWebSecurityConfig extends WebSecurityConfigurerAdapter {
     @Override
     protected void configure(HttpSecurity http) throws Exception {
         http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().httpBasic().and().csrf()
                 .disable();
     }

     @Autowired
     public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
         auth.inMemoryAuthentication().withUser("username").password("password").authorities("ROLE_USER").and()
                 .passwordEncoder(NoOpPasswordEncoder.getInstance());
     }

     @Bean
     public TokenStore tokenStore() {
         return new InMemoryTokenStore();
     }

     @Bean
     @Primary
     public DefaultTokenServices tokenServices() {
         DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
         defaultTokenServices.setTokenStore(tokenStore());
         defaultTokenServices.setSupportRefreshToken(true);
         defaultTokenServices.setAccessTokenValiditySeconds(5000);
         defaultTokenServices.setRefreshTokenValiditySeconds(5000);
         return defaultTokenServices;
     }

     @Bean
     @Override
     protected AuthenticationManager authenticationManager() throws Exception {
         return super.authenticationManager();
     }

 }

 /*   @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

}*/