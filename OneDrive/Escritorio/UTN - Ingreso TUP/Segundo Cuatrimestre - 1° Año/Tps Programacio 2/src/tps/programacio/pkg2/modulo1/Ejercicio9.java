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
public class Ejercicio9 {
    
    /*CODIGO PROPUESTO import java.util.Scanner;
public class ErrorEjemplo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa tu nombre: ");
String nombre = scanner.nextInt(); // ERROR
System.out.println("Hola, " + nombre); */

//CODIGO CORREGIDO
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre;
        nombre = input.nextLine();
        System.out.println("Hola, " + nombre); 
        
        /*Se cambió la linea de system.out.print por println. se Declaró la variable nombre como string
        y se elimininó la linea de código de String nombre = scanner.nextInt (la variable no es un número entero) y se declaró correctamente
        */
        
    }
}
