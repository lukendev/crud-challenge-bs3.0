package com.crudchallenge.crudchallenge.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudchallenge.crudchallenge.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Marcelo Vieira", "11122233345", 3200.0, Instant.now(), 5));
		list.add(new Client(2L, "Morgana Moreira", "99988877765", 6700.0, Instant.now(), 0));
		
		return ResponseEntity.ok().body(list);		
	}

}
