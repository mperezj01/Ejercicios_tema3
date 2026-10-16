/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculo;

/**
 *
 * @author alumno
 */
public class notas {
    public static void ponderacion(int nota){
        if(nota>=0&&nota<5){
            System.out.println("Suspenso");
        }else if(nota>=5&&nota<=6){
            System.out.println("Bien");
        }else if (nota>=7&&nota<=8){
            System.out.println("Notable");
        }else if (nota>=9&&nota<=10){
            System.out.println("Sobresaliente");
        }else if (nota<0||nota>10){
            System.out.println("Valor introducido incorrecto");
        }
    }
    
}
