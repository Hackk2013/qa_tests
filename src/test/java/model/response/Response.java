package model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("data")
	private Data data;

	public Data getData(){
		return data;
	}
}