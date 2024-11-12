package com.agencia.reservas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.agencia.reservas.model.Reserva;
import com.agencia.reservas.repository.ReservaRepository;

/**
 * Implementación del servicio de gestión de reservas.
 */
@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepository reservaRepository;

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Registra una nueva reserva en el sistema y actualiza las plazas disponibles
	 * en el microservicio de vuelos.
	 *
	 * @param reserva       Objeto de tipo Reserva con los datos de la reserva.
	 * @param totalPersonas Número total de personas en la reserva.
	 * @return La reserva registrada en la base de datos.
	 */
	@Override
	public Reserva registrarReserva(Reserva reserva, int totalPersonas) {
		// URL del microservicio de vuelos para actualizar las plazas
		String urlVuelos = "http://localhost:8081/vuelos/" + reserva.getIdVuelo() + "/plazas?plazasReservadas=" + totalPersonas;
		restTemplate.postForObject(urlVuelos, null, Void.class);

		// Guarda la reserva en la base de datos y la retorna
		return reservaRepository.save(reserva);
	}

	/**
	 * Obtiene la lista de reservas asociadas a un hotel específico utilizando su
	 * nombre. Realiza una solicitud al microservicio de hoteles para obtener el
	 * idHotel a partir del nombre.
	 *
	 * @param nombreHotel Nombre del hotel para el cual se buscan reservas.
	 * @return Lista de reservas asociadas al idHotel obtenido.
	 */
	@Override
	public List<Reserva> obtenerReservasPorHotel(String nombreHotel) {
		// URL del microservicio de hoteles para obtener el id del hotel
		String urlHoteles = "http://localhost:8082/hoteles/" + nombreHotel;
		// Realiza una solicitud GET para obtener el idHotel desde el microservicio de
		// hoteles
		Integer idHotel = restTemplate.getForObject(urlHoteles, Integer.class);

		// Retorna la lista de reservas filtradas por el idHotel
		return reservaRepository.findByIdHotel(idHotel);
	}
}
