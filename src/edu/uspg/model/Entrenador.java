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
public class Entrenador extends IntegrantesSeleccion {
    
    private Integer idFederacion;
    
    public Entrenador(){
        super();
    }
    
     public Entrenador(Integer id, String nombres, 
                        String apellidos, Integer edad, 
                        Integer idFederacion){
        super(id,nombres,apellidos,edad);
        this.idFederacion = idFederacion;
        
        
    }
    
    public void dirigirPartido(){}
    
    public void dirigirEntreno(){}

    public Integer getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(Integer idFederacion) {
        this.idFederacion = idFederacion;
    }
 
    
    
}
