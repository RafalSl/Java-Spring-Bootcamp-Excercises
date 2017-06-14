package pl.reaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.reaktor.model.Article;

@Controller
public class ArticleController {
	 @PostMapping("/add") 
	    public String addArticle(@ModelAttribute Article formArticle, Model model) { 
	        if(checkNotEmpty(formArticle) && checkDefault(formArticle)) { 
	        	if (checkAge(formArticle)) {
	        		String newContent = formArticle.addText(formArticle.getContent());	        		
	        		formArticle.setContent(newContent);
	        		model.addAttribute("formArticle", formArticle); 
		            return "success"; 
	        	} else 
		            return "redirect:young";       	   
	        } else 
	            return "redirect:sorry"; 
	 }
	 
	 @GetMapping("/sorry") 
	 public String error() { 
	     return "error";
	 } 
	 
	 @GetMapping("/young") 
	 public String young() { 
	     return "toYoung"; 
	 } 
	 
	 private boolean checkNotEmpty(Article article) { 
	     return (article.getTitle()!=null && article.getTitle().length()>0 ) && (article.getContent()!=null && article.getContent().length()>0); 
	 }  
	 
	 private boolean checkDefault(Article article) { 
	     return (!(article.getTitle().equals("Some title") || article.getContent().equals("Content here..."))); 
	 }  
	 
	 private boolean checkAge(Article article) { 
	     return (article.getAge() >= 18); 
	 }  
}