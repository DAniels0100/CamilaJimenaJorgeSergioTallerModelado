package com.example.miprimeraplicacion;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDatosPropiedad {

    private Propiedad propiedad;

    @Before
    public void setUp() {
        propiedad = new Propiedad(
                "Casa de Playa",
                "1200",
                "Costa Rica",
                "Piscina, WiFi, Aire Acondicionado",
                6,
                3,
                "http://imagen.com/casa.jpg"
        );
    }

    @Test
    public void testSaveDataJSON() {
        // Ejecutar el método saveDataJSON()
        JSONObject jsonObject = propiedad.saveDataJSON();

        // Imprimir el JSON generado para verificar su contenido
        System.out.println("JSON generado: " + jsonObject.toString());

        // Verificar que los datos en el JSON coinciden con los de la propiedad
        assertEquals("Casa de Playa", jsonObject.optString("nombrePropiedad"));
        assertEquals("1200", jsonObject.optString("precio"));
        assertEquals("Costa Rica", jsonObject.optString("ubicacion"));
        assertEquals("Piscina, WiFi, Aire Acondicionado", jsonObject.optString("amenidadesCasa"));
        assertEquals(6, jsonObject.optInt("cantidadPersonas"));
        assertEquals(3, jsonObject.optInt("cantidadHabitaciones"));
        assertEquals("http://imagen.com/casa.jpg", jsonObject.optString("imagenUrl"));
    }
}
