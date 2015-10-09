/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administradorPedido;

import Modelo.Pedido;
import ClasesDAO.PedidoDAO;
import Modelo.Usuario;
import com.administradorBD.UsuarioMapper;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Luis
 */
public class PedidoJDBCTemplate implements PedidoDAO{
    
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void create(String direccion, Integer numeroUnidades, String fecha, String referencia, Integer idUsuario) {
        String SQL = "INSERT INTO reserva (idReserva, ReservaDierccion, ReservaNumeroUnidades, ReservaFecha, ReservaReferencia, "
                + "Usuario_idUsuario) VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplateObject.update( SQL, null,direccion, numeroUnidades, fecha, referencia, idUsuario);
    }
    
    @Override
    public Pedido getPedido(String idPedido,String idUsuario) {
        Pedido pedido = null;
        String SQL = "SELECT * FROM reserva WHERE idReserva = ? AND Usuario_idUsuario = ?";
        try {
            pedido = jdbcTemplateObject.queryForObject(SQL, new Object[]{idPedido, idUsuario}, new PedidoMapper());
        } catch (Exception e) {
        }
        
        return pedido;
    }

    @Override
    public List<Pedido> listarPedidos(Integer id) {
        String SQL = "select * from reserva where Usuario_idUsuario = ?";
        List<Pedido> pedidos = null;
        try {
            //checa este cast
            pedidos = (List<Pedido>) jdbcTemplateObject.query(SQL,new Object[]{id}, new PedidoMapper());
        } catch (Exception e) {
        }
        
        return pedidos;
    }

    @Override
    public void delete(Integer idReserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(String idPedido, String idUsuario,String direccion, Integer numeroUnidades, String fecha, String referencia) {
        String sql = "UPDATE reserva SET ReservaDierccion = ?, ReservaNumeroUnidades = ?, ReservaFecha = ?, ReservaReferencia = ? WHERE idReserva = ? AND Usuario_idUsuario = ?";
        jdbcTemplateObject.update( sql, direccion,numeroUnidades,fecha,referencia,idPedido,idUsuario);
    
    }

    @Override
    public List<Pedido> listarPedidos() {
        String SQL = "select * from reserva";
        List<Pedido> pedidos = null;
        try {
            //checa este cast
            pedidos = (List<Pedido>) jdbcTemplateObject.query(SQL, new PedidoMapper());
        } catch (Exception e) {
        }
        
        return pedidos;
    }

}
