package ie.bitterCoffee.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer
{
	private String firstName;
	
	//Add Validation rules to have not null
	// with a min size of 1 and custom message is required
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
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
	
	
}
