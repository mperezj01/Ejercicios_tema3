/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17_tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17_tema4 {

    /**
     * @param args the command line arguments
     */
    
    public static char pedirLetra(){
        char letra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Intente adivinar la letra introduciendo una letra: ");
        letra = entrada.nextLine().charAt(0);
        return letra;
    }
    public static int generarLetraAleatoria(){
        int aleatorio = (int)(Math.random()*122)+97;
        char letraAleatoria = (char)aleatorio;
        return letraAleatoria;
    }
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    
}
