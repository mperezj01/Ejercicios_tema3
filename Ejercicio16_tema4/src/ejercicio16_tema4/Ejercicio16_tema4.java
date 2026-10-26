/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16_tema4;

/**
 *
 * @author alumno
 */
public class Ejercicio16_tema4 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void calcularRaiz(){
        double raiz = Math.sqrt(64);
        System.out.println("La raiz cuadrada de 64 es "+raiz);
    }
    public static void calcularCubo(){
        double cubo = Math.pow(8, 3);
        System.out.println("El cubo de 8 es "+cubo);
    }
    public static void calcularExponencial(){
        double exponencial = Math.exp(2);
        System.out.println("El exponencial de 2 es "+exponencial);
    }
    public static void calcularLogaritmo(){
        double logaritmo = Math.log(2.71828);
        System.out.println("El logaritmo de 2.71828 es "+logaritmo);
    }
    public static void mostrarMenor(){
        int menor = Math.min(2, 3);
        System.out.println("El numero menor entre 2 y 3 es "+menor);
    }
    public static void calcularValorAbsoluto(){
        double valAbsoluto = Math.abs(-4.5);
        System.out.println("El valor absoluto de -4.7 es "+valAbsoluto);
    }
    public static void calcularRedondeo(){
        double redondeo = Math.round(-4.5);
        System.out.println("El redondeo de -4.5 es "+redondeo);
    }
    public static void calcularSeno(){
        double seno = Math.sin(45);
        System.out.println("El seno de 45 grados es "+seno);
    }
    public static void main(String[] args) {
        calcularRaiz();
        calcularCubo();
        calcularExponencial();
        calcularLogaritmo();
        mostrarMenor();
        calcularValorAbsoluto();
        calcularRedondeo();
        calcularSeno();
        
        // TODO code application logic here
    }
    
}
