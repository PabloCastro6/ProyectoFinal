package com.agencia.vuelos.service;

import java.util.List;

import com.agencia.vuelos.model.Vuelo;

/**
 * Servicio que define las operaciones de gestión de vuelos.
 */
public interface VueloService {
	/**
     * Obtiene una lista de vuelos que tienen al menos el número de plazas requeridas.
     *
     * @param plazasRequeridas Número mínimo de plazas necesarias.
     * @return Lista de vuelos disponibles.
     */
    List<Vuelo> obtenerVuelosDisponibles(Integer plazasRequeridas);
    
    /**
     * Actualiza las plazas disponibles de un vuelo específico, restando las plazas reservadas.
     *
     * @param idVuelo         ID del vuelo a actualizar.
     * @param plazasReservadas Número de plazas a reservar.
     */
    void actualizarPlazasVuelo(Integer idVuelo, Integer plazasReservadas);
}

