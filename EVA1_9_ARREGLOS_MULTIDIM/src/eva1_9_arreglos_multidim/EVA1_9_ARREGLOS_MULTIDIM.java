/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_arreglos_multidim;

/**
 *
 * @author moviles
 */
public class EVA1_9_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizDatos = new int[3][5];
        System.out.println("FILAS: " + matrizDatos.length);
        for (int i = 0; i < matrizDatos.length; i++) { // PRIMER DIMENSION (3 FILAS)
            System.out.println("COLUMNAS: " + matrizDatos[i].length);
            for (int j = 0; j < matrizDatos.length; j++) { // SEGUNDA DIMENSION (5 COLUMNAS)
                matrizDatos[i][j] = 100;
            }
        }
        
        for(int i = 0; i < matrizDatos.length; i++) { // PRIMER DIMENSION (3 FILAS)
            for(int j = 0; j < matrizDatos.length; j++) { // SEGUNDA DIMENSION (5 COLUMNAS)
                System.out.println("[" + matrizDatos[i][j] + "]");
            }
        }
    }
    
}
