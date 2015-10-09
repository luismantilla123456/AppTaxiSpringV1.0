/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import Modelo.Usuario;
import com.administradorBD.UsuarioJDBCTemplate;
import Modelo.Pedido;
import com.administradorPedido.PedidoJDBCTemplate;
import com.session.PersonaSession;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author Luis
 */
@Controller
public class indexController {
    
    @Autowired private PersonaSession persona;
    
    @RequestMapping( value = "/index" )
    public String index(Model model){
        String usuario = persona.getNombre();
        model.addAttribute("usuario", usuario);
        return "index";
    }
    
    @RequestMapping(value = "/login")
    public String login(Model model) {
        String usuario = persona.getNombre();
        model.addAttribute("usuario", usuario);
        return "login";
    }
    
    @RequestMapping(value = "/nuevoUsuario")
    public String nuevoUsuario(Model model){
        String usuario = persona.getNombre();
        model.addAttribute("usuario", usuario);
        if (usuario != "Anonimo") {
            return "index";
        }
        return "nuevoUsuario";
    }
    
    @RequestMapping(value = "/pedido")
    public String pedido(Model model){
        String usuario = persona.getNombre();
        model.addAttribute("usuario", usuario);
        if (usuario == "Anonimo") {
            return "index";
        }else{
            model.addAttribute("nombre", persona.getNombre());
            model.addAttribute("email", persona.getEmail());
            model.addAttribute("telefono", persona.getTelefono());
            model.addAttribute("direccion", persona.getDireccion());
        }
        return "pedido";
    }
    
    @RequestMapping(value = "/reclamo")
    public String reclamo(Model model){
        String usuario = persona.getNombre();
        model.addAttribute("usuario", usuario);
        if (usuario == "Anonimo") {
            return "index";
        }else{
            model.addAttribute("nombre", persona.getNombre());
            model.addAttribute("email", persona.getEmail());
            model.addAttribute("telefono", persona.getTelefono());
            model.addAttribute("direccion", persona.getDireccion());
        }
        return "reclamo";
    }
    
    @RequestMapping(value = "/reservas")
    public String listarReservas(Model model){
        
        ApplicationContext context =  new ClassPathXmlApplicationContext("springjdbc.xml");
        PedidoJDBCTemplate reclamoJDBCTemplate = (PedidoJDBCTemplate) context.getBean("pedidoJDBCTemplate");
        
        List<Pedido> pedidos = null;
        model.addAttribute("usuario", persona.getNombre());
        if ("Anonimo".equals(persona.getNombre())) {
            return "index";
        }else{
            if ("admin".equals(persona.getNombre())) {
                pedidos = reclamoJDBCTemplate.listarPedidos();
            } else {
                pedidos = reclamoJDBCTemplate.listarPedidos(persona.getId());
                
            }
            if (pedidos!=null) {
                model.addAttribute("lista", pedidos );
            }
        }
        return "listarReservas";
    }
}
