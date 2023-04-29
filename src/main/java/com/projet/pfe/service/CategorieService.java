package com.projet.pfe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.pfe.model.Categorie;

import com.projet.pfe.repository.CategorieRepository;

@Service
public class CategorieService {

	@Autowired  
	CategorieRepository categorieRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Categorie> getAllCategories()   
	{  
		List<Categorie> categories = new ArrayList<Categorie>();  
		categorieRepository.findAll().forEach(categorie1 -> categories.add(categorie1));  
		return categories;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Categorie getCategoriesById(int id)   
	{  
		return categorieRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Categorie categories)   
	{  
		categorieRepository.save(categories);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		categorieRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Categorie categories, int categorieid)   
	{  
		categorieRepository.save( categories);  
	}  


}


