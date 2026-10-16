/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_tema4;
import java.util.Scanner;
import numeroMayor.mayor;

/**
 *
 * @author alumno
 */
public class Ejercicio3_tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero:");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca el tercer numero:");
        num3 = entrada.nextInt();
        
        mayor.numeroMayor(num1, num2, num3);
        
        // TODO code application logic here
    }
    
}
