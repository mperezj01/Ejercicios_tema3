/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10_tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio10_tema4 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero(){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número para calcular su tabla de multiplicar: ");
        num = entrada.nextInt();
        return num;
    }
    
    public static void tablaMultiplicar(int num){
        int i, resultado;
        for(i=0;i<=10;i++){
            resultado=num*i;
            System.out.println(num+" x "+i+" = "+resultado);
        }
        
        
    }
    public static void main(String[] args) {
        int num;
        num = pedirNumero();
        tablaMultiplicar(num);
        
        // TODO code application logic here
    }
    
}
