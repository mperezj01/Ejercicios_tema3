/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2_tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un primer numero:");
        num1 = entrada.nextInt();
        System.out.println("Introduzca un segundo numero:");
        num2 = entrada.nextInt();
        
        if(num1>10){
            Operaciones.producto(num1, num2);
        }else{
            Operaciones.suma(num1, num2);
        }
        // TODO code application logic here
    }
    
}
