package ie.bitterCoffee.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer
{
	private String firstName;	
	
	//Add Validation rules to have not null
	// with a min size of 1 and custom message is required
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	//Validation rule for number to be >= 0 and <=10 with a custom message for each rule 
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10")
	private int freePasses;	
	
	//Validation rule for post code. Using Regular expression. 
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message="only 5char/digits")
	private String postalCode;	
	 
	public String getPostalCode()
	{
		return postalCode;
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
	
	public int getFreePasses()
	{
		return freePasses;
	}
	public void setFreePasses(int freePasses)
	{
		this.freePasses = freePasses;
	}
}
