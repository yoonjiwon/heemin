package retrofit.test.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class STAT {
	
	@JsonProperty("stat")
	@JsonInclude(Include.NON_NULL)
	private String stat;
	
	@JsonProperty("cause")
	@JsonInclude(Include.NON_NULL)
	private String cause;

	@JsonInclude(Include.NON_NULL)
	private Object rsp;
	
	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}
	
	public Object getRsp() {
		return rsp;
	}

	public void setRsp(Object rsp) {
		this.rsp = rsp;
	}

	

}
