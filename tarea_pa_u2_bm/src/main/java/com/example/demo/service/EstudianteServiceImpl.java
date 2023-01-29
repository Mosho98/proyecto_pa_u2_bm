package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public void agregar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertar(estudiante);
	}

	@Override
	public void modificar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.actualizar(estudiante);
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscar(id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepo.eliminar(id);
	}

}
