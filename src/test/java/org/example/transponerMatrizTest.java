package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class transponerMatrizTest {

    @Test
    void llenarMatriz() {
        int[][] matriz = new int[3][3];
        transponerMatriz.llenarMatriz(matriz);

        // Verifica que la matriz se haya llenado correctamente
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                assertTrue(matriz[i][j] >= 1 && matriz[i][j] <= 10);
            }
        }
    }

    @Test
    void obtenerMatrizTranspuesta() {
        int[][] matrizOriginal = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizTranspuesta = transponerMatriz.obtenerMatrizTranspuesta(matrizOriginal);

        // Verifica que las dimensiones de la matriz transpuesta sean correctas
        assertEquals(matrizOriginal.length, matrizTranspuesta[0].length);
        assertEquals(matrizOriginal[0].length, matrizTranspuesta.length);

        // Verifica que la matriz transpuesta sea realmente la transpuesta de la matriz original
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[0].length; j++) {
                assertEquals(matrizOriginal[i][j], matrizTranspuesta[j][i]);
            }
        }
    }
}
