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

import com.projet.pfe.model.Article;
import com.projet.pfe.service.ArticleService;


@RestController 
@CrossOrigin(origins = "*")
public class ArticleController {

	@Autowired  
	ArticleService articleService;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/article")
	
	private List<Article> getAllArticles()   
	{  
		return articleService.getAllArticles();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/commande/{commandeid}")  
	private Article getArticles(@PathVariable("articleid") int articleid)   
	{  
		return articleService.getArticlesById(articleid);  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/article/{articleid}")  
	private void deleteArticle(@PathVariable("articleid") int articleid)   
	{  
		articleService.delete(articleid);  
	} 

	@PostMapping("/article")  
	private int saveArticle(@RequestBody Article article)   
	{  
		articleService.saveOrUpdate(article);  
		return article.getID_ART();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/article")  
	private Article update(@RequestBody  Article article)   
	{  
		articleService.saveOrUpdate(article);  
		return article;  
	}}  



