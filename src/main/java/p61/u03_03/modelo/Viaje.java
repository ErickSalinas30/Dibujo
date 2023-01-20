/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u03_03.modelo;

import java.time.LocalDate;

/**
 *
 * @author Mauricio Ortiz
 */
public class Viaje {
    
    private int codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;

    public Viaje(int codigo, String origen, String destino, LocalDate fecha) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Viaje{" + "codigo=" + codigo + ", origen=" + origen 
                + ", destino=" + destino 
                + ", fecha=" + fecha.toString() + '}';
    }
    
    
}
