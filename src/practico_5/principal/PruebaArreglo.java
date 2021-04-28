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
        
        int unidimensional[] = {2,4,12,82,26};
        Arreglos.sumarLista(unidimensional);
        
        int bidimensional[][] = {{-14,-17,-9,-14},{-5,-8,-2,-3,-60}};
        Arreglos.buscarMayor(bidimensional);
        
        Arreglos.cuentaVocales("Lorem Ipsum dolor sit amet consectetur adipiscing elit placerát");
        
        Arreglos.cuentaCaracter("Lorem ipsum dolor sit amet consectetur adipiscing elit placerát", 'i');
        
    }
    
}
