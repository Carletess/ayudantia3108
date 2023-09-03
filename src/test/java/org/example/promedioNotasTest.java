package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.promedioNotas;

class promedioNotasTest {

    @Test
    void calcularPromedioNotas() {
        double[] notas = {70, 70, 10, 65, 50};
        double[] ponderacionNotas = {0.25, 0.25, 0.25, 0.15, 0.10};

        // Llama al método calcularPromedioNotas
        double resultado = promedioNotas.calcularPromedioNotas(notas);

        // Comprueba que el resultado sea igual al valor esperado
        double resultadoEsperado = 52.25; // El promedio ponderado esperado
        assertEquals(resultadoEsperado, resultado, 0.001); // Usamos un margen de error pequeño (0.001) para la comparación de números decimales
    }
}
