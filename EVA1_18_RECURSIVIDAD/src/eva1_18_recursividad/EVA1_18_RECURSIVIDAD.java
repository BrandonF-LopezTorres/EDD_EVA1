/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_recursividad;

/**
 *
 * @author moviles
 */
public class EVA1_18_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        falsoForDes(5);
        falsoForAsc(5,1);
    }
    
    /*FALSO FOR*/
    //IMPRIMIR UNA LISTA DE NÚMEROS DE MAYOR A MENOR (DE MANERA RECURSIVA)
    // recibo un valor falsoForDes(5) --> "5 - 4 - 3 - 2 - 1"
    public static void falsoForDes(int valor){
        //que voy a hacer "imprimir valor"
        //llamada recursiva "falsoForDes(valor - 1)
        //detener la llamada recursiva "cuando valor = 1"
        /*Si es 1 me detengo, si no, llamada recursiva*/
        /*if(valor > 0) {
            System.out.print(valor + " - ");
            valor--;
            falsoForDes(valor);
        }*/
        if(valor == 1)
            System.out.print(valor + "-");
        else{
            System.out.print(valor + "-");
            falsoForDes(valor - 1);
        }
    }
    //falsoForAsc(5,1) --> 1-2-3-4-5
    public static void falsoForAsc(int valor, int ini){
        if(ini <= valor){
            System.out.print(ini + "-");
            falsoForAsc(valor, ini + 1);
        }
    }
}
