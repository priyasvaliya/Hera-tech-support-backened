package backend.hera.controller.response;

public class LoginResponse {
	private int identity;
	private String userName;
	private String password;
	
	protected LoginResponse() {
		
	}
	
	public LoginResponse(Integer identity, String userName, String password) {
		this.identity = identity;
		this.userName = userName;
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
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
