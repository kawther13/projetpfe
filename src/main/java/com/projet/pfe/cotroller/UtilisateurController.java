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

import com.projet.pfe.model.Utilisateur;
import com.projet.pfe.service.UtilisateurService;

@RestController 
@CrossOrigin(origins = "*")
public class UtilisateurController {

	//autowire the BooksService class  
	@Autowired  
	UtilisateurService utilisateurService;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/utilisateur")
	
	private List<Utilisateur> getAllUtilisateurs()   
	{  
		return utilisateurService.getAllUtilisateurs();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/utilisateur/{utilisateurid}")  
	private Utilisateur getClients(@PathVariable("utilisateurid") int utilisateurid)   
	{  
		return utilisateurService.getUtilisateursById(utilisateurid);  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/utilisateur/{utilisateurid}")  
	private void deleteClient(@PathVariable("utilisateurid") int utilisateurid)   
	{  
		utilisateurService.delete(utilisateurid);  
	} 

	@PostMapping("/utilisateur")  
	private int saveClient(@RequestBody Utilisateur utilisateur)   
	{  
		utilisateurService.saveOrUpdate(utilisateur);  
		return utilisateur.getID_UT();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/utilisateur")  
	private Utilisateur update(@RequestBody  Utilisateur utilisateur)   
	{  
		utilisateurService.saveOrUpdate(utilisateur);  
		return utilisateur;  
	}}  


