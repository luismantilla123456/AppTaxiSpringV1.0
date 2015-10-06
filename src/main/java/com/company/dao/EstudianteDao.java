package com.company.dao;

import java.util.List;

import javax.sql.DataSource;


public interface EstudianteDao {
    /*
     * Metodo utilizado para inicializar la conexion con la bd
     */
	public void setDataSource(DataSource ds);
	public void Agregar(String nombre, Integer edad);
	public Estudiante getEstudiante(Integer id);
	public List<Estudiante> listarEstudiantes();
	public void Eliminar(Integer id);
	public void Actualizar(Integer id, Integer edad);
}
