package pl.reaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import pl.reaktor.model.Article;
import pl.reaktor.model.Basket;

@Controller
public class HomeController {
	
	/*@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("helloMessage", "Add a post");
		model.addAttribute("formArticle", new Article("Some title", "Content here...", "tag1, tag2, ...", 0));
		return "index";
	}*/
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("helloMessage", "Wybierz ilość produktów w koszyku:");
		model.addAttribute("formBasket", new Basket(0, 0, 0));
		return "home";
	}



}


