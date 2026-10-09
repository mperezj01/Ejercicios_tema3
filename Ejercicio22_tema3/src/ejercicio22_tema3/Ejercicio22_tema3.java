/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22_tema3;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hate_
 */
public class Ejercicio22_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner entrada = new Scanner(System.in);
        
        try{
            System.out.println("Introduzca un numero:");
            num1 = entrada.nextInt();
            System.out.println("Introduzca el segundo numero:");
            num2 = entrada.nextInt();
            resultado=num1+num2;
            System.out.println("La suma de los numero introducidos es: "+resultado);
        }
        catch(InputMismatchException e){
            System.out.println("El valor introducido no es un numero");
        }
        
        // TODO code application logic here
    }
    
}
