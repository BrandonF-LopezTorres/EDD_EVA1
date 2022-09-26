/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_ejercicio_arreglos_3;

/**
 *
 * @author moviles
 */
public class EVA1_17_EJERCICIO_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizDatos = new int[5][5];
        int[][] matrizCopia = new int [5][5];
        int cont = matrizDatos.length - 1;
        for (int i = 0; i < matrizDatos.length; i++) {
            for (int j = 0; j < matrizDatos[i].length; j++) {
                matrizDatos[i][j] = ((int)(Math.random() * 100)) + 1;
            }
        }
        for (int i = 0; i < matrizDatos.length; i++) {
            for (int j = 0; j < matrizDatos[i].length; j++) {
                matrizCopia[i][j] = matrizDatos[cont][cont];
                cont--;
            }
        }
           
        imprimirMatriz(matrizDatos);
        imprimirMatriz(matrizCopia);
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
