package ie.bitterCoffee.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student
{
	// create fields for Student Class
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	private String favouriteLanguage;
	private String[] operatingSystems;
	
	public Student()
	{
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR","Brazil");
		countryOptions.put("IE","Ireland");
		countryOptions.put("UK","United Kingdom");
		countryOptions.put("USA","USA");
	}
	
	//Create getters and setters
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

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions()
	{
		return countryOptions;
	}

	public String getFavouriteLanguage()
	{
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage)
	{
		this.favouriteLanguage = favouriteLanguage;
	}

	public String[] getOperatingSystems()
	{
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems)
	{
		this.operatingSystems = operatingSystems;
	}
		
}
