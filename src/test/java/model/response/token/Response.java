package model.response.token;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("data")
	private Data data;

	public Data getData(){
		return data;
	}
}