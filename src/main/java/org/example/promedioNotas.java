package org.example;

public class promedioNotas {
    public static void main(String[] args) {
        double [] notas = {70, 70, 10, 65, 50};
        System.out.println(calcularPromedioNotas(notas));
    }

    public static double calcularPromedioNotas(double [] notas) {
        double [] ponderacionNotas = {0.25, 0.25, 0.25, 0.15, 0.10};
        double promedio = 0;

        for (int i = 0; i < notas.length; i++) {
            promedio += (notas[i] * ponderacionNotas[i]);
        }

        return promedio;
    }
}
