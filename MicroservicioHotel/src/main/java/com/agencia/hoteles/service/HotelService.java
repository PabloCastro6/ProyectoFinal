package com.agencia.hoteles.service;

import java.util.List;

import com.agencia.hoteles.model.Hotel;

/**
 * Interfaz de servicio para gestionar operaciones relacionadas con hoteles.
 */
public interface HotelService {

	/**
     * Obtiene una lista de hoteles disponibles.
     *
     * @return Lista de hoteles disponibles.
     */
	List<Hotel> obtenerHotelesDisponibles();
	
	/**
     * Obtiene un hotel por su nombre.
     *
     * @param nombre Nombre del hotel a buscar.
     * @return Hotel que coincide con el nombre dado.
     */
    Hotel obtenerHotelPorNombre(String nombre);
}
