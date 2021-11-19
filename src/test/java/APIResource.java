
public enum APIResource {

	ADDPLACEAPI("/maps/api/place/add/json");
	
	private String resource;
	
	APIResource(String resource){
		this.resource=resource;
	}
	
	public String getResource() {
		return resource;
	}
}
