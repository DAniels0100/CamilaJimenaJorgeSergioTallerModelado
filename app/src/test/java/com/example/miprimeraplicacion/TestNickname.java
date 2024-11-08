package com.example.miprimeraplicacion;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestNickname {

    private final Nickname nicknameChecker = new Nickname();

    @Test
    public void testContainsProhibitedWords_WithProhibitedWord() {
        // Prueba con un nickname que contiene una palabra prohibida
        assertTrue("El nickname debería contener una palabra prohibida",
                nicknameChecker.containsProhibitedWords("este_es_un_pene"));
    }

    @Test
    public void testContainsProhibitedWords_WithoutProhibitedWord() {
        // Prueba con un nickname que no contiene palabras prohibidas
        assertFalse("El nickname no debería contener ninguna palabra prohibida",
                nicknameChecker.containsProhibitedWords("nickname_seguro"));
    }

    @Test
    public void testContainsProhibitedWords_WithPartialMatch() {
        // Prueba con un nickname que contiene una palabra parcial que no debería ser prohibida
        assertFalse("El nickname no debería marcarse como prohibido por contener parte de una palabra prohibida",
                nicknameChecker.containsProhibitedWords("amistad_estup"));
    }
}
