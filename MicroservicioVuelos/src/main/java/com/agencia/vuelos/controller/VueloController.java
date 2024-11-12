package com.agencia.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.vuelos.model.Vuelo;
import com.agencia.vuelos.service.VueloService;

/**
 * Controlador REST para gestionar los vuelos disponibles en la agencia de viajes.
 */
@RestController
@RequestMapping("/vuelos")
public class VueloController {

	@Autowired
	private VueloService vueloService;

	/**
     * Endpoint para obtener la lista de vuelos con plazas disponibles mayores o iguales al número solicitado.
     *
     * @param plazas Número de plazas requeridas.
     * @return Lista de vuelos que cumplen con el criterio de disponibilidad.
     */
	@GetMapping
	public List<Vuelo> obtenerVuelosDisponibles(@RequestParam Integer plazas) {
		return vueloService.obtenerVuelosDisponibles(plazas);
	}

	   /**
     * Endpoint para actualizar las plazas disponibles en un vuelo específico.
     *
     * @param idVuelo         ID del vuelo a actualizar.
     * @param plazasReservadas Número de plazas que se desean reservar.
     * @return Respuesta HTTP 200 si la actualización fue exitosa.
     */
	@PostMapping("/{idVuelo}/plazas")
	public ResponseEntity<Void> actualizarPlazasVuelo(@PathVariable Integer idVuelo,
			@RequestParam Integer plazasReservadas) {
		vueloService.actualizarPlazasVuelo(idVuelo, plazasReservadas);
		return ResponseEntity.ok().build();

	}
}