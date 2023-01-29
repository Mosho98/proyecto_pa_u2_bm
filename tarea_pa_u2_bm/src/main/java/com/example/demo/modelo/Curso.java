package com.example.demo.modelo;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "curso")
@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "curso_seq")
	@SequenceGenerator(name="curso_seq",sequenceName = "curso_seq",allocationSize = 1)
	@Column(name="curso_id")
	private Integer id;
	
	@Column(name="curso_numero")
	private String numeroCurso;
	
	@OneToMany(mappedBy = "curso", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Estudiante> estudiantes;
	
	//SET Y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroCurso() {
		return numeroCurso;
	}

	public void setNumeroCurso(String numeroCurso) {
		this.numeroCurso = numeroCurso;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	//TO STRING
	/*
	@Override
	public String toString() {
		return "Curso [id=" + id + ", numeroCurso=" + numeroCurso  + "]";
	}
	*/
	
	
	
	
}
