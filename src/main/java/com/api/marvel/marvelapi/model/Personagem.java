package com.api.marvel.marvelapi.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Personagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("data")
	private Data data;
	@JsonProperty("etag")
	private String etag;

	public Personagem() {

	}

	public Personagem(String etag, Data data) {
		super();
		this.etag = etag;
		this.data = data;
	}

	
	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	/*
	 * public void unpackedNested(Map<String, Object> data) { //this.results =
	 * (String)data.get("results"); Map<String, String> results = (Map<String,
	 * String>)data.get("results"); this.name = results.get("name");
	 * this.description = results.get("description"); this.resourceURI =
	 * results.get("resourceURI");
	 * 
	 * }
	 */

}
