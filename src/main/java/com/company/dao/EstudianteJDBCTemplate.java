package com.company.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


public class EstudianteJDBCTemplate implements EstudianteDao {
	 private DataSource dataSource;
	 private JdbcTemplate jdbcTemplateObject;   
	
	 public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
			this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		}

	public void Agregar(String nombre, Integer edad) {
		  String SQL = "insert into estudiante (nombre, edad) values (?, ?)";	      
	      jdbcTemplateObject.update( SQL, nombre,edad);
	      System.out.println("Registro creado nombre = " + nombre + " edad = " + edad);
	      return;
	}

	public Estudiante getEstudiante(Integer id) {
		String SQL = "select * from estudiante where id = ?";
	    Estudiante student = jdbcTemplateObject.queryForObject(SQL, 
	                        new Object[]{id}, new EstudianteMapper());
	    return student;
	}

	public List<Estudiante> listarEstudiantes() {
		String SQL = "select * from estudiante";
	      List <Estudiante> students = jdbcTemplateObject.query(SQL, 
	                                new EstudianteMapper());
	     return students;
	}

	public void Eliminar(Integer id) {
		 String SQL = "delete from estudiante where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Registro eliminado ID = " + id );
	      return;
	}

	public void Actualizar(Integer id, Integer edad) {
		  String SQL = "update estudiante set edad = ? where id = ?";
	      jdbcTemplateObject.update(SQL, edad, id);
	      System.out.println("registro actualizado  ID = " + id );
	      return;

	}

	

}
