/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad7;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Ejercicio_basicos_DDR_30_v2 {
    public static void main(String[] args){
        String texto = JOptionPane.showInputDialog(null,
                                                   "Quieres que se pase a mayusculas?",
                                                   "Eleccion",
                                                   JOptionPane.YES_NO_OPTION);
        String cadenaResultante;
        
        //true = Lo pasamos todo a mayusculas
        //false = Lo pasamos todo a minusculas
        boolean isMayus;
        
        int eleccion = JOptionPane.showConfirmDialog(null, 
                                                     "Quieres que se pase a mayusculas?",
                                                     "Eleccion",
                                                     JOptionPane.YES_NO_OPTION);
        isMayus = (eleccion == JOptionPane.YES_OPTION);
        
        //Segun lo elegido, lo transformaremos a mayuscula o minuscula
        if(isMayus){
            cadenaResultante = texto.toUpperCase();
        }else{
            cadenaResultante = texto.toLowerCase();
        }
        
        //Mostramos el mensaje resultante
        JOptionPane.showMessageDialog(null,
                                      cadenaResultante,
                                      "Resultado",
                                      JOptionPane.INFORMATION_MESSAGE);
    }
}
