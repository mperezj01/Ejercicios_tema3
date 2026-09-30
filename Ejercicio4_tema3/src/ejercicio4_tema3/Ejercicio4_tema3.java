/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4_tema3;
import java.util.Scanner;//Importo el scanner del paquete java util

/**
 *
 * @author hate_
 */
public class Ejercicio4_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;//Declaro las variables como int
        
        Scanner entrada = new Scanner(System.in);//Inicio el scanner entrada
        System.out.println("Por favor, introduzca el primer número: ");
        num1 = entrada.nextInt();//Asigno el valor de la variable num1 como la entrada por consola
        System.out.println("Ahora, introduzca un segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Por último, introduzca un tercer número: ");
        num3 = entrada.nextInt();
        
        if(num1<num2&&num1<num3){//Pongo la condición, si num1 es menor que num2 y que num3, es el menor
            System.out.println("El menor de los introducidos es "+num1);
        }
        else if(num2<num1&&num2<num3){//Si num2 es menor que num1 y que num2, es el menor
            System.out.println("El menor de los introducidos es "+num2);
        }
        else{//Si no, el menor tiene que ser num3 
            System.out.println("El menor de los introducidos es "+num3);
        }
        // TODO code application logic here
    }
    
}
