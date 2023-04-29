package com.projet.pfe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.projet.pfe.model.Lignecommande;

import com.projet.pfe.repository.LigcommandeRepository;
@Service
public class LigcommandeService {
	@Autowired  
	LigcommandeRepository ligcommandeRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Lignecommande> getLignecommandes()   
	{  
		List<Lignecommande> lignecommandes = new ArrayList<Lignecommande>();  
		ligcommandeRepository.findAll().forEach(lignecommande1 -> lignecommandes.add(lignecommande1));  
		return lignecommandes;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Lignecommande getLignecommandesById(int id)   
	{  
		return ligcommandeRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Lignecommande lignecommandes)   
	{  
		ligcommandeRepository.save(lignecommandes);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		ligcommandeRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Lignecommande lignecommandes, int lignecommandeid)   
	{  
		ligcommandeRepository.save( lignecommandes);  
	}  


}



