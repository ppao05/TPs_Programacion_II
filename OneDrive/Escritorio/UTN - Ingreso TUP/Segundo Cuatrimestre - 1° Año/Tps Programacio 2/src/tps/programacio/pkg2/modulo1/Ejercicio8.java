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
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Intrese el primer numero: ");
        numero1 = input.nextInt();
         System.out.println("Ingrese el segundo numero: ");
        numero2 = input.nextInt();
        
        //Operacion
        
        System.out.println(numero1 / numero2);
        
    //Probramos con double en vez de int, los mismos números para comparar resultados
        double numero3, numero4;
        System.out.println("Intrese el primer numero: ");
        numero3 = input.nextDouble();
         System.out.println("Ingrese el segundo numero: ");
        numero4 = input.nextDouble();
        
        //Operacion
        
        System.out.println(numero3 / numero4);
    }
}
