package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Curso;
import com.example.demo.repository.ICursoRepo;

@Service
public class CursoServiceImpl implements ICursoService{

	@Autowired
	private ICursoRepo cursoRepo;
	
	@Override
	public void agregar(Curso curso) {
		// TODO Auto-generated method stub
		this.cursoRepo.insertar(curso);
	}

	@Override
	public void modificar(Curso curso) {
		// TODO Auto-generated method stub
		this.cursoRepo.actualizar(curso);
	}

	@Override
	public Curso buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cursoRepo.buscar(id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		this.cursoRepo.eliminar(id);
	}

}
