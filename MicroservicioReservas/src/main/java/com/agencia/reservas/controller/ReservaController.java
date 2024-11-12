package com.agencia.reservas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.agencia.reservas.model.Reserva;
import com.agencia.reservas.service.ReservaService;


/**
 * Controlador REST para gestionar reservas en el sistema.
 * Proporciona endpoints para registrar y consultar reservas.
 */
@RestController
@RequestMapping("/reservas")
public class ReservaController {

	 @Autowired
	    private ReservaService reservaService;
	 
	 //PRUEBA
	 @Autowired
	 private RestTemplate restTemplate;
	 
	 /**
	     * Registra una nueva reserva en el sistema.
	     *
	     * @param reserva       Objeto de tipo Reserva con los datos de la reserva.
	     * @param totalPersonas Número total de personas en la reserva.
	     * @return La reserva registrada.
	     */


	    @PostMapping
	    public Reserva registrarReserva(@RequestBody Reserva reserva, @RequestParam int totalPersonas) {
	        return reservaService.registrarReserva(reserva, totalPersonas);
	    }

	    /**
	     * Obtiene las reservas asociadas a un hotel específico por su nombre.
	     *
	     * @param nombreHotel Nombre del hotel para el cual se buscan reservas.
	     * @return Lista de reservas asociadas al hotel.
	     */
	    @GetMapping("/hotel/{nombreHotel}")
	    public List<Reserva> obtenerReservasPorHotel(@PathVariable String nombreHotel) {
	        return reservaService.obtenerReservasPorHotel(nombreHotel);
	    }
	    
	    
	    /**
	     * Prueba de conexión con el servicio de vuelos.
	     * Realiza una petición GET al servicio de vuelos para un vuelo específico.
	     *
	     * @param idVuelo ID del vuelo a consultar.
	     * @return Mensaje de éxito si la conexión es exitosa.
	     */
	    @GetMapping("/test-conexion-vuelos/{idVuelo}")
	    public ResponseEntity<String> testConexionVuelos(@PathVariable Integer idVuelo) {
	        String url = "http://localhost:8081/vuelos/" + idVuelo;
	        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
	        return new ResponseEntity<>("Conexión exitosa con Vuelos: " + response.getBody(), HttpStatus.OK);
	    }
	}