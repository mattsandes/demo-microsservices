package com.example.demo.model;

import java.util.UUID;

public class Person {
	private UUID id;
	private String nome;
	
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Person(UUID id, String nome) {
		this.id = id;
		this.nome = nome;
	}
}
