/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import Modelo.Usuario;
import com.administradorBD.UsuarioJDBCTemplate;
import com.session.PersonaSession;
import java.util.List;
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
public class nuevoUsuarioController {
    
    @Autowired private PersonaSession persona;
    
    @RequestMapping(value = "/registrarUsuario" , method = RequestMethod.GET)
    public String registrarUsario(
            @RequestParam("nombre") String nombre,
            @RequestParam("enmail") String email,
            @RequestParam("telefono") String telefono,
            @RequestParam("direccion") String direccion,
            @RequestParam("password") String password,
            @RequestParam("sexo") String sexo,
            Model model){
        ApplicationContext context =  new ClassPathXmlApplicationContext("springjdbc.xml");
        UsuarioJDBCTemplate usuarioJDBCTemplate =(UsuarioJDBCTemplate)context.getBean("usuarioJDBCTemplate");

        usuarioJDBCTemplate.create(nombre, email, Integer.parseInt(telefono),direccion, password, Integer.parseInt(sexo));
//        List<Usuario> usuario = usuarioJDBCTemplate.listarUsuario();
        String usuario = persona.getNombre();
        model.addAttribute("usuario", usuario);
        return "index";
    }
    
    
    
}
