package jobaik.session2;

public class Address {
	private String doorno;
	private String building;
	private String city;
	public Address( String doorno, String building, String city) {
		super();
		this.doorno = doorno;
		this.building = building;
		this.city = city;
	}

	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", building=" + building + ", city=" + city + "]";
	}
    

}
