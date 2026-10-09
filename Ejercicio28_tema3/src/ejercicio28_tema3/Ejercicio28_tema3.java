/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28_tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio28_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double aleatorio=(int)Math.floor(Math.random()*100+1);
        System.out.println(aleatorio);
        if(aleatorio%2==0){
            System.out.println("Es un numero par.");
        }else
            System.out.println("Es un numero impar");
        
        // TODO code application logic here
    }
    
}
