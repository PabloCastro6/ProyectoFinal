package com.agencia.vuelos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Entidad que representa un vuelo en la base de datos.
 */
@Entity
@Table(name = "vuelos")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vuelo") 
    private Integer idVuelo;

    @Column(name = "compania")
    private String compañia;

    @Column(name = "fecha_vuelo")
    private String fechaVuelo;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "plazas_disponibles")
    private Integer plazasDisponibles;
    
    
	public Vuelo() {
		super();
	}


	public Vuelo(Integer idVuelo, String compañia, String fechaVuelo, Double precio, Integer plazasDisponibles) {
		super();
		this.idVuelo = idVuelo;
		this.compañia = compañia;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazasDisponibles = plazasDisponibles;
	}


	public Integer getIdVuelo() {
		return idVuelo;
	}


	public void setIdVuelo(Integer idVuelo) {
		this.idVuelo = idVuelo;
	}


	public String getCompañia() {
		return compañia;
	}


	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}


	public String getFechaVuelo() {
		return fechaVuelo;
	}


	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Integer getPlazasDisponibles() {
		return plazasDisponibles;
	}


	public void setPlazasDisponibles(Integer plazasDisponibles) {
		this.plazasDisponibles = plazasDisponibles;
	}
    
    
    
    
}
