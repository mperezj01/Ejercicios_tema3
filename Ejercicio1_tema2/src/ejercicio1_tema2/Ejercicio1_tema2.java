/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_tema2;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1_tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número: ");
        numero = entrada.nextInt();
        
        if(numero>0){
            System.out.println("El número es positivo");
        }
        else{
            System.out.println("El número es negativo");
        }
        // TODO code application logic here
    }
    
}
