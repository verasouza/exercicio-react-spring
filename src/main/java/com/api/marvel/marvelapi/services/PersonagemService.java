package com.api.marvel.marvelapi.services;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService {
	
	@Value("${apiurl}")
	private String apiurl;
	
	public String getHash(String value) {

		String md5 = null;

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			//md.update(value.getBytes());			

			md5 = new BigInteger(1, md.digest(value.getBytes())).toString(16);
		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}
		return String.format("%32s", md5).replace(' ', '0');
	}
	
	public String textodohash(String ts, String pkey, String apikey) {
		StringBuilder texto = new StringBuilder("");
		texto.append(ts);
		texto.append(pkey);
		texto.append(apikey);
		
		return texto.toString();
	}
	
	public String urlMarvel(String ts, String pkey, String apikey, String name) {
		String textodohash = textodohash(ts, pkey, apikey);
		String md5 = getHash(textodohash);
		StringBuilder url = new StringBuilder("");
		
		//https://gateway.marvel.com/v1/public/characters?ts={{ts}}&apikey={{apikey}}&hash={{hash}}&name=spider-man
		url.append("https://gateway.marvel.com/v1/public/characters").append("?ts=").append(ts);
		url.append("&apikey=").append(apikey);
		url.append("&hash=").append(md5);
		url.append("&name=").append(name);
		
		return url.toString();
	}
	

}
