/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6_tema3;
import java.util.Scanner;//Importo el paquete de scanner de java util

/**
 *
 * @author hate_
 */
public class Ejercicio6_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;//Declaro la variable entera nota
        
        Scanner entrada = new Scanner(System.in);//Inicio el scanner como entrada
        System.out.println("Por favor, introduzca la nota entre 0 y 10 del alumno: ");
        nota = entrada.nextInt();//Asigno el valor de entrada a la variable nota
        
        if(nota>=0&&nota<=4){//Pongo la condición de si nota es mayor o igual a 0 y menor o igual a 4, imprimo suspenso
            System.out.println("Suspenso");
        }
        else if(nota>4&&nota<=6){//Si es mayor a 4 y menor o igual a 6, imprimo bien
            System.out.println("Bien");
        }
        else if(nota>6&&nota<=8){//Si es mayor que 6 y menor o igual a 8, notable
            System.out.println("Notable");
        }
        else{//Si no, es sobresaliente
            System.out.println("Sobresaliente");
        }
        
        // TODO code application logic here
    }
    
}
