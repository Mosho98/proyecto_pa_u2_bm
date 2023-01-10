package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.repository.ProfesorRepoImpl;

@Service
public class ProfesorServiceImpl implements IProfesorService{

	@Autowired
	private ProfesorRepoImpl profesorRepoImpl;
	
	
	@Override
	public void agregar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.profesorRepoImpl.insertar(profesor);
	}

	@Override
	public void modificar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.profesorRepoImpl.actualizar(profesor);
	}

	@Override
	public Profesor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.profesorRepoImpl.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.profesorRepoImpl.eliminar(id);
	}

}
