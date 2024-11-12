package com.agencia.hoteles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencia.hoteles.model.Hotel;
import com.agencia.hoteles.repository.HotelRepository;

/**
 * Implementación del servicio de hoteles.
 * Realiza operaciones de obtención de hoteles disponibles y búsqueda de hoteles por nombre.
 */
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    /**
     * Obtiene la lista de hoteles disponibles.
     *
     * @return Lista de hoteles disponibles.
     */
    @Override
    public List<Hotel> obtenerHotelesDisponibles() {
        return hotelRepository.findByDisponibleTrue();
    }

    
    /**
     * Obtiene un hotel por su nombre.
     *
     * @param nombre Nombre del hotel a buscar.
     * @return Hotel que coincide con el nombre dado.
     */
    @Override
    public Hotel obtenerHotelPorNombre(String nombre) {
        return hotelRepository.findByNombre(nombre);
    }
}
