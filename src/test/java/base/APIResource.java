package base;

public enum APIResource {

	ADDPLACEAPI("/maps/api/place/add/json"),
	DELETEPLACEAPI("/maps/api/place/delete/json");
	
	private String resource;
	APIResource(String resource){
		this.resource=resource;
	}
	
	public String getResource() {
		return resource;
	}
}
