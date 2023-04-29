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

import com.projet.pfe.model.Ligdevis;
import com.projet.pfe.service.LigdevisService;


@RestController 
@CrossOrigin(origins = "*")
public class LigdevisController {

	@Autowired  
	LigdevisService ligdevisService;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Lignedevis")
	
	private List<Ligdevis> getLignedevis()   
	{  
		return ligdevisService.getLignedevis();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("//{lignedevisid}")  
	private Ligdevis getdevis(@PathVariable("lignedevisid") int lignedevisid)   
	{  
		return ligdevisService.getLignedevisById(lignedevisid);  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Lignedevis/{lignedevisid}")  
	private void deletelignecommande(@PathVariable("lignedevisid") int lignedevisid)   
	{  
		ligdevisService.delete(lignedevisid);  
	} 

	@PostMapping("/Lignedevis")  
	private int saveLignecommande(@RequestBody Ligdevis ligdevis)   
	{  
		ligdevisService.saveOrUpdate(ligdevis);  
		return ligdevis.getNUM_LIG_DEV();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/Lignedevis")  
	private Ligdevis update(@RequestBody Ligdevis ligdevis)   
	{  
		ligdevisService.saveOrUpdate(ligdevis);  
		return ligdevis;  
	}}  





