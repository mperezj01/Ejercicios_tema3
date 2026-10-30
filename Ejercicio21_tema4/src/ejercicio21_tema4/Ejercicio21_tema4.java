/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21_tema4;
import java.util.Scanner;

/**
 *
 * @author hate_
 */
public class Ejercicio21_tema4 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirPrimerNumero(){//Inicio un método para pedir el primer número al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero: ");
        int num = entrada.nextInt();
        return num;//devuelvo el número al main
    }
    
    public static int pedirSegundoNumero(int num1){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el segundo numero mayor que el primero: ");
        int num = entrada.nextInt();
        while(num1>=num){//Mientras el numero introducido sea menor o igual que el primero
            System.out.println("Error: el numero debe ser mayor que el primero, intentelo de nuevo");
            num = entrada.nextInt();        
        }
        
        return num;
    }
    
    public static int calcularResultado(int num1, int num2){
        int suma=0;//Declaro la variable suma
        for(int i=num1;i<=num2;i++){//Hago un bucle, desde que i es el primer, numero, hasta que es menor o igual al segundo, voy sumando i
            if(i%2==0){//Si i es par
                suma=suma+i;//Vamos sumando i a la suma que vamos obteniendo
            }
        }
        return suma;
    }
    
    public static void mostrarResultado(int suma){
        System.out.println("La suma de los numero pares es "+suma);
    }
    
    public static void main(String[] args) {
        int num1 = pedirPrimerNumero();
        int num2 = pedirSegundoNumero(num1);
        int suma =calcularResultado(num1, num2);
        mostrarResultado(suma);
        
        // TODO code application logic here
    }
    
}
