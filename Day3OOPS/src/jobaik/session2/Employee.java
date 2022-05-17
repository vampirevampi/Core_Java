package jobaik.session2;

import java.time.LocalDateTime;

public class Employee {
	private int empId;
	private String fullName;
	private LocalDateTime date;
	private Address residence;
	private Address office;
	private Address Communication;
	static int managerID;
	public Employee(int empId, String fullName, LocalDateTime date, Address residence, Address office,Address Communication,int managerID) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.date = date;
		this.residence = residence;
		this.office = office;
		this.Communication=Communication;
		Employee.managerID=managerID;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Address getResidence() {
		return residence;
	}
	public void setResidence(Address residence) {
		this.residence = residence;
	}
	public Address getOffice() {
		return office;
	}
	public void setOffice(Address office) {
		this.office = office;
	}
	public Address getCommunication() {
		return Communication;
	}
	public void setCommunication(Address Communication) {
		this.Communication = Communication;
	}
	
	
	public static int getManagerID() {
		return managerID;
	}
	public static void setManagerID(int managerID) {
		Employee.managerID = managerID;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", date=" + date + ", residence=" + residence
				+ ", office=" + office + ", Communication=" + Communication + "]";
	}
	
	

}
