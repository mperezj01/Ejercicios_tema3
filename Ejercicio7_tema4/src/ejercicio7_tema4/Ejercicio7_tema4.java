/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7_tema4;
import java.util.Scanner;

/**
 *
 * @author hate_
 */
public class Ejercicio7_tema4 {

    /**
     * @param args the command line arguments
     */
    public static void ordenar(int n1, int n2, int n3, int n4){//Declaro una nueva clase ordenar con sus variables
        int i, aux;//Declaro las variables i y aux
        for(i=0;i<3;i++){//Preparo un bucle for para que se repita la sentencia tres veces para realizar el método burbuja (n-1 veces)
            if(n1>n2){/*Intercambio la posición entre los valores asignados a n1 y n2 
                para que n1 sea el menor, utilizando una variable auxiliar*/
                aux=n2;
                n2=n1;
                n1=aux;
            }
            if(n2>n3){//Repito el proceso con n2 y n3
                aux=n3;
                n3=n2;
                n2=aux;
            }
            if(n3>n4){//Repito el proceso con n3 y n4
                aux=n4;
                n4=n3;
                n3=aux;
            }
        }
        System.out.println("El orden de los numeros introducidos es: "+n1+" - "+n2+" - "+n3+" - "+n4);
    }
    
    public static void main(String[] args) {
        int num1, num2, num3, num4;//Declaro las variables que voy a utilizar
        Scanner entrada = new Scanner(System.in);//Inicio el Scanner
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();//Asigno la entrada del Scanner a las variables
        System.out.println("Ahora, introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca el cuarto numero: ");
        num4 = entrada.nextInt();
        
        ordenar(num1, num2, num3, num4);//Llamo al método ordenar con las variables de este metodo
        
        // TODO code application logic here
    }
    
}
