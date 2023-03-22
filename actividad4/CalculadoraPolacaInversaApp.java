/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad4;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class CalculadoraPolacaInversaApp {
    public static void main(String[] args){
        
        //no importa que sean int o double
        double operando1;
        double operando2;
        double resultado=0;
        
        //No pide los operados y el signo de operacion
        String texto = JOptionPane.showInputDialog("Escribe el operando 1");
        operando1 = Integer.parseInt(texto);
        
        String operacion = JOptionPane.showInputDialog("Escribe el codigo de operacion");
        
        String texto2 = JOptionPane.showInputDialog("Escribe el operando 2");
        operando2 = Integer.parseInt(texto2);
        
        //segun el codigo de operacion, haremos una u otra accion
        switch (operacion){
            case "+":
            resultado = operando1 + operando2;
            break;
            case "-":
            resultado = operando1 - operando2;
            break;
            case "*":
            resultado = operando1 * operando2;
            break;
            case "/":
            resultado = operando1 / operando2;
            break;
            case "^":
            resultado = (int)Math.pow(operando1, operando2);
            break;
            case "%":
            resultado = operando1 % operando2;
            break;
        }
        JOptionPane.showMessageDialog(null, operando1 +" "+operacion+" "+operando2+"="+resultado);
        }
    }

