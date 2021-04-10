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
        for (int x=0; x<lista.length; x++) {
            suma = suma + lista[x];
        }
        System.out.println(suma);
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
        System.out.println(mayor);    
    }
    
    public static void cuentaVocales(String cadena) {
        int cantidadVocales = 0;
        char caracteres[] = new char[cadena.length()];
        for (int x=0; x<cadena.length(); x++) {
            caracteres[x] = cadena.charAt(x);
            if (caracteres[x]=='a' || caracteres[x]=='e' ||caracteres[x]=='i' || caracteres[x]=='o' ||caracteres[x]=='u') {
                cantidadVocales++;
            }
        }
        System.out.println(cantidadVocales); 
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
        System.out.println(cantidadCaracter);     
    }
    
}
