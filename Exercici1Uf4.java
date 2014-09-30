/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercici1.uf4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Exercici1Uf4 {

    /**
     * EJERCICIO 01
        Descripción del problema:
        Escribe una aplicación modular en Java que solicite por consola al usuario el número 
        de elementos que tendrá un array unidimensional de enteros. El contenido del array 
        será calculado aleatoriamente por el programa siendo posibles valores enteros de 0 a 
        100. 
            A continuación el programa deberá ejecutar las siguientes acciones:
            a. Solicitar al usuario una posición y un valor. Insertar en el vector en la 
                posición dada el valor dado. Mostrar por consola el contenido del array.
            b. Calcular y mostrar el valor más alto y el valor más bajo del array
            c. Calcular la media de todos los valores y mostrar los valores del array que se 
                encuentran por encima de esta media
        Antes de comenzar a programar, define el pseudocode o flowchart de la aplicación.
        Requisitos no funcionales de la aplicación:
         El programa sólo puede contener una Clase.
         El programa debe ser modular
         Cada módulo del programa debe disponer de una breve descripción funcional 
            del mismo
         El programa debe respetar The Clean Coding Practices
     */
        public static void main(String[] args) {
        int[] numeros;
        System.out.println("Para crear el Array es necesario que inserte una lonjitud ");

        numeros = new int[comproba()];
        inserArray(numeros);
        while (true) {
            System.out.println("inserte una posicion del array a ser modificada,si quiere salir inserte f");
        int num;  
        num=comproba();
        if(num==-1){
        break;
        }else{
        numeros[num]=comproba();
        }
        
          
        }

    }

    public static int comproba() {
        int num = 0;
        try {
            String aux = "";
            aux = getUser();

            num = Integer.parseInt(aux);

            if (num > 0) {
                return num;
            } else {

                System.err.println("Inserte un NUMERICO ENTERO POSITIBO");

                comproba();
            }

        } catch (NumberFormatException nfe) {
            System.err.println("Inserte un NUMERICO ENTERO POSITIBO");
            comproba();
        }

        return -1;

    }

    private static int[] inserArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numRandom();
        }
        return nums;
    }

    private static String getUser() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static int numRandom() {

        return (int) (Math.random() * 100);
    }

}
