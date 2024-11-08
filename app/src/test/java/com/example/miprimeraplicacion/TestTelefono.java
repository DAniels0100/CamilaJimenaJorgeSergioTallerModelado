package com.example.miprimeraplicacion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestTelefono {

    private final Telefono telefonoChecker = new Telefono();

    @Test
    public void testTelefonoCorrecto_WithValidNumber() {
        // Prueba con un número de teléfono válido
        assertTrue("El número de teléfono debería ser válido",
                telefonoChecker.telefonoCorrecto("12345678"));
    }

    @Test
    public void testTelefonoCorrecto_WithShortNumber() {
        // Prueba con un número de teléfono demasiado corto
        assertFalse("El número de teléfono no debería ser válido",
                telefonoChecker.telefonoCorrecto("12345678"));
    }

    @Test
    public void testTelefonoCorrecto_WithNonDigitCharacters() {
        // Prueba con un número de teléfono que contiene caracteres no numéricos
        assertFalse("El número de teléfono no debería ser válido",
                telefonoChecker.telefonoCorrecto("1234abcd"));
    }
}
