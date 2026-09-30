/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9_tema3;
import java.util.Scanner;//Importo el scanner del paquete java.util

/**
 *
 * @author hate_
 */
public class Ejercicio9_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4, auxiliar;//Declaro las variables enteras
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ,introduzca el primer numero: ");
        num1=entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo numero: ");
        num2=entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        num3=entrada.nextInt();
        System.out.println("Por ultimo, introduzca el cuarto numero: ");
        num4=entrada.nextInt();
        
        if(num1>num2){
            auxiliar=num2;
            num2=num1;
            num1=auxiliar;//Si el primer numero es mayor al segundo, los intercambio
        }
        if(num2>num3){
            auxiliar=num3;
            num3=num2;
            num2=auxiliar;
        }
        if(num3>num4){
            auxiliar=num4;
            num4=num3;
            num3=auxiliar;
        }
        //Repito todo el proceso anterior una segunda vez
        if(num1>num2){
            auxiliar=num2;
            num2=num1;
            num1=auxiliar;
        }
        if(num2>num3){
            auxiliar=num3;
            num3=num2;
            num2=auxiliar;
        }
        if(num3>num4){
            auxiliar=num4;
            num4=num3;
            num3=auxiliar;
        }
        //Repito todo el proceso anterior una tercera y última vez
        if(num1>num2){
            auxiliar=num2;
            num2=num1;
            num1=auxiliar;
        }
        if(num2>num3){
            auxiliar=num3;
            num3=num2;
            num2=auxiliar;
        }
        if(num3>num4){
            auxiliar=num4;
            num4=num3;
            num3=auxiliar;
        }
        System.out.println("El orden ascendente de los numeros introducidos es: "+num1+" - "+num2+" - "+num3+" - "+num4);
        // TODO code application logic here
    }
    
}
