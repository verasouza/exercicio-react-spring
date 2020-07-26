package com.api.marvel.marvelapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Urls {
	
	@JsonProperty("type")
	private String type;
	@JsonProperty("url")
	private String url;
	
	public Urls() {
		
	}
	
	public Urls(String type, String url) {
		super();
		this.type = type;
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
