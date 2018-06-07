package ie.bitterCoffee.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//identify the default controller
@Controller
public class HomeController
{
	//Map to /
	@RequestMapping("/")
	public String showPage()
	{
		return "main-menu";
	}
}
