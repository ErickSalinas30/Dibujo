/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u03_03.controlador;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import p61.u03_03.modelo.Viaje;
import p61.u03_03.servicio.ViajeServiceImpl;

/**
 *
 * @author Mauricio Ortiz
 */
public class ViajeControl {
    
    private ViajeServiceImpl viajeServiceImpl;    

    public ViajeControl() {
        
        viajeServiceImpl= new ViajeServiceImpl();
    }
    
    public void crear(String [] data){
        var codigo=Integer.valueOf(data[0]);
        var origen=data[1];
        var destino=data[2];
        var year=Integer.valueOf(data[3]);
        var month=Integer.valueOf(data[4]);
        var day=Integer.valueOf(data[5]);
        var fecha = LocalDate.of(year,month, day);
        
        var viaje= new Viaje(codigo,origen,destino,fecha);
        this.viajeServiceImpl.crear(viaje);
    }
    
    public List<Viaje> listar(){
        return this.viajeServiceImpl.listar();
    }
    
}
