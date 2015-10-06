/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administradorPedido;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Luis
 */
public class PedidoMapper implements RowMapper<Pedido>{

    @Override
    public Pedido mapRow(ResultSet rs, int i) throws SQLException {
        Pedido pedido = new Pedido();
        pedido.setId(rs.getInt("idReserva"));
        pedido.setDireccion(rs.getString("ReservaDierccion"));
        pedido.setUnidades(rs.getInt("ReservaNumeroUnidades"));
        pedido.setFecha(rs.getString("ReservaFecha"));
        pedido.setReferencia(rs.getString("ReservaReferencia"));
        pedido.setIdusuario(rs.getInt("Usuario_idUsuario"));
        return pedido;
    }
    
}
