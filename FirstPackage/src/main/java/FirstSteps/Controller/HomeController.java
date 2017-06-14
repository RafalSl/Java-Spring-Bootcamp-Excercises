package FirstSteps.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import FirstSteps.Model.Info;
import FirstSteps.Model.Targi;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		Targi targi1 = new Targi();
		model.addAttribute(targi1);
		return "form";
	}
	
	@RequestMapping(value="/zapis")
	public String zapis() {
		
		return "zapis";
	}
	
	@RequestMapping(value="/contact")
	public String contact() {
		
		return "contact";
	}
	
	@RequestMapping(value = "/info", method = RequestMethod.POST)
	public String info(Model model) {
		Info info = new Info();
		model.addAttribute(info);
		return "info";
	}
}
