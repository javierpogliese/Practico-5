/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico_5.entidades;

/**
 *
 * @author Pogliese
 */
public class Arreglos {
   
    public static void sumarLista(int lista[]) {
        int suma = 0;
        double promedio = 0;
        for (int x=0; x<lista.length; x++) {
            suma = suma + lista[x];
            promedio = (double) suma/lista.length;
        }
        System.out.println("la suma de la lista es: " + suma);
        System.out.println("el promedio de la lista es: " + promedio);
    } 

    public static void busarMayor(int lista[][]) {
        int mayor = 0;
        for (int f=0; f<lista.length; f++) {
            for (int c=0; c<lista[f].length; c++) {
                if (lista[f][c] > mayor) {
                    mayor = lista[f][c];
                }
            }
        }
        System.out.println("el mayor número de la lista es: " + mayor);    
    }
    

 
    public static void cuentaCaracter(String cadena, char caracter) {
        int cantidadCaracter = 0;
        char caracteres[] = new char[cadena.length()];
        for (int x=0; x<cadena.length(); x++) {
            caracteres[x] = cadena.charAt(x);
            if (caracteres[x]==caracter) {
                cantidadCaracter++;
            }
        }
        System.out.println("la cadena ingresada tiene: " + cantidadCaracter +" caracteres iguales a: " + caracter);     
    }
    
    public static void cuentaVocales(String cadena) {
        int cantidadVocales = 0;
        char vocales[] = {'a','e','i','o','u','A','E','I','O','U','á','é','í','ó','ú','Á','É','Í','Ó','Ú'};
        char caracteres[] = new char[cadena.length()];
        for (int x=0; x<cadena.length(); x++) {
            caracteres[x] = cadena.charAt(x);
            for (int y=0; y<vocales.length; y++) {
                if (caracteres[x]==vocales[y]){
                    cantidadVocales++;
                }
            }
        }
        System.out.println("la cadena ingresada tiene: " + cantidadVocales + " vocales"); 
    }
}
