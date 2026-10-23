/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21_tema3;
import java.util.Scanner;

/**
 *
 * @author hate_
 */
public class Ejercicio21_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        num1=entrada.nextInt();
        System.out.println("Ahora introduzca un divisor:");
        num2=entrada.nextInt();
        float resultado = 0;
        try{
            resultado = num1/num2;
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        if(num2>0){
        System.out.println("El resultado es "+resultado);
        }
        
        
        
        // TODO code application logic here
    }
    
}
