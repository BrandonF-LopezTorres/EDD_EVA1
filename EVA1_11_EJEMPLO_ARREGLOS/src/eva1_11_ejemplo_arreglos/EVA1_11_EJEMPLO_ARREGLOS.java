/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author moviles
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Pedir nùmero de grupos
           Pedir nùmero de estudiantes por grupo
           Capturar calificaciones
           Imprimir calificaciones*/
        int arregloCalificaciones[][];
        // primer dimensiòn --> grupos
        // segunda dimensiòn --> estudiantes por grupo
        // DETERMINAR LOS GRUPOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nùmero de grupos: ");
        int iGrupos = sc.nextInt();
        arregloCalificaciones = new int[iGrupos][];
        
        //PARA CADA GRUPO: CUÀNTOS ESTUDIANTES NECESITAS?
        for (int i = 0; i < arregloCalificaciones.length; i++) {
            System.out.println("Cuàntos estudiantes hay en el grupo " + (i + 1));
            int iEstudiantes = sc.nextInt();
            arregloCalificaciones[i] = new int[iEstudiantes];
            System.out.println(arregloCalificaciones[i].length);
        }
    }
    
}
