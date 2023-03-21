/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author Acer
 */
public class CambioLetrasApp {
    public static void main(String[] args){
        String cadena = "La lluvia en Sevilla es una maravilla";
        //Aviso, de esta forma no modifica el String origianl
        System.out.print(cadena.replace('a', 'e'));
    }
}
