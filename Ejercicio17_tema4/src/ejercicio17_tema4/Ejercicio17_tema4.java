/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17_tema4;
import java.util.Scanner;//Importo el Scanner del paquete java.util

/**
 *
 * @author alumno
 */
public class Ejercicio17_tema4 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirLetra(){//Declaro un método para pedir una letra al usuario
        char inputLetra;//Declaro la variable letra como char
        int inputAscii;//Declaro la variable entera inputAscii que usaré para devolver un número al main
        Scanner entrada = new Scanner(System.in);
        System.out.println("Intente adivinar la letra introduciendo una letra: ");
        inputLetra = entrada.nextLine().charAt(0);
        inputAscii = (int)inputLetra;//Paso la letra introducida por el usuario a su número en el código ASCII
        return inputAscii;//Devuelvo la variable como número al main
    }
    public static int generarLetraAleatoria(){//Declaro un nuevo método para generar la letra aleatoria
        int aleatorio = (int)(Math.random()*26)+97;/*Genero la letra aleatoria entre 97 y 122, diciendo que genere desde 97
        hasta 122. Para ello resto 122-97, lo que me da 25, pero incluyo el 122 por lo que inicio en 26*/
        char letraAleatoria = (char)aleatorio;//paso el numero aleatorio a char y lo guardo en la variable letraAleatoria
        return letraAleatoria;//Devuelvo la letra aleatoria al main
    }
    public static boolean comprobarLetra(int letra, int letraAleatoria){//Declaro otro método para comprobar si coinciden
        boolean acierto = false;
        if(letra==letraAleatoria){//Si coinciden, el booleano acierto será true
            acierto=true;
        }
        
        return acierto;
    }
    public static void darPista(int letra, int letraAleatoria){//Declaro el método para dar las pistas al usuario
        if(letra<letraAleatoria){
            System.out.println("La letra a adivinar viene después de la introducida");
        }else if(letra>letraAleatoria){
            System.out.println("La letra a adivinar viene antes de la introducida");
        }
    }
    public static void imprimirAcierto(int intentos){//Declaro el método que imprime el acierto y los intentos realizados
        System.out.println("Enhorabuena, has acertado la letra");
        System.out.println("Intentos: "+intentos);
    }
    public static void main(String[] args) {
        int intentos = 0, letra;
        boolean acierto;
        int letraAleatoria = generarLetraAleatoria();//Declaro las variables
        do{//Inicio el bucle del juego
            letra = pedirLetra();//Llamo al método de pedir el número
            intentos++;//Sumo un intento
            acierto = comprobarLetra(letra, letraAleatoria);//Compruebo si ha acertado
            if(!acierto){//si no ha acertado, llamo al método darPista
                darPista(letra, letraAleatoria);
            }
        }while(!acierto);//El bucle se ejecuta mientras acierto sea false
        if(acierto){//Si acierto es true, llamo al metodo imprimirAcierto
            imprimirAcierto(intentos);
        }
           
        // TODO code application logic here
    }
    
}
