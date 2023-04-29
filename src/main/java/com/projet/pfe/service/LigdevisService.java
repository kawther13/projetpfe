package com.projet.pfe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.pfe.model.Ligdevis;
import com.projet.pfe.repository.LigdevisRepository;

@Service
public class LigdevisService {
	@Autowired  
	LigdevisRepository ligdevisRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Ligdevis> getLignedevis()   
	{  
		List<Ligdevis> lignedevis = new ArrayList<Ligdevis>();  
		ligdevisRepository.findAll().forEach(ligdevis1 -> lignedevis.add(ligdevis1));  
		return lignedevis;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Ligdevis getLignedevisById(int id)   
	{  
		return ligdevisRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Ligdevis lignedevis)   
	{  
		ligdevisRepository.save(lignedevis);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		ligdevisRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Ligdevis lignedevis, int lignedevisid)   
	{  
		ligdevisRepository.save( lignedevis);  
	}  


}





