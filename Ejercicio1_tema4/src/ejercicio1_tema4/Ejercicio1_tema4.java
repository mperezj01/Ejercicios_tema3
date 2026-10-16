/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */


public class Ejercicio1_tema4 {
    public static void valoracionNumero(int numero){
        if(numero>0){
            System.out.println("Positivo");
        }else
            System.out.println("Negativo");
}
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        num = entrada.nextInt();
        
        valoracionNumero(num);
        
        // TODO code application logic here
    }
    
}
