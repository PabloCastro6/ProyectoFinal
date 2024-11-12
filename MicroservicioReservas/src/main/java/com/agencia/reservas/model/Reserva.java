  package com.agencia.reservas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Entidad que representa una reserva en el sistema.
 */
@Entity
@Table(name = "reservas")
public class Reserva {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReserva;
	private String nombreCliente;
	private String dni; 
	private Integer idHotel;
	private Integer idVuelo;
	
	
	  /**
     * Constructor vacío.
     */
	public Reserva() {
		super();
	}

	/**
     * Constructor con parámetros.
     *
     * @param idReserva      ID de la reserva.
     * @param nombreCliente  Nombre del cliente.
     * @param dni            DNI del cliente.
     * @param idHotel        ID del hotel asociado a la reserva.
     * @param idVuelo        ID del vuelo asociado a la reserva.
     */
	public Reserva(Integer idReserva, String nombreCliente, String dni, Integer idHotel, Integer idVuelo) {
		super();
		this.idReserva = idReserva;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
	}

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Integer idHotel) {
		this.idHotel = idHotel;
	}

	public Integer getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Integer idVuelo) {
		this.idVuelo = idVuelo;
	}
	
	
	

}
