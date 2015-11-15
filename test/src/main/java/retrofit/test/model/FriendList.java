package retrofit.test.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({"stat", "count", "friendList"})
public class FriendList {

	@JsonProperty("stat")
	@JsonInclude(Include.NON_NULL)
	private String stat;
	
	@JsonProperty("count")
	@JsonInclude(Include.ALWAYS)
	private int count;
	
	@JsonProperty("friendList")
	@JsonInclude(Include.ALWAYS)
	private List<User> friendList;

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public List<User> getFriendList() {
		return friendList;
	}

	public void setFriendList(List<User> friendList) {
		this.friendList = friendList;
	}
	
	
}
