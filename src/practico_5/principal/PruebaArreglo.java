/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico_5.principal;
import practico_5.entidades.Arreglos;

/**
 *
 * @author Pogliese
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        int unidimensional[] = {2,2,12,2,2};
        Arreglos.sumarLista(unidimensional);
        
        int bidimensional[][] = {{14,17,9,1},{5,8,2,3,0}};
        Arreglos.busarMayor(bidimensional);
        
        Arreglos.cuentaVocales("soy feliiiiiiiz!");
        
        Arreglos.cuentaCaracter("soy feliiiiiiiz!", 'i');
    }
    
}