package inheritance.session4;

public class Office_Address extends Address{
	long P_No;
	String incharge;
	String deliveryBlock;
	public Office_Address() {
		
	}
	public Office_Address(String doorno, String building, String city,long p_No, String incharge, String deliveryBlock) {
		super(doorno,building,city);
		this.P_No = p_No;
		this.incharge = incharge;
		this.deliveryBlock = deliveryBlock;
	}
	public long getP_No() {
		return P_No;
	}
	public void setP_No(long p_No) {
		this.P_No = p_No;
	}
	public String getIncharge() {
		return incharge;
	}
	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}
	public String getDeliveryBlock() {
		return deliveryBlock;
	}
	public void setDeliveryBlock(String deliveryBlock) {
		this.deliveryBlock = deliveryBlock;
	}
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", building=" + building + ", city=" + city + "],Office_Address [P_No=" + P_No + ", incharge=" + incharge + ", deliveryBlock=" + deliveryBlock + "]";
	}
	
	
	

}
