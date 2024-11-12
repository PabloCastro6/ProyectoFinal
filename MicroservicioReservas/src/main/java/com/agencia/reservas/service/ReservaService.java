package com.agencia.reservas.service;

import java.util.List;

import com.agencia.reservas.model.Reserva;

/**
 * Interfaz para el servicio de gestión de reservas.
 */
public interface ReservaService {

	/**
	 * Registra una nueva reserva en el sistema.
	 *
	 * @param reserva       Objeto de tipo Reserva con los datos de la reserva.
	 * @param totalPersonas Número total de personas en la reserva.
	 * @return La reserva registrada.
	 */
	Reserva registrarReserva(Reserva reserva, int totalPersonas);

	/**
	 * Obtiene las reservas asociadas a un hotel específico por su nombre.
	 *
	 * @param nombreHotel Nombre del hotel para el cual se buscan reservas.
	 * @return Lista de reservas asociadas al hotel.
	 */
	List<Reserva> obtenerReservasPorHotel(String nombreHotel);

}
