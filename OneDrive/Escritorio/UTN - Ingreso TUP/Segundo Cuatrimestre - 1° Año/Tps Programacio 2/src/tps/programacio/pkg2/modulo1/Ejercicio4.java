/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.programacio.pkg2.modulo1;

import java.util.Scanner;

/**
 *
 * @author ppasa
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        System.out.println(nombre);
        System.out.println(edad);
        
    }
}
