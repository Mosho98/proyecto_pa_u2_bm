package com.example.demo.repository;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cedula;
import com.example.demo.modelo.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CursoRepoImpl implements ICursoRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Curso curso) {
		// TODO Auto-generated method stub
		this.entityManager.persist(curso);
	}

	@Override
	public void actualizar(Curso curso) {
		// TODO Auto-generated method stub
		this.entityManager.merge(curso);
	}

	@Override
	public Curso buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Curso.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Curso curso = this.buscar(id);
		this.entityManager.remove(curso);
	}
	
	

}
