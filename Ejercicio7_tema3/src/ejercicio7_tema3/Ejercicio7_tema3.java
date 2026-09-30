/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7_tema3;
import java.util.Scanner;//Importo el paquete de scanner de java util

/**
 *
 * @author hate_
 */
public class Ejercicio7_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diasemana;//Declaro la variable entera diasemana
        boolean laborable=true;//Declaro el booleano laborable como true
        
        Scanner entrada = new Scanner(System.in);//Inicio el scanner de entrada
        System.out.println("Por favor, introduzca un día de la semana en número (1-7): ");
        diasemana=entrada.nextInt();//Declaro la entrada como el valor de diasemana
        
        switch(diasemana){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable=true;//Si el valor de diasemana es alguno de los case anteriores, laborable es true
                break;
            case 6:
            case 7:
                laborable=false;//Si diasemana es alguno de estos últimos case, laborable es false
        }
        if(laborable){//Si laborable es true, imprimo que es laborable
            System.out.println("Has introducido un día laborable.");
        }
        else{//si no es true, imprimo no laborable
            System.out.println("Has introducido un día no laborable.");
        }
        // TODO code application logic here
    }
    
}
