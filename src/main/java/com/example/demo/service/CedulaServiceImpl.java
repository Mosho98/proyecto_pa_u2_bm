package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cedula;

@Service
public class CedulaServiceImpl implements ICedulaService{

	@Autowired
	private ICedulaService cedulaService;

	@Override
	public void agregar(Cedula cedula) {
		// TODO Auto-generated method stub
		this.cedulaService.agregar(cedula);
	}

	@Override
	public void modificar(Cedula cedula) {
		// TODO Auto-generated method stub
		this.cedulaService.modificar(cedula);
	}

	@Override
	public Cedula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cedulaService.buscar(id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		this.cedulaService.elminar(id);
	}
	
	
}
