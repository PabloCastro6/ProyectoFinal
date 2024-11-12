package com.agencia.hoteles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.hoteles.model.Hotel;
import com.agencia.hoteles.service.HotelService;


/**
 * Controlador REST para gestionar las operaciones relacionadas con los hoteles.
 */ 
@RestController
@RequestMapping("/hoteles")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    /**
     * Endpoint para obtener la lista de hoteles disponibles.
     *
     * @return una lista de hoteles disponibles.
     */
    
    @GetMapping("/disponibles")
    public List<Hotel> obtenerHotelesDisponibles() {
        return hotelService.obtenerHotelesDisponibles();
    }

    /**
     * Endpoint para obtener un hotel a partir de su nombre.
     *
     * @param nombre Nombre del hotel a buscar.
     * @return el hotel que coincide con el nombre proporcionado.
     */
    @GetMapping("/{nombre}")
    public Hotel obtenerHotelPorNombre(@PathVariable String nombre) {
        return hotelService.obtenerHotelPorNombre(nombre);
    }
}
