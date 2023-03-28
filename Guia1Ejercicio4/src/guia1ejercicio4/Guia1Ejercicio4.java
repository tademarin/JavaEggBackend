/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Tadeo
 */
public class Guia1Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados centígrados: ");
        double celsius = sc.nextDouble();

        double fahrenheit = 32 + (9 * celsius / 5);

        System.out.println(celsius + " grados centígrados son equivalentes a " + fahrenheit + " grados Fahrenheit.");
    }
}
