/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_tema4;
import java.util.Scanner;//Importo el scanner del paquete java.util

/**
 *
 * @author alumno
 */


public class Ejercicio1_tema4 {
    public static void valoracionNumero(int numero){//Creo una clase para realizar la valoración de si el número introducido es positivo o negativo
        if(numero>0){//Si es mayor que 0, imprimo que es positivo
            System.out.println("Positivo");
        }else//Si no es mayor que 0, será menor que cero, imprimo negativo
            System.out.println("Negativo");
}
    public static void main(String[] args) {
        int num;//Declaro la variable num como entero
        Scanner entrada = new Scanner(System.in);//Inicio el scanner
        System.out.println("Introduzca un numero:");
        num = entrada.nextInt();
        
        valoracionNumero(num);/*llamo al método, para activar la valoración que he implementado 
                                en valoracionNumero y le mando la variable num*/
        
        // TODO code application logic here
    }
    
}
