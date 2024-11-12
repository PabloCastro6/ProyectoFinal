package com.agencia.hoteles.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Entidad que representa un hotel en la base de datos.
 */

@Entity
@Table(name = "hoteles") // Especifica el nombre de la tabla en la base de datos
public class Hotel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHotel") // Especifica el nombre exacto de la columna en la tabla
    private Integer idHotel;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "disponible")
    private Boolean disponible;

    
    /**
     * Constructor vacío necesario para JPA.
     */
    
	public Hotel() {
		super();
	}
	
	  /**
     * Constructor con parámetros para inicializar un hotel.
     *
     * @param idHotel ID del hotel.
     * @param nombre Nombre del hotel.
     * @param categoria Categoría del hotel.
     * @param precio Precio del hotel.
     * @param disponible Disponibilidad del hotel.
     */
	public Hotel(Integer idHotel, String nombre, String categoria, Double precio, Boolean disponible) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}
	public Integer getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Integer idHotel) {
		this.idHotel = idHotel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
    
    
    
}
