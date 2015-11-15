package retrofit.test.model;


//@JsonPropertyOrder({"id", "password", "session_state"})
public class UserAuth {

	private String id;
	private String password;
	//private String session_state;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*
	public String getSession_state() {
		return session_state;
	}
	public void setSession_state(String session_state) {
		this.session_state = session_state;
	}
	
	*/

}
