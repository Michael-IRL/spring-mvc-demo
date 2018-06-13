package ie.bitterCoffee.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//define the Controller and map to /customer
@Controller
@RequestMapping("/customer")
public class CustomerController
{
	
	//InitBinder is set up to Pre-process every web request coming in 
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		//String trimmer editor - used to remove leading a trailing white spaces 
		//StringTrimmerEditor is set to true so the trimmer is able to trim the String to null
		StringTrimmerEditor stringTimmerEditor = new StringTrimmerEditor(true);
		
		//Register the stringTimmerEditor as a custom editor to dataBinder(Request coming in)
		//Set the dataBinder so it applies the stringTimmerEditor to every String class
		dataBinder.registerCustomEditor(String.class, stringTimmerEditor);
	}
	
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
		//System out logging for testing 
		System.out.println("Last name :|"+theCustomer.getLastName()+"|");
		System.out.println("Free Passes :|"+theCustomer.getFreePasses()+"|");
		System.out.println("Post Code :|"+theCustomer.getPostalCode()+"|");
				
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
