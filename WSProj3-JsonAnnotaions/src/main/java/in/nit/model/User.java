package in.nit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	@JsonProperty("user-id")
	private Integer uID;
	@JsonProperty("user-name")
	private String uName;
	@JsonIgnore
	private String uPassword;
	@JsonProperty("User-Author")
	private String uAuthor;

	public User() {
		System.out.println("User.0-param constructor");
	}

	public Integer getuID() {
		return uID;
	}

	public void setuID(Integer uID) {
		this.uID = uID;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuAuthor() {
		return uAuthor;
	}

	public void setuAuthor(String uAuthor) {
		this.uAuthor = uAuthor;
	}

	@Override
	public String toString() {
		return "User [uID=" + uID + ", uName=" + uName + ", uPassword=" + uPassword + ", uAuthor=" + uAuthor + "]";
	}

}
