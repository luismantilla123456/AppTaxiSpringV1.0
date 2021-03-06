/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.administradorBD.UsuarioJDBCTemplate;
import Modelo.Pedido;
import com.administradorPedido.PedidoJDBCTemplate;
import com.administradorReclamos.ReclamoJDBCTemplate;
import com.session.PersonaSession;
import java.util.List;
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
public class ListarPedidosController {
    
    @Autowired private PersonaSession persona;
    
    @RequestMapping( value = "/listarPedidosReservas" )
    public String listarReservas(
        @RequestParam("id") String idUsuario,Model model){
        
        return "index";
    }
    
}
