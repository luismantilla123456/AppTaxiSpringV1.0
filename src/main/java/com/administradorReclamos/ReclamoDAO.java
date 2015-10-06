/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administradorReclamos;

import com.administradorPedido.Pedido;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Luis
 */
public interface ReclamoDAO {
    public void setDataSource(DataSource ds);
    // crear uno nuevo
    public void create(String reclamo,String fecha,Integer idUsuario);
    //listar datos del usuario segun id
    public Pedido getReclamo(int id);
    // listar los usuarios
    public List<Reclamo> listareclamos(Integer id);
    // elimina un usuari por su id
    public void delete(Integer id);
    //actualizar un usuario
    public void update(Integer id,Integer age);
}
