package com.springbootexample.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity

public class Role {
    @Id
   
    private Integer id;
    private String name;

    public Role(Integer id, String name, List<UserRecord> users) {
		super();
		this.id = id;
		this.name = name;
		this.users = users;
	}
    
    public Role(){
    	
    }

	@ManyToMany
    private List<UserRecord> users;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserRecord> getUsers() {
		return users;
	}

	public void setUsers(List<UserRecord> users) {
		this.users = users;
	}
}
