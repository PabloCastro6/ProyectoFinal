package com.agencia.reservas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agencia.reservas.model.Reserva;

/**
 * Repositorio de acceso a datos para la entidad Reserva.
 */
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
	 /**
     * Busca reservas por el ID del hotel.
     *
     * @param idHotel ID del hotel asociado a las reservas.
     * @return Lista de reservas asociadas al hotel.
     */
    List<Reserva> findByIdHotel(Integer idHotel);
}
