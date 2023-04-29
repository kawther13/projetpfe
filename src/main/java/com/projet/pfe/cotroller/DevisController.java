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

import com.projet.pfe.model.Devis;
import com.projet.pfe.service.DevisService;


@RestController 
@CrossOrigin(origins = "*")
public class DevisController {
	//autowire the BooksService class  
	@Autowired  
	DevisService devisService;

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/devis")
	
	private List<Devis> getAllDevis()   
	{  
		return devisService.getAllDevis();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/devis/{numdev}")  
	private Devis getAllDevis(@PathVariable("numDev") int numDev)   
	{  
		return devisService.getdevisById(numDev);  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/devis/{numdev}")  
	private void deleteDevis(@PathVariable("numdev") int numdev)   
	{  
		devisService.delete(numdev);  
	} 

	@PostMapping("/devis")  
	private int saveDevis(@RequestBody Devis devis)   
	{  
		devisService.saveOrUpdate( devis);  
		return  devis.getNUM_DEV();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/client")  
	private Devis update(@RequestBody  Devis devis)   
	{  
		devisService.saveOrUpdate(devis);  
		return devis;  
	}}  


