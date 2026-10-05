/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12_tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio12_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=11;//Declaro la variable i que vale 11
        
        do{//Inicio el bucle
            if(i%2==0){//Pongo un condicional para coger los número pares, si el resto de dividir i entre 2 es 0, entonces...
            System.out.println(i);//Imprimo i en pares
            }
            i++;//Incremento el valor de i con cada bucle
        }while(i<=133);//El bucle dura hasta que i sea menor o igual que 133
        // TODO code application logic here
    }
    
}
