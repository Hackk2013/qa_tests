package model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactsItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("value")
	private String value;

	public String getName(){
		return name;
	}

	public String getValue(){
		return value;
	}
}