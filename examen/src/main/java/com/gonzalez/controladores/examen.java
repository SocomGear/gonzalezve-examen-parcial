/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gonzalez.controladores;

import com.gonzalez.model.Evaluacion;
import com.gonzalez.model.GeneradorCalificaciones;
import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/servicio-calificaciones")
public class examen {
    
 
@RequestMapping(value="servicio-calificaciones",method = RequestMethod.GET ,headers = ("Accept=Application/json"))
@ResponseBody ArrayList<Evaluacion> jaime(){
    return Evaluacion.Implementar();
}
}
    

