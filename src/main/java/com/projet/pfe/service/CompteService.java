package com.projet.pfe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.pfe.model.Compte;

import com.projet.pfe.repository.CompteRepository;
@Service 
public class CompteService {
	@Autowired  
	CompteRepository compteRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Compte> getAllComptes()   
	{  
		List<Compte> comptes = new ArrayList<Compte>();  
		compteRepository.findAll().forEach(compte1 -> comptes.add(compte1));  
		return comptes ;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Compte getComptesById(int id)   
	{  
		return compteRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Compte comptes)   
	{  
		compteRepository.save(comptes);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		compteRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Compte comptes, int compteid)   
	{  
		compteRepository.save( comptes);  
	}  


}



