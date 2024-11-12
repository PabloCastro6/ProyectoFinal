package com.example.demo;

import com.agencia.hoteles.model.Hotel;
import com.agencia.hoteles.repository.HotelRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class HotelRepositoryTest {

    @Autowired
    private HotelRepository hotelRepository;

    @Test
    public void testFindByDisponibleTrue() {
        List<Hotel> hotelesDisponibles = hotelRepository.findByDisponibleTrue();
        
        // Esto imprimirá los resultados en la consola para verificar
        System.out.println("Hoteles disponibles: " + hotelesDisponibles);
        
        // Verifica que la lista no esté vacía si tienes datos con `disponible = true`
        assertFalse(hotelesDisponibles.isEmpty(), "Debería haber hoteles disponibles en la base de datos");
    }
}
