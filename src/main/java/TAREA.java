/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carrillo
 */
public class TAREA {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            } else if (numeros[i] == 5) {
                contador = contador + 5;
            } else if (numeros[i] % 2 != 0 && numeros[i] != 5) {
                contador = contador + 3;
            }
        }
        System.out.println("la suma es " + contador);

    }
    
    
}
