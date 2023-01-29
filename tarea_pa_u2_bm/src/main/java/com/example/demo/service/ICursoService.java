package com.example.demo.service;



import com.example.demo.modelo.Curso;


public interface ICursoService{

	
	public void agregar(Curso curso);
	public void modificar(Curso curso);
	
	public Curso buscar(Integer id);
	public void elminar(Integer id);
	
	
}
