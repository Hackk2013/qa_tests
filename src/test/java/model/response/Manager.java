package model.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Manager{

	@JsonProperty("urgent_contacts")
	private Object urgentContacts;

	@JsonProperty("nickname")
	private String nickname;

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("intercom_user_id")
	private String intercomUserId;

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("email")
	private String email;

	@JsonProperty("contacts")
	private List<ContactsItem> contacts;

	public Object getUrgentContacts(){
		return urgentContacts;
	}

	public String getNickname(){
		return nickname;
	}

	public String getLastName(){
		return lastName;
	}

	public String getIntercomUserId(){
		return intercomUserId;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getEmail(){
		return email;
	}

	public List<ContactsItem> getContacts(){
		return contacts;
	}
}