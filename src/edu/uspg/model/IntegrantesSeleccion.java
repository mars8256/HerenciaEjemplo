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
public class IntegrantesSeleccion {
    
    private Integer id;
    private String nombres;
    private String apellidos;
    private Integer edad;
    
    public IntegrantesSeleccion(){}
    
    public IntegrantesSeleccion(Integer id, String nombres, 
            String apellidos, Integer edad){
        this.edad = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public void concentrarse(){
        System.out.println("Concentrase");
    }
    
    public void viajar(){
        System.out.println("Viajando");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
    
}
