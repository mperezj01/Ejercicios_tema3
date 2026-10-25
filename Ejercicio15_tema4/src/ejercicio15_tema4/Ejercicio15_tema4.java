/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15_tema4;
import java.util.Scanner;

/**
 *
 * @author hate_
 */
public class Ejercicio15_tema4 {

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
    public static void realizarOperaciones(int n1, int n2, int opcion){
        int resultado;
        switch(opcion){
            case 1:
                resultado=n1+n2;
                System.out.println("Suma "+resultado);
                break;
            case 2:
                resultado=n1-n2;
                System.out.println("Resta "+resultado);
                break;
            case 3:
                resultado=n1*n2;
                System.out.println("Multiplicacion "+resultado);
                break;
            case 4:
                try{
                    resultado=n1/n2;
                    System.out.println("Division "+resultado);
                }
                catch(ArithmeticException e){
                    System.out.println("Error: resultado 0");
                }
                    break;
            case 5:
                System.out.println("Saliendo del programa");
        }
    }
    
    public static void main(String[] args) {
        int num1, num2, opcion;
        num1=pedirNumero();
        num2=pedirNumero();
        do{
            opcion=pedirOperaciones();
            realizarOperaciones(num1, num2, opcion);
        }while(opcion!=5);
    
        
        // TODO code application logic here
    }
    
}
