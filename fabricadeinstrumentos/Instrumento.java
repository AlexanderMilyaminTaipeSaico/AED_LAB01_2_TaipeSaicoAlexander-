/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricadeinstrumentos;

/**
 *
 * @author Acer
 */
public class Instrumento {
    private String ID;
    private double precios;
    private TipoInstrumento tipo;

    public Instrumento(String ID, double precion, TipoInstrumento tipo) {
        this.ID = ID;
        this.precios = precion;
        this.tipo = tipo;
    }

    public TipoInstrumento getTipo() {
        return tipo;
    }

    public String getID() {
        return ID;
    }
    

    @Override
    public String toString() {
        return "Instrumento{" + "ID=" + ID + ", precion=" + precios + ", tipo=" + tipo + '}';
    }
    
}
