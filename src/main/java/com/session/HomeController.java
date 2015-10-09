/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import Modelo.Usuario;
import com.administradorBD.UsuarioJDBCTemplate;
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
public class HomeController {
    
    @Autowired private PersonaSession persona;
    
    @RequestMapping(value = "/LoginUsuarioTP")
    public String setUserPreferenc(
            @RequestParam("telefono") String telefono,
            @RequestParam("password") String password,
            Model model){
        
        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
        UsuarioJDBCTemplate usuarioJDBCTemplate =(UsuarioJDBCTemplate)context.getBean("usuarioJDBCTemplate");

        Usuario usuario = usuarioJDBCTemplate.getUsuario(telefono, password);
        
        if(usuario != null){
            persona.setNombre(usuario.getNombre());
            persona.setEmail(usuario.getEmail());
            persona.setTelefono(String.valueOf(usuario.getTelefono()));
            persona.setPassword(usuario.getPassword());
            persona.setDireccion(usuario.getDireccion());
            persona.setId(usuario.getId());
        }
        model.addAttribute("usuario", persona.getNombre());
        return "/index";
    }
    
    @RequestMapping(value = "/logOut")
    public String logOut(Model model){
        persona.inicializar();
        model.addAttribute("usuario", persona.getNombre());
        return "index";
    }
    
    @RequestMapping(value = "/getSessionData")
    public String getSessionData(Model model){
        String data= persona.getNombre();
        model.addAttribute("usuario", data);
        return "redirec:";
    }
    
}
