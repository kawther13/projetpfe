package com.projet.pfe.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projet.pfe.model.Role;
import com.projet.pfe.service.RoleService;
@RestController 
@CrossOrigin(origins = "*")
public class RoleController {


	//autowire the BooksService class  
		@Autowired  
		RoleService roleService;  

		//creating a get mapping that retrieves all the books detail from the database   
		@GetMapping("/role")
		
		private List<Role> getAllRoles()    
		{  
			return roleService.getAllRoles();  
		}  

		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/Role/{roleid}")  
		private Role getRoles(@PathVariable("roleid") int roleid)   
		{  
			return roleService.getRolesById(roleid);  
		}  


		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/role/{roleid}")  
		private void deleterole(@PathVariable("roleid") int roleid)   
		{  
			roleService.delete(roleid);  
		} 

		@PostMapping("/role")  
		private int saveClient(@RequestBody Role role)   
		{  
			roleService.saveOrUpdate(role);  
			return role.getID_ROLE();  
		} 

		//creating put mapping that updates the book detail
		//@CrossOrigin(origins = "*")
		@PutMapping("/role")  
		private Role update(@RequestBody  Role role)   
		{  
			roleService.saveOrUpdate(role);  
			return role;  
		}}  

