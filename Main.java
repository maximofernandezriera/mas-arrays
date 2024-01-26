package org.example;

public class Main {
    public static void main(String[] args) {
        final int TAMANO = 20; // Definimos una constante
        int[] numero = new int[TAMANO];
        int[] cuadrado = new int[TAMANO];
        int[] cubo = new int[TAMANO];

        // Inicializamos los arrays
        for (int i = 0; i < TAMANO; i++) {
            // Asignar un valor aleatorio entre 0 y 100 al array numero
            numero[i] = (int) (Math.random() * 101);

            // Calcular el cuadrado y el cubo de dicho número
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
        }

        // Mostrar los resultados
        System.out.printf("%-10s %-10s %-10s%n", "Numero", "Cuadrado", "Cubo");
        for (int i = 0; i < TAMANO; i++) {
            System.out.printf("%-10d %-10d %-10d%n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}