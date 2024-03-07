package customerApp.Model;

public class Customer {
	private int cusId;
	private String cusName;
	private String cusPassword;
	private String cusAddress;
	
	// getters &setters
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusPassword() {
		return cusPassword;
	}
	public void setCusPassword(String cusPassword) {
		this.cusPassword = cusPassword;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	// no argument constructor
	public Customer()
	{
		super();
	}
	// parameterized constructor
	
	public Customer(int cusId, String cusName, String cusPassword, String cusAddress) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusPassword = cusPassword;
		this.cusAddress = cusAddress;
	}
	
	//to String
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusPassword=" + cusPassword + ", cusAddress="
				+ cusAddress + "]";
	}
}
