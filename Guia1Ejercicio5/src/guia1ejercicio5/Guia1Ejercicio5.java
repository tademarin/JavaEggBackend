/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ejercicio5;

import java.util.Scanner;
/**
 *
 * @author Tadeo
 */
public class Guia1Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int num = sc.nextInt();

        int doble = num * 2;
        int triple = num * 3;
        double raizCuadrada = Math.sqrt(num);

        System.out.println("El doble de " + num + " es: " + doble);
        System.out.println("El triple de " + num + " es: " + triple);
        System.out.println("La raíz cuadrada de " + num + " es: " + raizCuadrada);
    }
}
