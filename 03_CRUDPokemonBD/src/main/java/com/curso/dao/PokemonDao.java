package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Pokemon;

public interface PokemonDao extends JpaRepository<Pokemon, Integer> {
	@Query(value="select * from pokedex.pokemons  where tipo =? ",nativeQuery = true)
	public List<Pokemon> buscarPokemonPorTipo(String tipo);
}
