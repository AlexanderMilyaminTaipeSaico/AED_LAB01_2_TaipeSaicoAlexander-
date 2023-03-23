/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricadeinstrumentos;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Principal {
    public static void main(String[] args){
        
        Fabrica f = new Fabrica();
        cargarFabrica(f);
        
        //f.listarInstrumentos();
        ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.CUERDA);
        for (Instrumento instrumento : lista){
            System.out.println(instrumento);     
        }
    }
    private static void cargarFabrica(Fabrica f){
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");
        
        s1.agregarInstrumento(new Instrumento("ABV123", 13214, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("BCS456", 13432, TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("DEF567", 15464, TipoInstrumento.PERCUSION));
        
        s2.agregarInstrumento(new Instrumento("ASD353", 52432, TipoInstrumento.CUERDA));
        s2.agregarInstrumento(new Instrumento("VXCBE2", 45645, TipoInstrumento.VIENTO));
        
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
    }
}
