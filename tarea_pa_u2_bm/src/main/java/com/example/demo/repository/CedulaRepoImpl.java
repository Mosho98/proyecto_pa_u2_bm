package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Cedula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CedulaRepoImpl implements ICedulaRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Cedula cedula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cedula);
	}

	@Override
	public void actualizar(Cedula cedula) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cedula);
	}

	@Override
	public Cedula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cedula.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Cedula ced = this.buscar(id);
		this.entityManager.remove(ced);
	}
	
	
}
