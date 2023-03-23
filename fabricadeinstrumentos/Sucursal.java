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
public class Sucursal {
    private ArrayList<Instrumento> instrumentos;
    private String nombre; 

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }
    
    public void agregarInstrumento(Instrumento ins){
        this.instrumentos.add(ins);
    }

    public String getNombre() {
        return nombre;
    }
    
    public void listarInstrumentos(){
        for(Instrumento instrumento : instrumentos){
            System.out.println(instrumento);
        }
    }
    
    public ArrayList<Instrumento> instrumentosPorTipo (TipoInstrumento tipo){
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        for (Instrumento instrumento : instrumentos){
            if (instrumento.getTipo() == tipo){
                instEncontrados.add(instrumento);
            }
        }
        return instEncontrados;
    }
}
