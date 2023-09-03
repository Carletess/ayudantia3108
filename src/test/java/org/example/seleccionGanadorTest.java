package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class seleccionGanadorTest {

    @Test
    void testGanadorJugador1Gana() {
        int[] puntajes = {15, 10};
        String resultado = seleccionGanador.ganador(puntajes);
        assertEquals("Jugador 1 ganó.", resultado);
    }
    @Test
    void testGanadorValoresNegativos1() {
        int[] puntajes = {-1, -2};
        String resultado = seleccionGanador.ganador(puntajes);
        assertEquals("Jugador 1 ganó.", resultado);
    }
    @Test
    void testGanadorValoresNegativos2() {
        int[] puntajes = {-3, -2};
        String resultado = seleccionGanador.ganador(puntajes);
        assertEquals("Jugador 2 ganó.", resultado);
    }
    @Test
    void testGanadorJugador2Gana() {
        int[] puntajes = {5, 18};
        String resultado = seleccionGanador.ganador(puntajes);
        assertEquals("Jugador 2 ganó.", resultado);
    }

    @Test
    void testGanadorEmpate() {
        int[] puntajes = {10, 10};
        String resultado = seleccionGanador.ganador(puntajes);
        assertEquals("Empate.", resultado);
    }
    @Test
    void testGanadorEmpateFueraDeRango() {
        int[] puntajes = {50, 150};
        String resultado = seleccionGanador.ganador(puntajes);
        assertEquals("Empate.", resultado);
    }

}
