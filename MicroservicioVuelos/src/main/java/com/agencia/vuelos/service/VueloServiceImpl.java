package com.agencia.vuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencia.vuelos.model.Vuelo;
import com.agencia.vuelos.repository.VueloRepository;


/**
 * Implementación de VueloService para gestionar vuelos.
 */
@Service
public class VueloServiceImpl implements VueloService {

	@Autowired
    private VueloRepository vueloRepository;

	 /**
     * Obtiene una lista de vuelos disponibles con un número de plazas disponibles
     * igual o mayor al número de plazas requeridas.
     * 
     * @param plazasRequeridas Número mínimo de plazas disponibles que se requieren.
     * @return Una lista de {@link Vuelo} que cumplen con la disponibilidad de plazas.
     */
    @Override
    public List<Vuelo> obtenerVuelosDisponibles(Integer plazasRequeridas) {
        return vueloRepository.findByPlazasDisponiblesGreaterThanEqual(plazasRequeridas);
    }

    
    /**
     * Actualiza el número de plazas disponibles de un vuelo específico, restando las
     * plazas reservadas a las plazas actuales.
     * 
     * <p>Si el vuelo no existe, se lanza una excepción indicando que no fue encontrado.</p>
     *
     * @param idVuelo         El ID del vuelo que se desea actualizar.
     * @param plazasReservadas Número de plazas que se han reservado para el vuelo.
     * @throws RuntimeException si el vuelo no es encontrado en la base de datos.
     */
    @Override
    public void actualizarPlazasVuelo(Integer idVuelo, Integer plazasReservadas) {
    	 // Busca el vuelo por ID; lanza una excepción si no se encuentra
        Vuelo vuelo = vueloRepository.findById(idVuelo)
                .orElseThrow(() -> new RuntimeException("Vuelo no encontrado"));
        
     // Calcula y actualiza el nuevo número de plazas disponibles
        int nuevasPlazas = vuelo.getPlazasDisponibles() - plazasReservadas;
        vuelo.setPlazasDisponibles(nuevasPlazas);

        // Guarda el vuelo actualizado en la base de datos
        vueloRepository.save(vuelo);

	}

}
