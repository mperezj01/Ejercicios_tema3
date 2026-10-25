/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11_tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio11_tema4 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero(){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número para calcular su raiz cuadrada: ");
        num = entrada.nextInt();
        return num;
    }
    public static int calcularRaiz(int numero){
        int resultado;
        resultado = (int)Math.sqrt(numero);
        return resultado;
    }
    public static void imprimirResultado(int resultado){
        System.out.println("El resultado de la raiz es "+resultado);
    }
    public static void main(String[] args) {
        int numero, resultado;
        numero = pedirNumero();
        resultado = calcularRaiz(numero);
        //resultado=calcularRaiz();//Por qué no funciona esto?
        imprimirResultado(resultado);
        
        // TODO code application logic here
    }
    
}
