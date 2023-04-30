package com.projet.pfe.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projet.pfe.model.Compte;
import com.projet.pfe.service.CompteService;



public class CompteController {
	
	//autowire the BooksService class  
	@Autowired  
	CompteService compteService;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/compte")
	
	private List<Compte> getAllComptes()   
	{  
		return compteService.getAllComptes();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/compte/{compteid}")  
	private Compte getComptes(@PathVariable("compteid") int compteid)   
	{  
		return compteService.getComptesById(compteid);  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/compte/{compteid}")  
	private void deleteComptet(@PathVariable("compteid") int compteid)   
	{  
		compteService.delete(compteid);  
	} 

	@PostMapping("/compte")  
	private int saveClient(@RequestBody Compte compte)   
	{  
		compteService.saveOrUpdate(compte);  
		return compte.getID_COMPTE();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/compte")  
	private Compte update(@RequestBody  Compte compte)   
	{  
		compteService.saveOrUpdate(compte);  
		return compte;  
	}}  

