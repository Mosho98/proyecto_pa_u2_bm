package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaService iPersonaService;
	
	@Override
	public void agregar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaService.agregar(persona);
	}

	@Override
	public void modificar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaService.modificar(persona);
	}

	@Override
	public Persona buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPersonaService.buscar(id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPersonaService.elminar(id);
	}

}
