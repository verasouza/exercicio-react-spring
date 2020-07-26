package com.api.marvel.marvelapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Thumbnail {
	
	@JsonProperty("path")
	private String path;

	public Thumbnail() {
	}
	

	public Thumbnail(String path) {
		super();
		this.path = path;
	}


	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	
}