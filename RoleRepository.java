package com.springbootexample.user;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleRepository
extends PagingAndSortingRepository<Role, String>{

}
