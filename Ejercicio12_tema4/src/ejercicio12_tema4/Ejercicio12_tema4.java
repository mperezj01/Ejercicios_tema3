/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12_tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12_tema4 {
    public static final int PASSWORD = 1234;
    public static int intentos = 0;

    /**
     * @param args the command line arguments
     */
    
    public static int pedirContraseña(){
        int password;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca su contraseña");
        password = entrada.nextInt();
        return password;
    }
    public static boolean comprobacionContraseña(int password){
        boolean correcto=false;
        
            if(password==PASSWORD){
                correcto=true;
            }else if(password!=PASSWORD){
                correcto=false;
            }
            intentos++;
        
        return correcto;
    }
    public static void imprimirAcceso(boolean correcto){
        if(correcto){
            System.out.println("Contraseña correcta. Accediendo al sistema.");
        }else if(!correcto&&intentos<3){
            System.out.println("Contraseña incorrecta, vuelva a intentarlo.");
        }else if(intentos==3){
            System.out.println("Error. Acceso bloqueado");
        }
    }
    public static void main(String[] args) {
        int password;
        boolean correcto=false;
        do{
            password = pedirContraseña();;
            correcto = comprobacionContraseña(password);
            imprimirAcceso(correcto);
        }while(intentos<3&&!correcto);
        
        // TODO code application logic here
    }
    
}
