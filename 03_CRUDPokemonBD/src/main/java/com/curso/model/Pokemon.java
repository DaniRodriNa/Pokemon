package com.curso.model;
/**
 * @author Daniel Rodriguez
 * @version 1.0.0 26-05-2023
 */
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
	/**
	 * Constructor Pokemon
	 * @param idPokemon	Parametro del identificador del pokemon
	 * @param nombre	Parametro del nombre del pokemon
	 * @param tipo	Parametro del tipo de pokemon,fuego,tierra,agua,planta,etc.
	 * @param nivel	Parametro del nivel del pokemon
	 */
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
