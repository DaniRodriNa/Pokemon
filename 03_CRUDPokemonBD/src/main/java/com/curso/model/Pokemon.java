package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pokemons")
public class Pokemon {
	@Id
	private int idPokemon;
	private String nombre;
	private int nivel;
	private String tipo;
	public Pokemon() {
	}
	public Pokemon(int idPokemon, String nombre,String tipo, int nivel) {
		super();
		this.idPokemon = idPokemon;
		this.nombre = nombre;
		this.tipo=tipo;
		this.nivel = nivel;
	}
	public int getIdPokemon() {
		return idPokemon;
	}
	public void setIdPokemon(int idPokemon) {
		this.idPokemon = idPokemon;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}
