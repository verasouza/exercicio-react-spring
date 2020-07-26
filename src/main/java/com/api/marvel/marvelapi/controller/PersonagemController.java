package com.api.marvel.marvelapi.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api.marvel.marvelapi.model.Personagem;
import com.api.marvel.marvelapi.services.PersonagemService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
@RequestMapping(value="api/characters")
@CrossOrigin(origins="http://localhost:3000/", allowedHeaders = "*")
public class PersonagemController {
	
	LocalDate localtime = LocalDate.now();
	DateTimeFormatter dt = DateTimeFormatter.ofPattern("ddMMyyyy");
	String ts = localtime.format(dt);

	@Autowired
	private RestTemplate template = new RestTemplate();
	@Autowired
	private PersonagemService service;
	
	@Value("${apikey}")
	private String apikey;

	@Value("${apiurl}")
	private String apiurl;

	@Value("${pkey}")
	private String pkey;
	
	@GetMapping
	public ResponseEntity<Personagem> getCharacterInfo(@RequestParam("name") String name) {

		String url = service.urlMarvel(ts, pkey, apikey, name);

		String dados = template.getForObject(url, String.class);

		Gson gson = new GsonBuilder().create();
		Personagem personagem = gson.fromJson(dados, Personagem.class);

		return ResponseEntity.ok().body(personagem);

	}

}
