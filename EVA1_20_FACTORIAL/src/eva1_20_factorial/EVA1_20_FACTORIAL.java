/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_factorial;

/**
 *
 * @author moviles
 */
public class EVA1_20_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    
    public static int factorial(int valor) {
        //factorial(0) --> 1
        if (valor==0)
            return 1;
        else
            return valor * factorial(valor-1);
    }
    
}
