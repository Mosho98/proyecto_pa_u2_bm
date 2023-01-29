package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Persona;
import com.example.demo.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaRepo iPersonaRepo;
	
	@Override
	public void agregar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaRepo.insertar(persona);
	}

	@Override
	public void modificar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaRepo.actualizar(persona);
	}

	@Override
	public Persona buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPersonaRepo.buscar(id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPersonaRepo.eliminar(id);
	}

}
