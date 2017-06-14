package pl.reaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityController {
	
	@GetMapping("/login")
	@ResponseBody
	public String strefa(Model model) {
		return "login";
	}
	
	@GetMapping("/wejscie")
	public String wejscie(Model model)  {
		return "strefa";
	}
}
