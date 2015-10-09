/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedidosMovil;

import Modelo.Usuario;
import com.administradorBD.UsuarioJDBCTemplate;
import Modelo.Pedido;
import com.administradorPedido.PedidoJDBCTemplate;
import com.administradorPedido.PedidoMapper;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Luis
 */
@Controller
public class MovilPedidosController {
    
    @RequestMapping( value = "/mvlListarPedidos")
    public @ResponseBody List<Pedido> devolverListaPedidos(
            @RequestParam("id") Integer id){
        ApplicationContext context =  new ClassPathXmlApplicationContext("springjdbc.xml");
        PedidoJDBCTemplate pedidoJDBCTemplate = (PedidoJDBCTemplate) context.getBean("pedidoJDBCTemplate");
        
        List<Pedido> pedidos = pedidoJDBCTemplate.listarPedidos(id);;
        
        return pedidos;
    }
    @RequestMapping(value = "mvlLoginUsuario")
    public @ResponseBody Usuario devolverUsuario(
            @RequestParam("telefono") String telefono,
            @RequestParam("password") String password){
        
        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
        UsuarioJDBCTemplate usuarioJDBCTemplate =(UsuarioJDBCTemplate)context.getBean("usuarioJDBCTemplate");

        Usuario usuario = usuarioJDBCTemplate.getUsuario(telefono, password);
        if (usuario==null) {
            usuario.setId(0);
            usuario.setNombre("Anonimo");
            usuario.setDireccion("Anonimo");
            usuario.setEmail("Anonimo");
            usuario.setPassword("Anonimo");
            usuario.setSexo(1);
            usuario.setTelefono(000000000);
        }
        return usuario;
    }
    
}
