/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_22_fibonacci;

/**
 *
 * @author moviles
 */
public class EVA1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int serie = 5;
        for (int i = 0; i <= serie; i++) {
            System.out.println(fibonacci(i));
        }
    }
    
    public static int fibonacci(int n) {
        //CASO BASE, si es cero devuelve un 1
        if (n == 0) {
            return 1;
            //CASO BASE, si es 1 devuelve un 1    
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
}
