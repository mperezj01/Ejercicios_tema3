/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17_tema3;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num, raiz;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero para realizar su raiz cuadrada:");
        num = entrada.nextDouble();
        
        do{
            raiz=Math.sqrt(num);
        }while(num>0);
        
        // TODO code application logic here
    }
    
}
