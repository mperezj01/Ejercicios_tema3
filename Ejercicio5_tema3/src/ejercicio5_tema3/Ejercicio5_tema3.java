/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_tema3;
import java.util.Scanner;//Importo del paquete java.util el Scanner

/**
 *
 * @author hate_
 */
public class Ejercicio5_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;//Declaro una variable entero num para la entrada
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número: ");
        num = entrada.nextInt();//Declaro que la variable num se corresponda con la próxima entrada
        
        if(num%2==0){//Pongo la condición de si el módulo de dividir num entre 2 es cero, num debe ser par
            System.out.println("El número introducido es par");
        }
        else{//Si no es par, será impar
            System.out.println("El número introducido es impar");
        }
            
        // TODO code application logic here
    }
    
}
