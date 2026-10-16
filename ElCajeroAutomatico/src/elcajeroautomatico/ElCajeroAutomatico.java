/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elcajeroautomatico;
import java.util.Scanner;
import java.util.InputMismatchException

/**
 *
 * @author alumno
 */
public class ElCajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldo = 1000.00, cantidad;
        int seleccion;
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            try{
                seleccion = entrada.nextInt();
                switch(seleccion){
                    case 1:{
                        System.out.println(saldo);
                        break;    
                    }
                    case 2:{
                        System.out.println("Introduzca la cantidad que quiere ingresar:");
                        while(cantidad<0){
                        cantidad = entrada.nextDouble();
                            System.out.println("Cantidad incorrecta, introduzca una cantidad valida:");   
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Introduzca la cantidad que desea retirar:");
                        while(cantidad<=0){
                            cantidad=entrada.nextDouble();
                            System.out.println("Cantidad incorrecta, introduzca una cantidad valida:");
                        }
                        break;
                    }
                    case 4:{
                        System.out.println("Cerrando su sesion.");
                    }
                }catch(InputMissmatchException e){
                System.out.println("¡Error! Debe ingresar un numero.");
                        entrada.nextInt();
                
                
                
        }while(seleccion!=4);
            }}}}
        // TODO code application logic here
    }
    
}
