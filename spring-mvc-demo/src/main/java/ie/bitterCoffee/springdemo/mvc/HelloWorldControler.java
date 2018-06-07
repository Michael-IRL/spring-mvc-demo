package ie.bitterCoffee.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//identify the controller and map it to /hello
@Controller
@RequestMapping("/hello")
public class HelloWorldControler
{
	//map to /hello/showForm
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	//map to /hello/showForm
	@RequestMapping("/proccessForm")
	public String proccessForm()
	{
		return "helloworld";
	}
	
	//Controller method to read form data and add it to the model
	@RequestMapping("/proccessFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		//Read request parameter from HTML form
		String theName = request.getParameter("studentName");
		
		//convert to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "YO! "+theName;
		
		//add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	//Controller method to read form data using binding annotation and add it to the model
	@RequestMapping("/proccessFormVersionThree")
	public String proccessFormVersionThree(@RequestParam("studentName") String theName, Model model)
	{				
		//convert to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Well!! "+theName;
		
		//add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
