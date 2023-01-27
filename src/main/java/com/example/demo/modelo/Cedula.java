package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "cedula")
@Entity
public class Cedula {

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "ced_seq")
	@SequenceGenerator(name="ced_seq",sequenceName = "ced_seq",allocationSize = 1)
	@Column(name="ced_id")
	private Integer id;
	
	@Column(name="ced_numero")
	private String numero;
	
	@OneToOne()
	@JoinColumn(name = "ced_id_persona")
	private Persona persona;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
	
}
