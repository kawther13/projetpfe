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

import com.projet.pfe.model.Facture;

import com.projet.pfe.service.FactureService;




@RestController 
@CrossOrigin(origins = "*")
public class FactureController {
	@Autowired  
	FactureService factureService;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/facture")
	
	private List<Facture> getAllFactures()   
	{  
		return factureService.getAllFactures();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/facture/{factureid}")  
	private Facture getClients(@PathVariable("factureid") int factureid)   
	{  
		return factureService.getFacturesById(factureid);  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/facture/{factureid}")  
	private void deleteClient(@PathVariable("factureid") int factureid)   
	{  
		factureService.delete(factureid);  
	} 

	@PostMapping("/facture")  
	private int saveClient(@RequestBody Facture facture)   
	{  
		factureService.saveOrUpdate(facture);  
		return facture.getID_fact();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/facture")  
	private Facture update(@RequestBody  Facture facture)   
	{  
		factureService.saveOrUpdate(facture);  
		return facture;  
	}}  



