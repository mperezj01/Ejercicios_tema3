/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15_tema4_opcionb;

import java.util.Scanner;

/**
 *
 * @author hate_
 */
public class Ejercicio15_tema4_OPCIONB {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero(){
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        numero = entrada.nextInt();
        return numero;
    }
    public static int pedirOperaciones(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("1.- Sumar los numeros.");
        System.out.println("2.- Restar los numeros.");
        System.out.println("3.- Multiplicar los numeros.");
        System.out.println("4.- Dividir los numeros.");
        System.out.println("5.- Salir del programa");
        opcion = entrada.nextInt();
        
        return opcion;
    }
    public static int realizarOperaciones(int n1, int n2, int opcion){
        int resultado=0;
        switch(opcion){
            case 1:
                resultado=n1+n2;
                break;
            case 2:
                resultado=n1-n2;
                break;
            case 3:
                resultado=n1*n2;
                break;
            case 4:
                try{
                    resultado=n1/n2;
                }
                catch(ArithmeticException e){
                    System.out.println("Error: resultado 0");
                }
                    break;
            case 5:
                System.out.println("Saliendo del programa");
        }
        return resultado;
    }
    public static void imprimirResultados(int resultado){
        System.out.println("El resultado de la operación es: "+resultado);
    }
    
    public static void main(String[] args) {
        int num1, num2, opcion, resultado;
        num1=pedirNumero();
        num2=pedirNumero();
        do{
            opcion=pedirOperaciones();
            resultado=realizarOperaciones(num1, num2, opcion);
            imprimirResultados(resultado);
        }while(opcion!=5);
        
        // TODO code application logic here
    }
    
}
