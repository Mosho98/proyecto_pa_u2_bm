package com.example.demo.uce.service;

import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {
	
	public void agregar(Estudiante estudiante);
	public void modificar(Estudiante estudiante);
	//CRUD siempre por primary key
	public Estudiante buscar(Integer id);
	public void borrar(Integer id);
}
