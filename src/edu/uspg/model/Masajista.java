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
public class Masajista extends IntegrantesSeleccion {
    
    private String titulacion;
    private Integer añosExperiencia;
    
    public Masajista(){
        super();
    }
    
     public Masajista(Integer id, String nombres, 
                        String apellidos, Integer edad, 
                        String titulacion, Integer añosExperiencia){
        super(id,nombres,apellidos,edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
        
        
    }
    
    public void darMasaje(){}

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(Integer añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    
    
}
