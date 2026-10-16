/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6_tema4;
import java.util.Scanner;
import calculo.notas;

/**
 *
 * @author alumno
 */
public class Ejercicio6_tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la nota del alumno:");
        nota = entrada.nextInt();
        
        notas.ponderacion(nota);
        // TODO code application logic here
    }
    
}
