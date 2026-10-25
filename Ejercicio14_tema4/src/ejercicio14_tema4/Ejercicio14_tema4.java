/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14_tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14_tema4 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero(){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número mayor que 1");
        do{
            num = entrada.nextInt();
            if(num<=1){
                System.out.println("Error: introduzca un numero mayor que 1");
            }
        }while(num<=1);
        return num;
    }
    public static boolean comprobacionNumero(int num){
        boolean correcto=false;
        if(num<=0){
            correcto=false;
        }else{
            correcto=true;
        }
        return correcto;
    }
    public static void mostrarResultado(int num){
        int i, contador=0;
        for(i=1;i<=num;i++){
            if(i%3==0){
                System.out.println(i);
                contador++;
            }
            
        }
        System.out.println("Total de numero mostrados: "+contador);
    }
    public static void main(String[] args) {
        int num;
        boolean correcto=false;
        num=pedirNumero();
        correcto=comprobacionNumero(num);
        mostrarResultado(num);
        
        
        // TODO code application logic here
    }
    
}
