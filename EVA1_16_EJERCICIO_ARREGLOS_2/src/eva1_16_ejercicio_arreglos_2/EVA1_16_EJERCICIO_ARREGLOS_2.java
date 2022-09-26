/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_ejercicio_arreglos_2;

/**
 *
 * @author branf
 */
public class EVA1_16_EJERCICIO_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloDatos = new int[50];
        llenar(arregloDatos);
        imprimir(arregloDatos);
        System.out.println("");
        int[] arregloPares = new int[arregloDatos.length];
        int cont = 0;
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloPares[i] = arregloDatos[i];
            // imprimir pares
            if (arregloDatos[i] % 2 == 0) {
                System.out.print("[" + arregloPares[i] + "]");
                cont++;
            }
        }
        System.out.println("");
        System.out.println("Pares: " + cont);
    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
    }

}
