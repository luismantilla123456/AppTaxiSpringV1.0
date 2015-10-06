/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administradorBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Luis
 */
public class UsuarioMapper implements RowMapper<Usuario> {
    public Usuario mapRow(ResultSet rs, int i) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setId(rs.getInt("idUsuario"));
        usuario.setNombre(rs.getString("UsuarioNombre"));
        usuario.setEmail(rs.getString("UsuarioEmail"));
        usuario.setTelefono(rs.getInt("UsuarioTelefono"));
        usuario.setPassword(rs.getString("UsuarioPass"));
        usuario.setDireccion(rs.getString("UsuarioDireccion"));
        usuario.setSexo(rs.getInt("Sexo"));
        return usuario;
    }
    
}
