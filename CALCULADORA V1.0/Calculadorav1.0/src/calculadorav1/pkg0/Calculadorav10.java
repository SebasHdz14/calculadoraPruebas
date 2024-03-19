/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorav1.pkg0;

import java.util.Scanner;

/**
 *
 * @author cgcalvillo
 */

public class Calculadorav10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACIONES
        int num1;
        int num2;
        int suma = 0; 
        int resta = 0; 
        int multiplicacion = 0;
        double division = 0;
        Scanner scanner = new Scanner(System.in);
        // Se solicitan los datos al usuario
        System.out.println("Ingrese el primer numero:");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero:");
        num2 = scanner.nextInt();

        // Realizar las operaciones básicas
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        // Mostrar los resultados al usuario
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + multiplicacion);
        System.out.println("La division de " + num1 + " y " + num2 + " es: " + division);
    }
}
