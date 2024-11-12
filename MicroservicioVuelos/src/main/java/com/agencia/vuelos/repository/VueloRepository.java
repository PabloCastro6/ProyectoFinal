package com.agencia.vuelos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.vuelos.model.Vuelo;

/**
 * Repositorio JPA para la entidad Vuelo, que permite realizar operaciones CRUD.
 */
@Repository 
public interface VueloRepository extends JpaRepository<Vuelo, Integer> {
	 /**
     * Encuentra todos los vuelos con un número de plazas disponibles mayor o igual al especificado.
     *
     * @param plazasRequeridas Número mínimo de plazas requeridas.
     * @return Lista de vuelos que cumplen con la disponibilidad.
     */
    List<Vuelo> findByPlazasDisponiblesGreaterThanEqual(Integer plazasRequeridas);
}

