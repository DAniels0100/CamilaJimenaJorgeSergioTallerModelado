package com.example.miprimeraplicacion;

public class Nickname {

    // Lista de palabras prohibidas
    public static final String[] PROHIBITED_WORDS = {
            "sexo", "muerte", "puta", "estúpido", "estúpida", "mierda", "pene", "vagina",
            "cabrón", "tonto", "idiota", "coño", "maldito", "imbecil", "bastardo", "nazi",
            "estupido", "estupida", "imbécil"
    };

    // Método para verificar si el nickname contiene palabras prohibidas
    public boolean containsProhibitedWords(String nickname) {
        for (String word : PROHIBITED_WORDS) {
            if (nickname.toLowerCase().contains(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
