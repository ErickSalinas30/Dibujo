/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p61.u03_03.servicio;

import java.util.List;
import p61.u03_03.modelo.Viaje;

/**
 *
 * @author Mauricio Ortiz
 */
public interface ViajeService {
    
    public void crear(Viaje viaje);
    public List<Viaje> listar();
    
}
