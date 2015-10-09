/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administradorReclamos;

import Modelo.Reclamo;
import ClasesDAO.ReclamoDAO;
import Modelo.Pedido;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Luis
 */
public class ReclamoJDBCTemplate implements ReclamoDAO{

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String reclamo, String fecha, Integer idUsuario) {
        String SQL = "INSERT INTO reclamo (idReclamo, ReclamoText, ReclamoFecha, Usuario_idUsuario)"
                + " VALUES (? , ?, ?, ?)";
        jdbcTemplateObject.update( SQL, null, reclamo, fecha, idUsuario);
    
    }

    @Override
    public Pedido getReclamo(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Reclamo> listareclamos(Integer id) {
        String SQL = "select * from reclamo";
        List<Reclamo> reclamos =  jdbcTemplateObject.query(SQL, new ReclamoMapper());
        return reclamos;
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Integer id, Integer age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
