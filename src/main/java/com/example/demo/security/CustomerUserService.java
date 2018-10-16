package com.example.demo.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * spring 登陆
 * 
 * @author Administrator
 *
 */
@Service
public class CustomerUserService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		List<GrantedAuthority> list = new ArrayList<>();
		list.add(new SimpleGrantedAuthority("admin"));
		// TODO Auto-generated method stub
		return new User(name, new BCryptPasswordEncoder().encode("123"), list);
	}

}
