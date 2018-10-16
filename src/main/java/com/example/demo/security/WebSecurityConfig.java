package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.formLogin().failureUrl("/login?error").defaultSuccessUrl("/retry").permitAll();
		super.configure(http);
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder, CustomerUserService service) throws Exception {
		// builder.inMemoryAuthentication().passwordEncoder(new
		// BCryptPasswordEncoder()).withUser("test")
		// .password(new BCryptPasswordEncoder().encode("123456")).roles("ADMIN");
		builder.userDetailsService(service).passwordEncoder(new BCryptPasswordEncoder());
	}

}
