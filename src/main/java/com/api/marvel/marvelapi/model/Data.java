package com.api.marvel.marvelapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	
	@JsonProperty("results")
	private Results[] results;

	public Data() {
		
	}
	public Data(Results[] results) {
		super();
		this.results = results;
	}
	public Results[] getResults() {
		return results;
	}
	public void setResults(Results[] results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "Data [results=" + results + "]";
	}
	
	

}
