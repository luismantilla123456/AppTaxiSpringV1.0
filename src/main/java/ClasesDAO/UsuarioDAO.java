/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDAO;

import Modelo.Usuario;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Luis
 */
public interface UsuarioDAO {
    //inicializa la base de datos
    public void setDataSource(DataSource ds);
    // crear uno nuevo
    public void create(String name, String email, Integer telefono, String direccion,String password, Integer sexo);
    //listar datos del usuario segun id
    public Usuario getUsuario(String telefono,String password);
    // listar los usuarios
    public List<Usuario> listarUsuario();
    // elimina un usuari por su id
    public void delete(Integer id);
    //actualizar un usuario
    public void update(String id,String nombre, String email, String telefono, String password, String direccion, String sexo);
    
}
