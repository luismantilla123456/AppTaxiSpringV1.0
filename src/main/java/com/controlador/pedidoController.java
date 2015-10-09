/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import Modelo.Pedido;
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
    
    @RequestMapping(value = "/modificarPedido", method = RequestMethod.GET)
    public String modificarPedido(
            @RequestParam("id") String id,
            Model model){
        //(String direccion, Integer numeroUnidades, String fecha, String referencia, Integer idUsuario) 
        
        ApplicationContext contex = new ClassPathXmlApplicationContext("springjdbc.xml");
        PedidoJDBCTemplate pedidoJDBCTemplate = (PedidoJDBCTemplate) contex.getBean("pedidoJDBCTemplate");
        
        String usuario = persona.getNombre();
        Pedido pedido = null;
        model.addAttribute("usuario", usuario);
        if ("Anonimo".equals(usuario)) {
            return "index";
        }else{
            pedido = pedidoJDBCTemplate.getPedido(id, String.valueOf(persona.getId()) );
            model.addAttribute("pedido", pedido);
            model.addAttribute("telefono", persona.getTelefono());
            model.addAttribute("email", persona.getEmail());
        }
        return "modifocarPedido";
    }
    
    @RequestMapping(value = "/actualizarPedido", method = RequestMethod.GET)
    public String actualizarPedido(
            @RequestParam("id") String idReserva,
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
        Pedido pedido = null;
        model.addAttribute("usuario", usuario);
//        if ("Anonimo".equals(usuario)== false) {
//            try {
                pedidoJDBCTemplate.update(idReserva, String.valueOf(persona.getId()), 
                                        direccion, Integer.valueOf(numeroUnidades), fecha, anotaciones);
//            } catch (Exception e) {
//            }
//        }
        return "index";
    }
    
    @RequestMapping(value = "/mvlPedido", method = RequestMethod.GET)
    public String mvlregistrarPedido(
            @RequestParam("drccn") String direccion,
            @RequestParam("nUnidades") String numeroUnidades,
            @RequestParam("fecha") String fecha,
            @RequestParam("anota") String anotaciones,
            @RequestParam("id") Integer id){
        
        ApplicationContext contex = new ClassPathXmlApplicationContext("springjdbc.xml");
        PedidoJDBCTemplate pedidoJDBCTemplate = (PedidoJDBCTemplate) contex.getBean("pedidoJDBCTemplate");
        
        pedidoJDBCTemplate.create(direccion, Integer.parseInt(numeroUnidades), fecha, anotaciones, id );
        
        return "index";
    }
    
}
