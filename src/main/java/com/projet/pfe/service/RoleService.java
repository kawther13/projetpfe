package com.projet.pfe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.projet.pfe.model.Role;

import com.projet.pfe.repository.RoleRepository;
@Service 
public class RoleService {


	@Autowired  
	RoleRepository roleRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Role> getAllRoles()   
	{  
		List<Role> roles = new ArrayList<Role>();  
		roleRepository.findAll().forEach(role1 -> roles.add(role1));  
		return roles;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Role getRolesById(int id)   
	{  
		return roleRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Role roles)   
	{  
		roleRepository.save(roles);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		roleRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Role roles, int roleid)   
	{  
		roleRepository.save( roles);  
	}  


}


