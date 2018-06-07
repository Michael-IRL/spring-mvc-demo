package ie.bitterCoffee.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//Identify controller map to /student
@Controller
@RequestMapping("/student")
public class StudentController
{
	//Map to /student/showForm
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		//create a new student object
		Student theStudent = new Student();
		
		//add student object to model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	//Map to /showForm/processForm
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		//log the input data
		System.out.println("The Student : "+theStudent.getFirstName()+" "+theStudent.getLastName()+" "+theStudent.getCountry()+" "+theStudent.getFavouriteLanguage()+" "+theStudent.getOperatingSystems());
		return "student-confirmation";
	}
}