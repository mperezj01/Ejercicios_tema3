/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeroMayor;

/**
 *
 * @author alumno
 */
public class mayor {
    public static void numeroMayor(int n1, int n2, int n3){
        if(n1>n2&&n1>n3){
            System.out.println("El mayor de los introducidos es "+n1);
        }else if(n2>n1&&n2>n3){
            System.out.println("El mayor de los introducidos es "+n2);
        }else{
            System.out.println("El mayor de los introducidos es "+n3);
        }
    }
    
}
