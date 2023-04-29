package com.projet.pfe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.pfe.model.Article;
import com.projet.pfe.repository.ArticleRepository;


@Service
public class ArticleService {

	@Autowired  
	ArticleRepository articleRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Article> getAllArticles()   
	{  
		List<Article> articles = new ArrayList<Article>();  
		articleRepository.findAll().forEach(article1 -> articles.add(article1));  
		return articles;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Article getArticlesById(int id)   
	{  
		return articleRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Article articles)   
	{  
		 articleRepository.save(articles);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		articleRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Article articles, int articleid)   
	{  
		articleRepository.save( articles);  
	}  


}


