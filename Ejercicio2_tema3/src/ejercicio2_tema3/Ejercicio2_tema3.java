/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_tema3;
import java.util.Scanner;//Importo la librería de Scanner

/**
 *
 * @author alumno
 */
public class Ejercicio2_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, resultado;//Asigno las variables como enteros
        Scanner entrada = new Scanner(System.in);//Inicio el scanner como entrada
        System.out.println("Por favor, introduzca un número: ");//Pido por consola que el usuario introduzca un número
        num1 = entrada.nextInt();//Asigno la entrada a la variable num1
        System.out.println("Ahora, introduzca un segundo número: ");//Pido otro número
        num2 = entrada.nextInt();//Asigno la segunda entrada a num2
        
        if(num1>10){//Pongo la condición de si el primer número es mayor a diez, los númersos se multipliquen
            resultado=num1*num2;
            System.out.println("La operación que se realizó es producto, y el resultado es: "+resultado);
        }
        else{//Si no es mayor que diez, los números se sumarán
            resultado=num1+num2;
            System.out.println("La operación que se realizó es suma, y el resultado es: "+resultado);
        }
            
        // TODO code application logic here
    }
    
}
