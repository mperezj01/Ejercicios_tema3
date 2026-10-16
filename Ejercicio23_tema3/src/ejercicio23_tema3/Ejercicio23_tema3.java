/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23_tema3;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i=1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero para el tope: ");
        num = entrada.nextInt();
        
        while(num<=1){
            System.out.println("Error, introduzca un numero mayor que 1");
            num = entrada.nextInt();
        }
        while(i<=num){
            System.out.println(i);
            i++;
            
        }//mejor con do while + for
        // TODO code application logic here
    }
    
}
