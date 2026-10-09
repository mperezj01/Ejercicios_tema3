/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27_tema3;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio27_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, orden, resultado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un primer numero:");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        num2 = entrada.nextInt();
        do{
            System.out.println("Decida la operacion que quiere realizar:");
            System.out.println("1.- Sumar los numeros.");
            System.out.println("2.- Restar los numeros.");
            System.out.println("3.- Multiplicar los numeros.");
            System.out.println("4.- Dividir los numeros.");
            System.out.println("5.- Salir del programa.");
            orden = entrada.nextInt();
            if(orden==1){
                resultado=num1+num2;
                System.out.println("El resultado de la suma es "+resultado);
            }
            if(orden==2){
                resultado=num1-num2;
                System.out.println("El resultado de la resta es "+resultado);
            }
            if(orden==3){
                resultado=num1*num2;
                System.out.println("El resultado del producto es "+resultado);
            }
            if(orden==4){
                try{
                resultado=num1/num2;
                System.out.println("El resultado de la división es "+resultado);
                }
                catch(ArithmeticException e){
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }while(orden!=5);
        System.out.println("Saliendo del programa");
        
        // TODO code application logic here
    }
    
}
