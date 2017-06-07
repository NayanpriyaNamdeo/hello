package com.springbootexample.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
	
	
		
		@Autowired
		private RoleService roleService;	
	

	@RequestMapping(value = "/add-role", method = RequestMethod.POST)
	public void addRole(@RequestBody List<Role> role) {
		
		roleService.addrole(role);
	}
}
