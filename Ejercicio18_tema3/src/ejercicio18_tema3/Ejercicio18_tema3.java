/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18_tema3;
import java.util.Scanner;//Importo el Scanner del paquete java.util

/**
 *
 * @author alumno
 */
public class Ejercicio18_tema3 {
    final static int CONTRASEÑA = 1234;//Declaro la constante CONTRASEÑA como final en el public class

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean usuario=false;//Declaro la variable usuario como boolean y false, cuando sea true podremos acceder al usuario
        int codigo, intentos=0;//declaro las variables codigo e intentos como int, partiendo de que los intentos son 0 al inicio
        Scanner entrada = new Scanner(System.in);//Inicio el scanner
        
        do{//Iniciamos el bucle
            System.out.println("Por favor, introduzca su contraseña:");
            codigo=entrada.nextInt();//La entrada es el codigo, tiene que ser igual que la contraseña
            if(codigo==CONTRASEÑA){//Si el codigo introducido es igual a la constante CONTRASEÑA, entonces...
                System.out.println("Enhorabuena, contraseña correcta");//Se imprime la enhorabuena
                usuario=true;//usuario pasa a ser true
            }else{//Si codigo no es igual a CONTRASEÑA
                intentos++;//Incrementamos intentos
                System.out.println("Contraseña incorrecta");//E imprimimos
            }
            if(intentos==3){//Si intentos es igual a 3, imprimimos error de acceso
                System.out.println("Error de acceso");
            }
        }while(usuario==false && intentos<3);//El bucle dura mientras usuario sea false y los intentos sean inferiores a 3
        
        // TODO code application logic here
    }
    
}
