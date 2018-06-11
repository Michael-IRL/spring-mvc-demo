package ie.bitterCoffee.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//define the Controller and map to /customer
@Controller
@RequestMapping("/customer")
public class CustomerController
{
	//Map showForm() to request /customer/showForm
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("customer", new Customer());		
		return "customer-form";
	}
	
	//Map processForm(..) to request /customer/processForm
	//add the Valid annotation to the ModelAttribute customer which is bound to the Object<Customer> 'theCustomer' 
	//Spring will store the results of the validation in the Object<BindingResult> theBindingResult
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,BindingResult theBindingResult)
	{
		if(theBindingResult.hasErrors())
		{
			return "customer-form";
		}
		else
		{
			return "customer-confirmation";
		}
		
	}
}
