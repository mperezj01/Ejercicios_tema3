/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16_tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio16_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=20, total=0;
        while(i<161){
            if(i%2==1){
            total++;
            System.out.println(i);
            }
            i++;
        }
        
        System.out.println("La cantidad de numero impares impreso ha sido: "+total);
        // TODO code application logic here
    }
    
}
