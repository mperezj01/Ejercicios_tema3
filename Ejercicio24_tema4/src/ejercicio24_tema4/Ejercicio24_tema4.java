/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24_tema4;
import java.util.Scanner;

/**
 *
 * @author hate_
 */
public class Ejercicio24_tema4 {

    /**
     * @param args the command line arguments
     */
    
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca su nombre");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static int pedirEdad(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ahora introduzca su edad");
        int edad = entrada.nextInt();
        return edad;
    }
    
    public static void mayorDeEdad(String nombre, int edad){
        if(edad>=18){
            System.out.println(nombre+" es mayor de edad");
        }else{
            System.out.println(nombre+" es menor de edad");
        }
    }
    
    public static void main(String[] args) {
        String nombre = pedirNombre();
        int edad = pedirEdad();
        mayorDeEdad(nombre, edad);
        
        
        // TODO code application logic here
    }
    
}
