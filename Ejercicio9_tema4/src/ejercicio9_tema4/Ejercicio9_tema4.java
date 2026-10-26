/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9_tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9_tema4 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero (){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        num = entrada.nextInt();
        return num;
    }
    public static void imprimirNumeroMenor (int n1, int n2, int n3){
        if(n1<n2&&n1<n3){
            System.out.println(n1);
        }else if(n2<n1&&n2<n3){
            System.out.println(n2);
        }else{
            System.out.println(n3);
        }
    }
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = pedirNumero();
        num2 = pedirNumero();
        num3 = pedirNumero();
        
        imprimirNumeroMenor(num1, num2, num3);
        
        
        // TODO code application logic here
    }
    
}
