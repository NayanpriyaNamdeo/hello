package com.springbootexample.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	public void addrole(List<Role> role) {
		 roleRepository.save(role);

	}
}
