/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4_tema3;
import java.util.Scanner;

/**
 *
 * @author hate_
 */
public class Ejercicio4_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Por último, introduzca un tercer número: ");
        num3 = entrada.nextInt();
        
        if(num1<num2&&num1<num3){
            System.out.println("El mayor de los introducidos es "+num1);
        }
        else if(num2<num1&&num2<num3){
            System.out.println("El mayor de los introducidos es "+num2);
        }
        else{
            System.out.println("El mayor de los introducidos es "+num3);
        }
        // TODO code application logic here
    }
    
}
