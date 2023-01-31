package com.example.demo.uce.modelo;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro" )
//PRINCIPAL
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libro_seq")
	@SequenceGenerator(name = "libro_seq", sequenceName = "libro_seq", allocationSize = 1)
	@Column(name = "libro_id")
	private Integer id;
	
	@Column(name = "libro_nombre")
	private String nombre;
	
	@Column(name = "autor_editorial")
	private String editorial;

	@ManyToMany
	@JoinTable(
	name = "libro_autor", //Nombre de la tabla de rompimiento
	joinColumns = @JoinColumn(name = "liau_id_libro"),//la columna FK de libro
	inverseJoinColumns = @JoinColumn(name = "liau_id_autor") //La columna FK de autor
	) 
	private Set<Autor> autores;
	
	//GET Y SET
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
	
	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}
	
	
}
