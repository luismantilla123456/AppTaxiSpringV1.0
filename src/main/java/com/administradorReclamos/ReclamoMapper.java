package com.administradorReclamos;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class ReclamoMapper implements RowMapper<Reclamo>{

    @Override
    public Reclamo mapRow(ResultSet rs, int i) throws SQLException {
        Reclamo reclamo = new Reclamo();
        reclamo.setId(rs.getInt("idReclamo"));
        reclamo.setReclamo(rs.getString("ReclamoText"));
        reclamo.setFecha(rs.getString("ReclamoFecha"));
        reclamo.setIdUsuario(rs.getInt("Usuario_idUsuario"));
        
        return reclamo;
    }
    
}
