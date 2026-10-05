/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15_tema3;
import java.util.Scanner;//Importo el paquete java.util para el Scanner

/**
 *
 * @author alumno
 */
public class Ejercicio15_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i, resultado;//Declaro las variables num, i y resultado como int
        Scanner entrada = new Scanner(System.in);//Inicio el scanner
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar:");
        num = entrada.nextInt();//Asigno a num la entrada del scanner
        
        for(i=0;i<11;i++){//Inicio el bucle, siendo i 0 hasta que sea menor que 11, o sea 10, voy incrementando el valor de i
            resultado=num*i;//Asigno que resultado es el producto de num e i para sacar una tabla de multiplicar por 1 al 10
            System.out.println(num+"x"+i+"="+resultado);//Imprimo los resultados
        }
        
        
        // TODO code application logic here
    }
    
}
