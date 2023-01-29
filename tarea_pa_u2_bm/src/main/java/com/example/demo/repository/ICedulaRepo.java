package com.example.demo.repository;

import com.example.demo.modelo.Cedula;

public interface ICedulaRepo {

	public void insertar(Cedula cedula);
	public void actualizar(Cedula cedula);
	
	public Cedula buscar(Integer id);
	public void eliminar(Integer id);
}
