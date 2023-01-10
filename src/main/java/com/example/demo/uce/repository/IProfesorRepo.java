package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Profesor;

public interface IProfesorRepo {
	//CRUD BASICO
		public void insertar(Profesor profesor);
		public void actualizar(Profesor profesor);
		//CRUD siempre por primary key
		public Profesor buscar(Integer id);
		public void eliminar(Integer id);
}
