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

import com.projet.pfe.model.Lignecommande;
import com.projet.pfe.service.LigcommandeService;

@RestController 
@CrossOrigin(origins = "*")

public class LigcommandeController {
	@Autowired  
	LigcommandeService ligcommandeService;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Lignecommande")
	
	private List<Lignecommande> getLignecommandes()   
	{  
		return ligcommandeService.getLignecommandes();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("//{lignecommandeid}")  
	private Lignecommande getligdevis(@PathVariable("lignecommandeid") int lignecommandeid)   
	{  
		return ligcommandeService.getLignecommandesById(lignecommandeid);  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/lignecommande/{lignecommandeid}")  
	private void deletelignecommande(@PathVariable("lignecommandeid") int lignecommandeid)   
	{  
		ligcommandeService.delete(lignecommandeid);  
	} 

	@PostMapping("/lignecommande")  
	private int saveLignecommande(@RequestBody Lignecommande lignecommande)   
	{  
		ligcommandeService.saveOrUpdate(lignecommande);  
		return lignecommande.getNUM_LIG_CMD();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/lignecommande")  
	private Lignecommande update(@RequestBody Lignecommande lignecommande)   
	{  
		ligcommandeService.saveOrUpdate(lignecommande);  
		return lignecommande;  
	}}  




