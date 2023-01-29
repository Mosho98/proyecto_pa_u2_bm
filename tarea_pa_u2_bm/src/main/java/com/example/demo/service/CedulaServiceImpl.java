package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cedula;
import com.example.demo.repository.ICedulaRepo;

@Service
public class CedulaServiceImpl implements ICedulaService{

	@Autowired
	private ICedulaRepo cedulaRepo;

	@Override
	public void agregar(Cedula cedula) {
		// TODO Auto-generated method stub
		this.cedulaRepo.insertar(cedula);
	}

	@Override
	public void modificar(Cedula cedula) {
		// TODO Auto-generated method stub
		this.cedulaRepo.actualizar(cedula);
	}

	@Override
	public Cedula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cedulaRepo.buscar(id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		this.cedulaRepo.eliminar(id);
	}
	
	
}
