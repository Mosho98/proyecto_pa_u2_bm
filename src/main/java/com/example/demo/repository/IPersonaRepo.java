package com.example.demo.repository;

import com.example.demo.modelo.Persona;

public interface IPersonaRepo {

	public void insertar(Persona persona);
	public void actualizar(Persona persona);
	
	public Persona buscar(Integer id);
	public void eliminar(Integer id);
}
