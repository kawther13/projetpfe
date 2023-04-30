package com.projet.pfe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.pfe.model.Utilisateur;
import com.projet.pfe.repository.UtilisateurRepository;
@Service 
public class UtilisateurService {
	@Autowired  
	UtilisateurRepository utilisateurRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Utilisateur> getAllUtilisateurs()   
	{  
		List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();  
		utilisateurRepository.findAll().forEach(utilisateur1 -> utilisateurs.add(utilisateur1));  
		return utilisateurs ;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Utilisateur getUtilisateursById(int id)   
	{  
		return utilisateurRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Utilisateur utilisateurs)   
	{  
		utilisateurRepository.save(utilisateurs);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		utilisateurRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Utilisateur utilisateurs, int utilisateurid)   
	{  
		utilisateurRepository.save( utilisateurs);  
	}  


}




