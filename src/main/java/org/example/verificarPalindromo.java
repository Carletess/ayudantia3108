package org.example;

public class verificarPalindromo {
    public static void main(String[] args) {
        String palindromo = "reconocer";

        System.out.println(esPalindromo(palindromo));
    }

    public static boolean esPalindromo(String palabraIngresada) {
        palabraIngresada = palabraIngresada.replace(" ", ""); //error

        StringBuilder stringBuilder = new StringBuilder(palabraIngresada);
        String palabraInvertida = stringBuilder.reverse().toString();

        return palabraIngresada.equalsIgnoreCase(palabraInvertida);
    }
}
