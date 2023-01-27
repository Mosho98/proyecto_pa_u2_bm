package com.example.demo.service;

import com.example.demo.modelo.Persona;

public interface IPersonaService {

	public void agregar(Persona persona);
	public void modificar(Persona persona );
	
	public Persona buscar(Integer id);
	public void elminar(Integer id);
}
