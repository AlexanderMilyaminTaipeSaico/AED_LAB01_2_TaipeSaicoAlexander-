/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author Acer
 */
public class Principal {
    public static void main(String[] args){
        String cadena = "La lluvia en Sevilla es una maravilla";
        
        int contador = 0;
        for (int i = 0; i<cadena.length(); i++){
            //Comprobamos si el caracter es una vocal
            if(cadena.charAt(i)=='a'||
                    cadena.charAt(i)=='e'||
                    cadena.charAt(i)=='i'||
                    cadena.charAt(i)=='o'||
                    cadena.charAt(i)=='u'){
            contador++;
        }     
        }
        System.out.println("Hay "+contador+" vocales");
    }
}
