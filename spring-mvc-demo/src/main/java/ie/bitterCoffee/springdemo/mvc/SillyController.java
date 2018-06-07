package ie.bitterCoffee.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Identify contorller
@Controller
public class SillyController
{
	//Map to /showForm
	@RequestMapping("/showForm")
	public String displayTheForm()
	{
		return "silly";
	}
}
