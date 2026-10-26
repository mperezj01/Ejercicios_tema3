/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6_tema4;
import java.util.Scanner;//Importo el Scanner del paquete java.util
import calculo.notas;//Importo notas del paquete calculo

/**
 *
 * @author alumno
 */
public class Ejercicio6_tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;//Declaro la variable nota como entero
        Scanner entrada = new Scanner(System.in);//Inicio el Scanner
        System.out.println("Introduzca la nota del alumno:");
        nota = entrada.nextInt();//Asigno el valor del Scanner a la variable nota
        
        notas.ponderacion(nota);//Llamo al método ponderacion de la clase notas, y le mando la variable nota
        // TODO code application logic here
    }
    
}
