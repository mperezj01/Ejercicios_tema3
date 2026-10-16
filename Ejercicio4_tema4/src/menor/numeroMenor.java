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
    public static void menor(int n1, int n2, int n3){
        if(n1<n2&&n1<n3){
            System.out.println("El menor de los introducidos es "+n1);
        }else if(n2<n1&&n2<n3){
            System.out.println("El menor de los introducidos es "+n2);
        }else{
            System.out.println("El menor de los introducidos es "+n3);
        }
    }
    
}
