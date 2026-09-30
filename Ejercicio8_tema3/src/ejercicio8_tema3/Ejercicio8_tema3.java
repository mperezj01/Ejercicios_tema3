/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8_tema3;
import java.util.Scanner;//Importamos el scanner del paquete java util

/**
 *
 * @author hate_
 */
public class Ejercicio8_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dineroTotal, b50, b20, b10, b5, m2, m1;//Declaro las variables enteras
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, indique una cantidad de dinero: ");
        dineroTotal = entrada.nextInt();//Asigno la entrada por consola a la variable dinero total
        
        b50=dineroTotal/50;//Saco la cantidad de billetes de 50
        if(b50>0){//Si tengo mas de 0 billetes de 50, entonces imprimo
            System.out.println("Billeter de 50: "+b50);
        }
        dineroTotal%=50;
        b20=dineroTotal/20;
        if(b20>0){//Si tengo mas de 0 billetes de 20 entonces imprimo
            System.out.println("Billeter de 20: "+b20);
        }
        dineroTotal%=20;
        b10=dineroTotal/10;
        if(b10>0){//Si tengo billetes de 10, imprimo
            System.out.println("Billetes de 10: "+b10);
        }
        dineroTotal%=10;
        b5=dineroTotal/5;
        if(b5>0){
            System.out.println("Billetes de 5: "+b5);
        }
        dineroTotal%=5;
        m2=dineroTotal/2;
        if(m2>0){
            System.out.println("Monedas de 2 euros: "+m2);
        }
        dineroTotal%=2;
        m1=dineroTotal;
        if(m1>0){
            System.out.println("Monedas de 1 euro: "+m1);
        }
        
        
        // TODO code application logic here
    }
    
}
