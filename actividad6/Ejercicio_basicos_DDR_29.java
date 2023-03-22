/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad6;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Ejercicio_basicos_DDR_29 {
    public static void main(String[] args){
        String texto = JOptionPane.showInputDialog(null,
                                                   "Introduce un texto, cadena vacia para terminar",
                                                   "Introducir texto",
                                                   JOptionPane.INFORMATION_MESSAGE);
        String cadenaResultante = "";
        
        //Mientras no este vacio la cadena escrita continuo
        while(!texto.isEmpty()){
            
            //Concatenamos el texto
            cadenaResultante+=texto;
            
            //Reintroducimos de nuevo una cadena
            texto = JOptionPane.showInputDialog(null,
                                                "Introduce un texto, cadena vacia para termianar",
                                                "Introducir texto",
                                                JOptionPane.INFORMATION_MESSAGE);
              
        }
        JOptionPane.showInputDialog(null,
                                    cadenaResultante,
                                    "Resultado",
                                    JOptionPane.INFORMATION_MESSAGE);
    }
}
