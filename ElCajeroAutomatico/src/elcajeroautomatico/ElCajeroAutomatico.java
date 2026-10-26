/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elcajeroautomatico;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ElCajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldo = 1000.00, cantidad=0;//Declaro las variables double para las cantidades del cajero
        int seleccion=0, numIngresos=0, numRetiradas=0;//Declaro la variable seleccion para las opciones del cajero
        Scanner entrada = new Scanner(System.in);//Inicio el Scanner para leer la entrada del usuario
        
        do{//Inicio el bucle para que el menu siga saliendo hasta que el usuario decida salir
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");//Imprimo todas las opciones que tiene el usuario en el cajero
            try{//Meto un try por si el usuario introduce una letra en un campo numérico
                seleccion = entrada.nextInt();//La variable seleccion guardará la decision introducida por el usuario
                switch(seleccion){//Inicio un switch para los case del menú principal
                    case 1:{
                        System.out.println("Saldo "+saldo);
                        System.out.println("Ingresos "+numIngresos);
                        System.out.println("Retiradas "+numRetiradas);
                        break;    
                    }
                    case 2:{
                        System.out.println("Introduzca la cantidad que quiere ingresar:");
                        cantidad = entrada.nextDouble();
                        while(cantidad<0){
                            System.out.println("Cantidad incorrecta, introduzca una cantidad valida:");   
                        }
                        if(cantidad>0){
                            saldo=saldo+cantidad;
                            ++numIngresos;
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Introduzca la cantidad que desea retirar:");
                        while(cantidad<=0){
                            cantidad=entrada.nextDouble();
                            System.out.println("Cantidad incorrecta, introduzca una cantidad valida:");
                        }
                        if(cantidad>0){
                            saldo=saldo-cantidad;
                            ++numRetiradas;
                        }
                        break;
                    }
                    case 4:{
                        System.out.println("Cerrando su sesion.");
                    }
                }
                }catch(InputMismatchException e){
                    System.out.println("¡Error! Debe ingresar un numero.");
                    entrada.nextInt();
                
                }
                
        }while(seleccion!=4);
           
        // TODO code application logic here
    }
    
}
