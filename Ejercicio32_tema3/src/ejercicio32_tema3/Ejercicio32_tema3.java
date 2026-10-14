/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32_tema3;
import java.util.Scanner;//Importo el scanner del paquete java.util

/**
 *
 * @author hate_
 */
public class Ejercicio32_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año, mes, dia, añoN, mesN, diaN, añosEdad, mesesEdad, diasEdad;//Declaro las variables que usaré
        Scanner entrada = new Scanner(System.in);//Inicio el scanner para pedir las fechas
        System.out.println("Introduzca el año actual: ");
        año = entrada.nextInt();
        System.out.println("Introduzca el mes actual: ");
        mes = entrada.nextInt();
        System.out.println("Introduzca el dia actual: ");
        dia = entrada.nextInt();
        
        System.out.println("Ahora, introduzca su año de nacimiento: ");
        añoN = entrada.nextInt();
        System.out.println("Introduzca su mes de nacimiento: ");
        mesN = entrada.nextInt();
        System.out.println("Por ultimo, introduzca su dia de nacimiento:");
        diaN = entrada.nextInt();
        
        añosEdad=(año-añoN);//Para obtener la edad en años, resto el año de nacimiento al año actual
        mesesEdad=(mes-mesN);//Para el mes, resto el mes de nacimiento al mes actual
        diasEdad=(dia-diaN);//Para el día, resto el de nacimiento al actual
        
        if(mesesEdad<0){//Si la edad en meses es un número negativo, le quito un año a la edad en años y le sumo 12 a los meses negativos
            añosEdad=añosEdad-1;
            mesesEdad=mesesEdad+12;
        }/*Si el mes de nacimiento es mayor al mes actual, saldrá un número negativo, 
        por tanto el año es un número mayor, y el año tiene 12 meses, por eso se los sumo al negativo de meses*/
        
        if(diasEdad<0){
            mesesEdad=mesesEdad-1;
            diasEdad=diasEdad+30;
        }/*Lo mismo pasa con los días, podemos obtener un número negativo. Si es el caso, tendremos que restarle
        un mes y pasarselo a los días, restando un mes y sumando 30 a los días que tiene el mes*/
        
        
        
        System.out.println("Su edad exacta es de "+añosEdad+" años, "+mesesEdad+" meses y "+diasEdad+" dias.");
        
        
        // TODO code application logic here
    }
    
}
