/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31_tema3;

/**
 *
 * @author hate_
 */
public class Ejercicio31_tema3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalNumeros=0, aleatorio;//Declaro las variables como int
    do{
        aleatorio=(int)Math.floor(Math.random()*100+1);//Genero un número aleatorio que vaya del 1 al 100
        if(aleatorio%2!=0){
            System.out.println(aleatorio);
            totalNumeros++;
        }
    }while(totalNumeros<3);
        // TODO code application logic here
    }
    
}
