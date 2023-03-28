/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ejercicio3;

import java.util.Scanner; 

/**
 *
 * @author Tadeo
 */
public class Guia1Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine();

        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();

        System.out.println("La frase en mayúsculas es: " + mayusculas);
        System.out.println("La frase en minúsculas es: " + minusculas);
    }
}

