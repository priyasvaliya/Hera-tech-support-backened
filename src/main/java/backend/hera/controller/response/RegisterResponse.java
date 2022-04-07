package backend.hera.controller.response;

public class RegisterResponse {
	private int identity;
	private String userName;
	private String firstName;
	private String lastName;
	private String payment;
	private String address;
	private String password;
	
	protected RegisterResponse() {
		
	}
	
	public RegisterResponse(Integer identity, String userName, String firstName, String lastName, String payment, String address, String password) {
		this.identity = identity;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.payment = payment;
		this.address = address;
		this.password = password;
	}
	
	public Integer getIdentity() {
		return identity;
	}
	
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPayment() {
		return payment;
	}
	
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
