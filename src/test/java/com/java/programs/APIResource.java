package com.java.programs;

public enum APIResource {

	ADDPLACEAPI("/maps/api/place/add/json");
	
	private String resource;
	
	APIResource(String resource){
		this.resource=resource;
	}
	
	public String getResource() {
		return resource;
	}
	
	public void sunny()
	{
		System.out.println("Hello sunny");
	}
	
	public void sunny4()
	{
		System.out.println("Hello sunny4");
	}
	
	public void sunny3()
	{
		System.out.println("Hello sunny3");
	}

}
