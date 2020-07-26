package com.api.marvel.marvelapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
	
	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("thumbnail")
	private Thumbnail thumbnail;
	@JsonProperty("resourceURI")
	private String resourceURI;
	@JsonProperty("urls")
	private Urls[] urls;
	
	public Results() {
		
	}
	
	

	public Results(String id, String name, String description, Thumbnail thumbnail, String resourceURI, Urls[] marvelUrls) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.thumbnail = thumbnail;
		this.resourceURI = resourceURI;
		this.urls = marvelUrls;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public Thumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}



	public Urls[] getUrls() {
		return urls;
	}



	public void setUrls(Urls[] marvelUrls) {
		this.urls = marvelUrls;
	}
	
	

}
