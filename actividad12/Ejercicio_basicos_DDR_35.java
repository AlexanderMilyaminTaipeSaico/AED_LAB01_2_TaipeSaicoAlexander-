/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad12;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Ejercicio_basicos_DDR_35 {
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        System.out.println("Escribre un dia de la semana");
        String dia = sn.next();
        
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
        
        switch(diaS){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia "+diaS.name().toLowerCase()+" es laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El dia "+diaS+" no es laborable");
                break;
        }
    }
}
