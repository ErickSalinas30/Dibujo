/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u03_02.modelo;

import java.time.LocalDate;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Jugador {
    
    private int codigo;
    private String nombre;
    private double peso;
    private int estatura;
    private LocalDate fechaNacimiento;

    public Jugador(int codigo, String nombre, double peso, int estatura, LocalDate fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    private int calcularEdad(){
        var yearActual= LocalDate.now().getYear();
        return yearActual-this.fechaNacimiento.getYear();
    }

    @Override
    public String toString() {
        return "Jugador{" + "codigo=" + codigo + ", nombre=" + nombre 
                + ", peso=" + peso + ", estatura=" + estatura 
                + ", fechaNacimiento=" + fechaNacimiento + '}'
                + " tiene: "+this.calcularEdad()+" años";
    }

    
    
    
    
}
