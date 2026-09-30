/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_tema3;
import java.util.Scanner;//Importo el paquete java util para el Scanner

/**
 *
 * @author alumno
 */
public class Ejercicio3_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;//Asigno las variables como enteros
        
        Scanner entrada = new Scanner(System.in);//Inicio el scanner entrada
        System.out.println("Por favor, introduzca el primer número: ");
        num1 = entrada.nextInt();//Asigno a num1 el valor de la primera entrada
        System.out.println("Ahora, introduzca un segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Por último, introduzca un tercer número: ");
        num3 = entrada.nextInt();
        
        if(num1>num2&&num1>num3){//Pongo la condición de si el primer número es mayor que el segundo y que el tercero, se imprima
            System.out.println("El mayor de los introducidos es "+num1);
        }
        else if(num2>num1&&num2>num3){//Si el segundo es mayor que el primero y el tercero, se imprime el segundo
            System.out.println("El mayor de los introducidos es "+num2);
        }
        else{//Si no, se imprimirá el tercero
            System.out.println("El mayor de los introducidos es "+num3);
        }
        }
        // TODO code application logic here
    }
