package com.agencia.hoteles.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agencia.hoteles.model.Hotel;

/**
 * Repositorio JPA para acceder a la base de datos de hoteles.
 */
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	/**
     * Encuentra todos los hoteles que están disponibles.
     *
     * @return lista de hoteles disponibles.
     */
	List<Hotel> findByDisponibleTrue();
	
	
	/**
     * Encuentra un hotel por su nombre.
     *
     * @param nombre Nombre del hotel.
     * @return el hotel que coincide con el nombre.
     */
    Hotel findByNombre(String nombre);
}
