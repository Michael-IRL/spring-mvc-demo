package ie.bitterCoffee.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import ie.bitterCoffee.springdemo.mvc.validation.CourseCode;

public class Customer
{
	private String firstName;	
	
	//Add Validation rules to have not null
	// with a min size of 1 and custom message is required
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	//Validation rule for number to be >= 0 and <=10 with a custom message for each rule
	@NotNull(message="is required")
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10")
	private Integer freePasses;	
	
	//Validation rule for post code. Using Regular expression. 
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message="only 5char/digits")
	private String postalCode;
	
	@CourseCode(value="LUV", message="must start with LUV")
	//@CourseCode(value="TOPS", message="must start with TOPS")
	private String courseCode;
	 
	public String getPostalCode()
	{
		return postalCode;
	}
	public String getCourseCode()
	{
		return courseCode;
	}
	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}
	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public Integer getFreePasses()
	{
		return freePasses;
	}
	public void setFreePasses(Integer freePasses)
	{
		this.freePasses = freePasses;
	}
}
