package ejercicio2_tema4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Operaciones {//Declaro una nueva clase llamada Operaciones para el producto y la suma
    public static void producto(int n1, int n2){//Declaro un nuevo método para realizar el producto y sus variables
        int producto;
            producto=n1*n2;//Realizo la operación del producto
            System.out.println("El producto es "+producto);//Imprimo por pantalla el resultado
        
    }
    public static void suma(int n1, int n2){//Declaro otro nuevo método para realizar la suma si corresponde, con sus respectivas variables
        int suma;
            suma=n1+n2;//Realizo la operación para la suma
            System.out.println("La suma es "+suma);//Imprimo los resultados
        
    }
}
