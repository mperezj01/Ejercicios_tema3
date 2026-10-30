/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20_tema4;
import java.util.Scanner;//Importo el Scanner del paquete java.util

/**
 *
 * @author hate_
 */
public class Ejercicio20_tema4 {
    public static final String CAPITAL = "Madrid";
    public static final String DESCUBRIDOR = "Colón";
    //Declaro las constantes, respuestas del examen

    /**
     * @param args the command line arguments
     */
    public static String pedirCapital(){//Inicio un método para pedir la respuesta a la primera pregunta
        String respuesta1;
    Scanner entrada = new Scanner(System.in);
        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.println("1a PREGUNTA: Cual es la capital de España?");
        respuesta1 = entrada.nextLine();
        return respuesta1;//Devuelvo la respuesta al main
}
    public static String pedirDescubrimiento(){//Inicio otro método para la segunda pregunta
        String respuesta2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("2a PREGUNTA: Quien descubrio America?");
        respuesta2 = entrada.nextLine();
        return respuesta2;//Devuelvo la respuesta al main
    }
    public static int comprobarResultadoCapital(String capital, int nota){//Otro método para comprobar el resultado de la primera
        if(capital.equals(CAPITAL)){//Si la capital introducida por el usuario es igual a la constante
            System.out.println("Muy bien, respuesta correcta");
            nota=nota+5;//Sumo 5 a la nota
        }else{
            System.out.println("No es correcto. La respuesta es "+CAPITAL);
        }
        return nota;//Devuelvo la nota
    }
    public static int comprobarResultadoDescubrimiento(String descubrimiento, int nota){//Otro método para el resltado de la segunda
        
        if(descubrimiento.equals(DESCUBRIDOR)){
            System.out.println("Muy bien, respuesta correcta");
            nota=nota+5;
        }else{
            System.out.println("No es correcto. La respuesta es "+DESCUBRIDOR);
        }
        return nota;
    }
    public static void mostrarResultadoExamen(int nota){//Un último método para imprimir el resultado del examen
        System.out.println("NOTA DEL EXAMEN: "+nota);
    }
    
    public static void main(String[] args) {
        int nota = 0;//Declaro la variable entera nota, asignandole 0 para empezar
        String respuestaCapital = pedirCapital();/*Asigno a la variable respuestaCapital a lo que me 
        devuelve el método pedirCapital*/
        nota=comprobarResultadoCapital(respuestaCapital, nota);/*Le envío la respuesta al método 
        respuestaCapital junto a la variable nota y almaceno el resultado en la variable nota*/
        String respuestaDescubrimiento = pedirDescubrimiento();
        nota=comprobarResultadoDescubrimiento(respuestaDescubrimiento, nota);
        mostrarResultadoExamen(nota);
        
        
        
        
        // TODO code application logic here
    }
    
}
