package pl.reaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.reaktor.model.Basket;

@Controller
public class BasketController {
	 @PostMapping("/buy") 
	 public String addArticle(@ModelAttribute Basket formBasket, Model model) { 
		 model.addAttribute("formBasket", formBasket);
		 if(formBasket.getI1() > 0) {
			 formBasket.setC1(formBasket.getI1() * 100);
		 }
		 if(formBasket.getI2() > 0) {
			 formBasket.setC2(formBasket.getI2() * 99.9);
		 }
		 if(formBasket.getI3() > 0) {
			 formBasket.setC3(formBasket.getI3() * 500);
		 }
		 formBasket.suma();
		 return "basket"; 
	 }

}