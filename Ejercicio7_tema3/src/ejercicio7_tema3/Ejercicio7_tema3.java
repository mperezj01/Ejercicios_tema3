/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7_tema3;
import java.util.Scanner;

/**
 *
 * @author hate_
 */
public class Ejercicio7_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diasemana;
        boolean laborable=true;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un día de la semana: ");
        diasemana=entrada.nextInt();
        
        switch(diasemana){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable=true;
                break;
            case 6:
            case 7:
                laborable=false;
        }
        if(laborable){
            System.out.println("Has introducido un día laborable.");
        }
        else{
            System.out.println("Has introducido un día no laborable.");
        }
        // TODO code application logic here
    }
    
}
