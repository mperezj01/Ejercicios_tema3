/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6_tema3;
import java.util.Scanner;

/**
 *
 * @author hate_
 */
public class Ejercicio6_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca la nota del alumno entre 0 y 10: ");
        nota = entrada.nextInt();
        
        if(nota>=0&&nota<=4){
            System.out.println("Suspenso");
        }
        else if(nota>4&&nota<=6){
            System.out.println("Bien");
        }
        else if(nota>6&&nota<=8){
            System.out.println("Notable");
        }
        else{
            System.out.println("Sobresaliente");
        }
        
        // TODO code application logic here
    }
    
}
