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
    public static void ponderacion(int nota){//Declaro un nuevo método ponderacion con su variable nota
        if(nota>=0&&nota<5){//Si la nota es mayor o igual a 0 y menor a 5, imprimiré suspenso
            System.out.println("Suspenso");
        }else if(nota>=5&&nota<=6){//Si es mayor o igual a 5 y menor o igual a 6, imprimo bien
            System.out.println("Bien");
        }else if (nota>=7&&nota<=8){//Si es mayor o igual a 7 y menor o igual a 8, imprimo notable
            System.out.println("Notable");
        }else if (nota>=9&&nota<=10){//Si es mayor o igual a 9 y menor o igual a 10, imprimo sobresaliente
            System.out.println("Sobresaliente");
        }else if (nota<0||nota>10){//Si el valor es menor a 0 o mayor a 10, la nota no es correcta
            System.out.println("Valor introducido incorrecto");
        }
    }
    
}
