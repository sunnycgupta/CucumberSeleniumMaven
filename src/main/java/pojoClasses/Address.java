package pojoClasses;

import java.util.List;

public class Address {

	private Location location;
	private int accuracy;
	private String name;
	private String phone_number;
	private String address;
	private List<String> types;
	private String website;
	private String language;
	
	public Address(Location location,int accuracy,String name,String phone_number,String address,List<String> types,String website,String language)
	{
		this.location=location;
		this.accuracy=accuracy;
		this.name=name;
		this.phone_number=phone_number;
		this.address=address;
		this.types=types;
		this.website=website;
		this.language=language;
	}
	
	public Location getlocation() {
		return location;
	}
	
	public int getAccuracy() {
		return accuracy;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phone_number;
	}
	
	public String getAddress() {
		return address;
	}
	
	public List<String> getTypes(){
		return types;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public String getLanguage() {
		return language;
	}
}
