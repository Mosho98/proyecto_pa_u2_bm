package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {

	public void agregar(Estudiante estudiante);
	public void modificar(Estudiante estudiante);
	
	public Estudiante buscar(Integer id);
	public void elminar(Integer id);
}
