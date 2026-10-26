/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_tema4;
import java.util.Scanner;//Importo el Scanner del paquete java.util

/**
 *
 * @author alumno
 */
public class Ejercicio2_tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;//Declaro las variables como int
        Scanner entrada = new Scanner(System.in);//Inicio el scanner
        System.out.println("Introduzca un primer numero:");
        num1 = entrada.nextInt();//Asigno la entrada del Scanner a la variable
        System.out.println("Introduzca un segundo numero:");
        num2 = entrada.nextInt();
        
        if(num1>10){/*Pongo la condición de que si la variable introducida es mayor que 10, 
                    realizaremos el producto, y llamaremos al método de producto*/
            Operaciones.producto(num1, num2);//Llamo a la clase Operaciones y al método y le doy las variables num1 y num2
        }else{//Si no es mayor que 10, realizaremos la suma, llamando al método suma
            Operaciones.suma(num1, num2);//Llamo a la clase Operaciones y al método suma y le doy las variables num1 y num2
        }
        // TODO code application logic here
    }
    
}
