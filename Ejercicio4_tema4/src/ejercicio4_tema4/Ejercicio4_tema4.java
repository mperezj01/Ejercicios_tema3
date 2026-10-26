/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4_tema4;
import java.util.Scanner;//Importo el Scanner del paquete java.util
import menor.numeroMenor;//Importo numeroMenor del paquete menor 


/**
 *
 * @author alumno
 */
public class Ejercicio4_tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;//Declaro las variables como int
        Scanner entrada = new Scanner(System.in);//Inicio el Scanner
        System.out.println("Por favor, introduzca el primer numero:");
        num1 = entrada.nextInt();//Asigno la entrada del Scanner a las variables
        System.out.println("Ahora, introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca el tercer numero:");
        num3 = entrada.nextInt();
        
        numeroMenor.menor(num1, num2, num3);//Llamo al método menor de la clase numeroMenor y le mando las variables
        // TODO code application logic here
    }
    
}
