package inheritance.session4;

import java.time.LocalDateTime;

public class Employee {
	int empId;
	String fullName;
	LocalDateTime dateofjoining;
	Residence_Address res;
	Office_Address off;
	public Employee() {
		
	}
	public Employee(int empId, String fullName, LocalDateTime dateofjoining, Residence_Address res,
			Office_Address off) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.dateofjoining = dateofjoining;
		this.res = res;
		this.off = off;
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
	public LocalDateTime getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(LocalDateTime dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	public Residence_Address getRes() {
		return res;
	}
	public void setRes(Residence_Address res) {
		this.res = res;
	}
	public Office_Address getOff() {
		return off;
	}
	public void setOff(Office_Address off) {
		this.off = off;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", dateofjoining=" + dateofjoining + ", res="
				+ res + ", off=" + off + "]";
	}
	
	
	

}
