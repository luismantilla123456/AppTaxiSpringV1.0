/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.administradorPedido.PedidoJDBCTemplate;
import com.administradorReclamos.ReclamoJDBCTemplate;
import com.session.PersonaSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Luis
 */
@Controller
public class reclamoController {
    
    @Autowired private PersonaSession persona;
    
    @RequestMapping(value = "/registrarReclamo")
    public String registrarReclamo(
            @RequestParam("nombre") String nombre,
            @RequestParam("email") String email,
            @RequestParam("telefono") String telefono,
            @RequestParam("reclamo") String reclamo,
            @RequestParam("fecha") String fecha,
            Model model
            ){
        //ApplicationContext contex = new ClassPathXmlApplicationContext("springjdbc.xml");
        //PedidoJDBCTemplate pedidoJDBCTemplate = (PedidoJDBCTemplate) contex.getBean("pedidoJDBCTemplate");
        ApplicationContext contx = new ClassPathXmlApplicationContext("springjdbc.xml");
        
        ReclamoJDBCTemplate reclamoJDBCTemplate = (ReclamoJDBCTemplate) contx.getBean("reclamoJDBCTemplate");
        //almacenar en la base de datos
        
        String usuario = persona.getNombre();
        model.addAttribute("usuario", usuario);
        if ("Anonimo".equals(usuario)) {
            return "index";
        }else{
            reclamoJDBCTemplate.create(reclamo, fecha, persona.getId());
        }
        
        return "index";
    }
    
}
