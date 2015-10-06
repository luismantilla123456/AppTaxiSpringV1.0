package com.company.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class EstudianteMapper implements RowMapper<Estudiante> {

	public Estudiante mapRow(ResultSet rs, int arg1) throws SQLException {
		Estudiante student = new Estudiante();
	      student.setId(rs.getInt("id"));
	      student.setNombre(rs.getString("nombre"));
	      student.setEdad(rs.getInt("edad"));	      
		return student;
	}

	
}
