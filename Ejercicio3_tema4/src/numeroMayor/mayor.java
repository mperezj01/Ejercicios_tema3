/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeroMayor;

/**
 *
 * @author alumno
 */
public class Mayor {
    public static void numeroMayor(int n1, int n2, int n3){//Creo el método numeroMayor para determinar cuál es el mayor de los valores
        if(n1>n2&&n1>n3){//Pongo el condicional, si n1 es mayor que n2 y que n3, imprimiré n1 (Que es num1)
            System.out.println("El mayor de los introducidos es "+n1);
        }else if(n2>n1&&n2>n3){//Si n2 es mayor que n1 y que n3, imprimo n2 (num2)
            System.out.println("El mayor de los introducidos es "+n2);
        }else{//Si no, el mayor será n3, y lo imprimo (num3)
            System.out.println("El mayor de los introducidos es "+n3);
        }
    }
    
}
