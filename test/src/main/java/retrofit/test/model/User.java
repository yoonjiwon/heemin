package retrofit.test.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"userID", "userName", "userAge", "phone", "comment"})
public class User {
	
	@JsonProperty("userID")
	@JsonInclude(Include.NON_NULL)
	private String userID;
	
	@JsonProperty("userName")
	@JsonInclude(Include.NON_NULL)
	private String userName;
	
	@JsonProperty("userAge")
	@JsonInclude(Include.NON_NULL)
	private String userAge;
	
	@JsonProperty("phone")
	@JsonInclude(Include.NON_NULL)
	private String phone;
	
	@JsonProperty("comment")
	@JsonInclude(Include.NON_NULL)
	private String comment;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
}
