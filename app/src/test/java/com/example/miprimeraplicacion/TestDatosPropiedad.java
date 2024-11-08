package com.example.miprimeraplicacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class TestDatosPropiedad {

    private Propiedad propiedad;

    @Before
    public void setUp() {
        propiedad = new Propiedad(
                "Casa de Playa",
                "1200",
                "Guanacaste",
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
        assertEquals("Guanacaste", jsonObject.optString("ubicacion"));
        assertEquals("Piscina, WiFi, Aire Acondicionado", jsonObject.optString("amenidadesCasa"));
        assertEquals(6, jsonObject.optInt("cantidadPersonas"));
        assertEquals(3, jsonObject.optInt("cantidadHabitaciones"));
        assertEquals("http://imagen.com/casa.jpg", jsonObject.optString("imagenUrl"));
    }


    @Test
    public void testSaveDataJSONWithIncorrectValues() {
        // Ejecutar el método saveDataJSON()
        JSONObject jsonObject = propiedad.saveDataJSON();

        assertNotEquals("Casa de Montaña", jsonObject.optString("nombrePropiedad"));
        assertNotEquals("1000", jsonObject.optString("precio"));
        assertNotEquals("Panamá", jsonObject.optString("ubicacion"));
        assertNotEquals("Jacuzzi, WiFi", jsonObject.optString("amenidadesCasa"));
        assertNotEquals(4, jsonObject.optInt("cantidadPersonas"));
        assertNotEquals(2, jsonObject.optInt("cantidadHabitaciones"));
        assertNotEquals("http://imagen.com/montana.jpg", jsonObject.optString("imagenUrl"));
    }

    @Test
    public void testLimpiarCampos() {
        // Ejecutar el método limpiarCampos
        propiedad.refreshData();

        // Verificar que los atributos de tipo String estén vacíos
        assertEquals("", propiedad.getNombre());
        assertEquals("", propiedad.getPrecio());
        assertEquals("", propiedad.getUbicacion());
        assertEquals("", propiedad.getAmenidades());
        assertEquals("", propiedad.getImagenUrl());
    }
}
