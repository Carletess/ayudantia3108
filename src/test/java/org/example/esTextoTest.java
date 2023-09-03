package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class esTextoTest {

    @Test
    void testTextoTrue() {
        assertTrue(esTexto.verificarTexto("hola"));
        assertTrue(esTexto.verificarTexto("Mundo"));
        assertTrue(esTexto.verificarTexto("comer"));
    }

    @Test
    void testTextoConNumeros() {
        assertFalse(esTexto.verificarTexto("Hola123"));
        assertFalse(esTexto.verificarTexto("Texto2Con3Digitos"));
    }

    @Test
    void testTextoConEspacios() {
        assertTrue(esTexto.verificarTexto("tengo espacios"));
        assertFalse(esTexto.verificarTexto(" "));
    }

    @Test
    void testTextoBlanco() {
        assertFalse(esTexto.verificarTexto(" "));
    }
}
