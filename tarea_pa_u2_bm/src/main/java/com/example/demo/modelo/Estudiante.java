package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "estudiantes")
@Entity
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "est_seq")
	@SequenceGenerator(name="est_seq",sequenceName = "est_seq",allocationSize = 1)
	@Column(name="est_id")
	private Integer id;
	
	@Column(name="est_nombre")
	private String nombre;
	
	@Column(name="est_apellido")
	private String apellido;
	
	@ManyToOne
	@JoinColumn(name = "curso_id_estudiante")
	private Curso curso;
	
	//GETTERS Y SETTERS

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	
	//TO STRING
	/*@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	*/
	
	
	

}
