package com.curso.service;

import java.util.List;

import com.curso.model.Pokemon;

public interface PokemonsService {
	List<Pokemon> pokemons();
	List<Pokemon> pokemonsTipo(String tipo);
	Pokemon buscarPokemon(int idPokemon);
	void altaPokemon(Pokemon pokemon);
	void actualizarPokemon(Pokemon pokemon);
	List<Pokemon> eliminarPokemon(int idPokemon);
}
