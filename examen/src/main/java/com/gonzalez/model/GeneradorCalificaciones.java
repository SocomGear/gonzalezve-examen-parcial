/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gonzalez.model;

import java.util.ArrayList;



/**
 *
 * @author T107
 */
public class GeneradorCalificaciones {
    public static ArrayList<Evaluacion> Implementar(){
        ArrayList<Evaluacion> generarCalificacion=new ArrayList<Evaluacion>();
        
      Evaluacion a1;
      a1=new Evaluacion("Petra",5.8f);
      generarCalificacion.add(a1);
      
      Evaluacion a2;
      a2=new Evaluacion("Jose",7.4f);
      generarCalificacion.add(a2);
      
      Evaluacion a3;
      a3=new Evaluacion("Roberta",8.6f);
      generarCalificacion.add(a3);
      
      
      return generarCalificacion;
      
      
       
        
    }
    
}
