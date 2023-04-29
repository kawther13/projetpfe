package com.projet.pfe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.pfe.model.Devis;
import com.projet.pfe.repository.DevisRepository;
@Service 
public class DevisService {

	@Autowired  
	DevisRepository devisRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Devis> getAllDevis()   
	{  
		List<Devis> devis = new ArrayList<Devis>();  
		devisRepository.findAll().forEach(devis1 -> devis.add(devis1));  
		return devis;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Devis getdevisById(int id)   
	{  
		return devisRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Devis devis)   
	{  
		devisRepository.save(devis);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		devisRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Devis devis, int numdev)   
	{  
		devisRepository.save( devis);  
	}  


}


