/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24_tema3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio24_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i=1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero para el tope: ");
        num = entrada.nextInt();
        
        while(num<0){
            System.out.println("Error, introduzca un numero mayor que 1");
            num = entrada.nextInt();
        }
        while(i<=num){
            if(i%3==0){
                System.out.println(i);
            }
            i++;
        }//do while + for
        // TODO code application logic here
    }
    
}
