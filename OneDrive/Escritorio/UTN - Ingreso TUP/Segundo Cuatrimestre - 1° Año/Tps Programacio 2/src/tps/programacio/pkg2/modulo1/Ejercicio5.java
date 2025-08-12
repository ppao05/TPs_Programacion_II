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
public class Ejercicio5 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Intrese el primer numero: ");
        numero1 = input.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = input.nextDouble();
        
        //Operaciones 
        
        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 / numero2);
    }
}
