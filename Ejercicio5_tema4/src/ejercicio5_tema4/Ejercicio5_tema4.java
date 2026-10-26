/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_tema4;
import java.util.Scanner;//Importo el Scanner del paquete java.util
import comparacion.calculos;//Importo calculos del paquete comparacion

/**
 *
 * @author alumno
 */
public class Ejercicio5_tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;//Declaro la variable numero como entero
        Scanner entrada = new Scanner(System.in);//Inicio el Scanner
        System.out.println("Por favor, introduzca un numero:");
        numero = entrada.nextInt();//Asigno la entrada del Scanner a la variable numero
        
        calculos.parImpar(numero);//Llamo al método parimpar de la clase calculos
        // TODO code application logic here
    }
    
}
