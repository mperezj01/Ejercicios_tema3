/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_tema2;
import java.util.Scanner;//Importamos el paquete de scanner de java util

/**
 *
 * @author alumno
 */
public class Ejercicio1_tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;//Declaro la variable numero como entero
        Scanner entrada = new Scanner(System.in);//Inicio el scanner entrada
        System.out.println("Por favor, introduzca un número: ");//Pido al usuario que introduzca un número por consola
        numero = entrada.nextInt();//Declaro la variable numero a través de la entrada
        
        if(numero>0){
            System.out.println("El número es positivo");//Pongo la condición de si el número introducido el mayor a cero, sea positivo
        }
        else{
            System.out.println("El número es negativo");//Si no es mayor a cero, es negativo
        }
        // TODO code application logic here
    }
    
}
