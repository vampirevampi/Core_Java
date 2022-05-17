package inheritance.session4;

public class Residence_Address extends Address{
	String houseName;
	String LandMark;
	String time;
	public Residence_Address() {
		
	}
	public Residence_Address(String houseName, String landMark, String time,String doorno, String building, String city) {
		super(doorno,building,city);
		this.houseName = houseName;
		LandMark = landMark;
		this.time = time;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getLandMark() {
		return LandMark;
	}
	public void setLandMark(String landMark) {
		LandMark = landMark;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", building=" + building + ", city=" + city + "],Residence_Address [houseName=" + houseName + ", LandMark=" + LandMark + ", time=" + time + "]";
	}
	
	

}
