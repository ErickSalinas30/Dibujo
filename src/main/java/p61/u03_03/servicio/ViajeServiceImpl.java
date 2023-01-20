/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u03_03.servicio;

import java.util.ArrayList;
import java.util.List;
import p61.u03_03.modelo.Viaje;

/**
 *
 * @author Mauricio Ortiz
 */
public class ViajeServiceImpl implements ViajeService{

    private List<Viaje> viajeList;

    public ViajeServiceImpl() {
        viajeList= new ArrayList<>();
    }
    
    @Override
    public void crear(Viaje viaje) {
        this.viajeList.add(viaje);
    }

    @Override
    public List<Viaje> listar() {
        return this.viajeList;
    }
    
}
