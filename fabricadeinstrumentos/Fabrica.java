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
public class Fabrica {
    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }
    
    public Instrumento borrarInstrumento(String ID){
        Instrumento borrado = null;
        int i = 0;
        while(i < sucursales.size() && borrado == null){
            borrado = sucursales.get(i).borrarInstrumento(ID);
            i++;
        }
        return borrado;
    }
    
    public void listarInstrumentos(){
        for(Sucursal sucursal : sucursales){
            System.out.println(sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
    }
    
    public ArrayList<Instrumento> instrumentosPorTipo (TipoInstrumento tipo){
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        for (Sucursal sucursal : sucursales){
            instEncontrados.addAll(sucursal.instrumentosPorTipo(tipo)); 
        }
        return instEncontrados;
    }
    
    public void agregarSucursal(Sucursal suc){
        this.sucursales.add(suc);
    }
    
}