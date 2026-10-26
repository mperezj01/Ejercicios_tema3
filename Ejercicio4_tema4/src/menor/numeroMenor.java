/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menor;

/**
 *
 * @author alumno
 */
public class numeroMenor {
    public static void menor(int n1, int n2, int n3){//Declaro el método menor con sus variables
        if(n1<n2&&n1<n3){//Pongo la condición de si n1 es menor que n2 y que n3, se imprima n1 ya que es el menor
            System.out.println("El menor de los introducidos es "+n1);
        }else if(n2<n1&&n2<n3){//Si n2 es menor que n1 y que n3, será el menor y se imprimirá
            System.out.println("El menor de los introducidos es "+n2);
        }else{//Si no, el menor es n3, se imprimirá
            System.out.println("El menor de los introducidos es "+n3);
        }
    }
    
}
