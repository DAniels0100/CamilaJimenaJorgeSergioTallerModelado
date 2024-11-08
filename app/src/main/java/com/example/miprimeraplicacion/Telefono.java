package com.example.miprimeraplicacion;

public class Telefono {
    // Método para verificar que el número de teléfono es correcto
    public boolean telefonoCorrecto(String telefono) {
        // Verificar que la longitud sea 8 y que todos los caracteres sean dígitos
        if (telefono.length() == 8 && telefono.matches("\\d{8}")) {
            return true;
        }
        return false;
    }
}
