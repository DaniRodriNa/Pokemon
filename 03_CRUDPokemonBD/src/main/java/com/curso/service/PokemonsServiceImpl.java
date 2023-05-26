package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.PokemonDao;
import com.curso.model.Pokemon;

@Service
public class PokemonsServiceImpl implements PokemonsService {
	@Autowired
	PokemonDao dao;
	@Override
	public List<Pokemon> pokemons() {
		return dao.findAll();
	}

	@Override
	public List<Pokemon> pokemonsTipo(String tipo) {
		return dao.buscarPokemonPorTipo(tipo);
	}

	@Override
	public Pokemon buscarPokemon(int idPokemon) {
		return dao.findById(idPokemon).orElse(null);
	}

	@Override
	public void actualizarPokemon(Pokemon pokemon) {
		dao.save(pokemon);
	}

	@Override
	public List<Pokemon> eliminarPokemon(int idPokemon) {
		dao.deleteById(idPokemon);
		return dao.findAll();
	}

	@Override
	public void altaPokemon(Pokemon pokemon) {
		dao.save(pokemon);
	}

}
