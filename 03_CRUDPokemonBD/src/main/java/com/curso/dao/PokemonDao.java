package com.curso.dao;
/**
 * Clase PokemonDao que se encarga de las operaciones de persistencia contra la tabla pokemons de la base de datos
 * @author Daniel Rodriguez
 * @version 1.0.0 26-05-2023
 */
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Pokemon;

public interface PokemonDao extends JpaRepository<Pokemon, Integer> {
	/**
	 * Metodo para buscar una lista de pokemons de distintos tipos
	 * @param tipo Parametro que indica el tipo de pokemons que queremos buscar
	 * @return Devuelve una lista de los pokemons del tipo que hemos pasado por parametro
	 */
	@Query(value="select * from pokedex.pokemons  where tipo =? ",nativeQuery = true)
	public List<Pokemon> buscarPokemonPorTipo(String tipo);
}
