package com.example.demo.repository;

import com.example.demo.modelo.Curso;

public interface ICursoRepo {

	public void insertar(Curso curso);
	public void actualizar(Curso curso);
	
	public Curso buscar(Integer id);
	public void eliminar(Integer id);
}
