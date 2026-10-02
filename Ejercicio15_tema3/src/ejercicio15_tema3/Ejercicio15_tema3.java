/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15_tema3;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar:");
        num = entrada.nextInt();
        
        for(i=0;i<11;i++){
            resultado=num*i;
            System.out.println(num+"x"+i+"="+resultado);
        }
        
        
        // TODO code application logic here
    }
    
}
