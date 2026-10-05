/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17_tema3;
import java.util.Scanner;//Importamos scanner del paquete java.util

/**
 *
 * @author alumno
 */
public class Ejercicio17_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num, raiz;//Declaro las variables num y raiz como double
        Scanner entrada = new Scanner(System.in);//Inicio el scanner entrada
        System.out.println("Introduzca un numero para realizar su raiz cuadrada:");
        num = entrada.nextDouble();//Asigno la entrada del scanner a la variable num
        
        if(num<0){//Pongo la condición de si num es menor a 0, entonces
            do{//Inicio un bucle para pedir otro número hasta que sea válido, mayor que 0
            System.out.println("Error: el número introducido no es valido");
            System.out.println("Introduzca un numero para realizar su raiz cuadrada:");
            num = entrada.nextDouble();
            }while (num<0);//El bucle dura mientras el num introducido es menor que cero, o negativo
        }
            
        raiz=Math.sqrt(num);//Asignamos el valor de raiz, que es la raiz cuadrada de num (cuando es positivo)
            System.out.println("La raíz cuadrada del número "+num+" es igual a "+raiz);
        }
}
        // TODO code application logic here
        
    
    
