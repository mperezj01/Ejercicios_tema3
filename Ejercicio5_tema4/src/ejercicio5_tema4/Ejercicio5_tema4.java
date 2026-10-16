/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_tema4;
import java.util.Scanner;
import comparacion.calculos;

/**
 *
 * @author alumno
 */
public class Ejercicio5_tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero:");
        numero = entrada.nextInt();
        
        calculos.parImpar(numero);
        // TODO code application logic here
    }
    
}
