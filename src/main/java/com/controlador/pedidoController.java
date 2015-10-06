/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.administradorBD.UsuarioJDBCTemplate;
import com.administradorPedido.PedidoJDBCTemplate;
import com.session.PersonaSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Luis
 */
@Controller
public class pedidoController {
    
    @Autowired private PersonaSession persona;
    
    @RequestMapping(value = "/registrarPedido", method = RequestMethod.GET)
    public String registrarPedido(
            @RequestParam("nombre") String nombre,
            @RequestParam("email") String email,
            @RequestParam("telefono") String telefono,
            @RequestParam("direccion") String direccion,
            @RequestParam("numeroUnidades") String numeroUnidades,
            @RequestParam("fecha") String fecha,
            @RequestParam("anotaciones") String anotaciones,
            Model model){
        //(String direccion, Integer numeroUnidades, String fecha, String referencia, Integer idUsuario) 
        
        ApplicationContext contex = new ClassPathXmlApplicationContext("springjdbc.xml");
        PedidoJDBCTemplate pedidoJDBCTemplate = (PedidoJDBCTemplate) contex.getBean("pedidoJDBCTemplate");
        
        String usuario = persona.getNombre();
        
        if ("Anonimo".equals(usuario)) {
            return "index";
        }else{
            pedidoJDBCTemplate.create(direccion, Integer.parseInt(numeroUnidades), fecha, anotaciones, persona.getId());
        }
        model.addAttribute("usuario", usuario);
        return "index";
    }
    
}
