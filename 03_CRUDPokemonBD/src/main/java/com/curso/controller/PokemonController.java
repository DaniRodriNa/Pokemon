package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pokemon;
import com.curso.service.PokemonsService;
/**
 * @author Daniel Rodriguez
 * @version 1.0.0 26-05-2023
 * Clase PokemonController que se encargara de intercambiar información 
 */
@RestController
public class PokemonController {
	@Autowired
	PokemonsService service;
	
	@GetMapping(value="pokemon/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Pokemon buscarPokemon(@PathVariable("id") int id) {
		return service.buscarPokemon(id);
	}
	@GetMapping(value="pokemons/{tipo}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Pokemon> buscarPokemonTipo(@PathVariable("tipo") String tipo) {
		return service.pokemonsTipo(tipo);
	}
	
	//http://localhost:8080/pokemons
	@GetMapping(value="pokemons")
	public List<Pokemon> pokemons(){
		return service.pokemons();
	}
	//http://localhost:8080/pokemon
	@PostMapping(value="pokemon",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void altaPokemon(@RequestBody Pokemon pokemon) {
		service.altaPokemon(pokemon);
	}
	@PutMapping(value="pokemon",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarPokemon(@RequestBody Pokemon pokemon) {
		service.actualizarPokemon(pokemon);
	}
	@DeleteMapping(value="pokemon/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Pokemon> eliminarLibro(@PathVariable("id") int id){
		return service.eliminarPokemon(id);
	}
}
