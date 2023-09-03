package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class verificarPalindromoTest {

    @Test
    void testPalindromo() {
        assertTrue(verificarPalindromo.esPalindromo("reconocer"));
        assertTrue(verificarPalindromo.esPalindromo("anilina"));
        assertTrue(verificarPalindromo.esPalindromo("la sal"));
        assertTrue(verificarPalindromo.esPalindromo("oso"));
    }

    @Test
    void testPalindromoFalso() {
        assertFalse(verificarPalindromo.esPalindromo("clase"));
        assertFalse(verificarPalindromo.esPalindromo("falso"));
        assertFalse(verificarPalindromo.esPalindromo("java"));
    }

    @Test
    void testPalindromoConEspacios() {
        assertTrue(verificarPalindromo.esPalindromo("anita lava la tina"));
    }
}
