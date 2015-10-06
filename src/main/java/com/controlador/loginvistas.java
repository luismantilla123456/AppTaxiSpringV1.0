/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Luis
 */
@Controller
public class loginvistas {
    @RequestMapping(value = "/l")
    public String login(){
        //logueamos
        //devolvemos datos usuario
        
        // redirect login con pass o usuario incorrecto
        if (true) {
            return "redirect:";
        }
        return "login";
    }
    
    @RequestMapping(value = "/e")
    public String editarPerfil(){
        //falta jsp
        
        // vista proceso completado
        return "redirect:";
    }
    
    
    
}
