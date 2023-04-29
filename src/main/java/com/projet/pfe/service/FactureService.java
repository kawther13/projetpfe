package com.projet.pfe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.pfe.model.Facture;
import com.projet.pfe.repository.FactureRepository;



@Service
public class FactureService {@Autowired  
	FactureRepository factureRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

		//getting all books record by using the method findaAll() of CrudRepository  
		public List<Facture> getAllFactures()   
		{  
			List<Facture> factures = new ArrayList<Facture>();  
			factureRepository.findAll().forEach(facture1 -> factures.add(facture1));  
			return factures;  	
		}  

		//getting a specific record by using the method findById() of CrudRepository  
		public Facture getFacturesById(int id)   
		{  
			return factureRepository.findById(id).get();  
		}  


		//saving a specific record by using the method save() of CrudRepository  
		public void saveOrUpdate(Facture factures)   
		{  
			factureRepository.save(factures);  
		} 

		//deleting a specific record by using the method deleteById() of CrudRepository  
		public void delete(int id)   
		{  
			factureRepository.deleteById(id);  
		} 

		//updating a record  
		public void update(Facture factures, int factureid)   
		{  
			factureRepository.save( factures);  
		}  


	}


