/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg;

import edu.uspg.model.Entrenador;
import edu.uspg.model.Futbolista;
import edu.uspg.model.IntegrantesSeleccion;
import edu.uspg.model.Masajista;

/**
 *
 * @author morozco
 */
public class HerenciaEjemplo {

    
    public static void main(String[] args) {
        IntegrantesSeleccion integrantes[] = new IntegrantesSeleccion[3];
        
        Entrenador guardiola = new Entrenador(1,"Pep","Guardiola",45,23);
        Futbolista messi = new Futbolista(2,"Leonel","Messi",34,10,"Delantero");
        Masajista raul = new Masajista(3,"raul","Sazo",25,"Masajista Profesional",5);
        
        integrantes[0] = guardiola;
        integrantes[1] = messi;
        integrantes[2] = raul;
        
        System.out.println("Todos los integrantes comienzan una concentración. (Todos ejecutan el mismo método)");
         for (int i = 0; i < integrantes.length; i++){
             System.out.print(integrantes[i].getNombres() + " " + integrantes[i].getApellidos() + "->");
              integrantes[i].concentrarse();
         }
         System.out.println("***********************************************");
         System.out.println("Todos los integrantes viajan para jugar partido. (Todos ejecutan el mismo método)");
         for (int i = 0; i < integrantes.length; i++){
             System.out.print(integrantes[i].getNombres() + " " + integrantes[i].getApellidos() + "->");
              integrantes[i].viajar();
         }
         
         
         
    }
    
}
