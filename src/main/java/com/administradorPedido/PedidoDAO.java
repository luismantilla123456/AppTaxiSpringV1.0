/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administradorPedido;

import com.administradorBD.Usuario;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Luis
 */
public interface PedidoDAO {
    //inicializa la base de datos
    public void setDataSource(DataSource ds);
    // crear uno nuevo
    public void create(String direccion, Integer numeroUnidades, String fecha, String referencia,Integer idUsuario);
    //listar datos del usuario segun id
    public Pedido getPedido(String telefono,String password);
    // listar los usuarios
    public List<Pedido> listarPedidos(Integer id);
    // lista general de pedidos
    public List<Pedido> listarPedidos();
    // elimina un usuari por su id
    public void delete(Integer id);
    //actualizar un usuario
    public void update(Integer id,Integer age);
}
