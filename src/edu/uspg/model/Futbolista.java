/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.model;

/**
 *
 * @author morozco
 */
public class Futbolista extends IntegrantesSeleccion {
    
    private Integer dorsal;
    private String demarcacion;
    
    public Futbolista(){
        super();
    }
    
    public Futbolista(Integer id, String nombres, 
                        String apellidos, Integer edad, 
                        Integer dorsal, String demarcacion){
        super(id,nombres,apellidos,edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
        
    }
    
    public void jugarPartido(){}
    
    public void entrenar(){}

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    
    
}
