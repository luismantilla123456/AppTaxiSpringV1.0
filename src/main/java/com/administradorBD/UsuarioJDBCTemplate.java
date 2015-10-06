/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administradorBD;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Luis
 */
public class UsuarioJDBCTemplate implements UsuarioDAO{
    
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String nombre, String email, Integer telefono, String direccion, String password, Integer sexo) {
        String SQL = "INSERT INTO usuario (idUsuario, UsuarioNombre, UsuarioEmail, UsuarioTelefono,UsuarioPass,UsuarioDireccion, Sexo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?);";
        jdbcTemplateObject.update( SQL, null,nombre,email,telefono,password,direccion,sexo);
//        jdbcTemplateObject.update( SQL, null,"juan","nuevo",15742254,"direccion",1);
    }

    @Override
    public Usuario getUsuario(String telefono,String password) {
        String SQL = "select * from usuario where UsuarioTelefono = ? and UsuarioPass = ?"; 
        Usuario usuario = null;
        try {
            usuario = jdbcTemplateObject.queryForObject(SQL,new Object[]{telefono, password}, new UsuarioMapper());
        } catch (Exception e) {
        }
        return usuario;
    }

    @Override
    public List<Usuario> listarUsuario() {
        String SQL = "select * from usuario";
        List<Usuario> usuarios =  jdbcTemplateObject.query(SQL, new UsuarioMapper());
        return usuarios;
    }

    @Override
    public void delete(Integer id) {
        String SQL = "delete from `apptaxi`.`usuario` where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("eliminado el registro "+id);
    }

    @Override
    public void update(Integer id, Integer age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
