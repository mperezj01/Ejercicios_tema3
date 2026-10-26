/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8_tema4;
import java.util.Scanner;//Importo el Scanner del paquete java.util

/**
 *
 * @author hate_
 */
public class Ejercicio8_tema4 {

    /**
     * @param args the command line arguments
     */
    
    public static void contarDinero(int total, int b50, int b20, int b10, int b5, int m2, int m1){/*Declaro un nuevo método contarDinero
        para realizar las operaciones. (!!Debería haberle pasado solo la variable total y declarar los billetes y las monedas en la clase
        contarDinero)*/
        System.out.println(total+" euros se descomponen en: ");
        
        b50=total/50;//Calculo en numero de billetes de 50 dividiendo el total entre 50
        total=total%50;//Actualizo el total por el resto de la división anterior
        b20=total/20;//Divido el total entre 20 para obtener la cantidad de billetes de 20
        total=total%20;//Actualizo el total, y repito la operación con todas las cantidades
        b10=total/10;
        total=total%10;
        b5=total/5;
        total=total%5;
        m2=total/2;
        m1=total%2;//Las monedas de 1 serán el resto de dividir el total sobrante entre 2
        
        if(b50>0){//Creo las condiciones de si los valores son mayor a 0, imprimo por pantalla la cantidad, si no, no
            System.out.println("Billetes de 50: "+b50);
        }
        if(b20>0){//Repito la operación con el resto de variables
            System.out.println("Billetes de 20: "+b20);
        }
        if(b10>0){
            System.out.println("Billetes de 10: "+b10);
        }
        if(b5>0){
            System.out.println("Billetes de 5: "+b5);
        }
        if(m2>0){
            System.out.println("Monedas de 2: "+m2);
        }
        if(m1>0){
            System.out.println("Monedas de 1: "+m1);
        }
        
    }
    public static void main(String[] args) {
        int dinero, b50=0, b20=0, b10=0, b5=0, m2=0, m1=0;//Declaro las variables
        Scanner entrada = new Scanner(System.in);//Inicio el Scanner
        System.out.println("Introduzca una cantidad de dinero: ");
        dinero = entrada.nextInt();//Asigno el valor del Scanner a la variable dinero
        
        contarDinero(dinero, b50, b20, b10, b5, m2, m1);//Llamo al método contarDinero para que realice las operaciones, mandándole las variables
        // TODO code application logic here
    }
    
}
