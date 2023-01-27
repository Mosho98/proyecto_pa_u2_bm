package com.example.demo.service;

import com.example.demo.modelo.Cedula;

public interface ICedulaService {

	public void agregar(Cedula cedula);
	public void modificar(Cedula cedula);
	
	public Cedula buscar(Integer id);
	public void elminar(Integer id);
}
