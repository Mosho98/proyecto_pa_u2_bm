package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cedula;
import com.example.demo.modelo.Persona;
import com.example.demo.service.ICedulaService;
import com.example.demo.service.IPersonaService;

@SpringBootApplication
public class TareaPa9Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TareaPa9Application.class, args);
	}
	
	@Autowired
	private IPersonaService iPersonaService ;
	@Autowired
	private ICedulaService cedulaService;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Persona c1=new Persona();
		c1.setNombre("Bryan");
		
		Cedula p1=new Cedula();
		p1.setNumero("1753054815");
		p1.setPersona(c1);
		c1.setCedula(p1);
		
		this.iPersonaService.agregar(c1);
		//this.cedulaService.elminar(1);
		
		//Persona cBuscar=this.iPersonaService.buscar(2);
		
		//cBuscar.setNombre("Fernando");
		
		//this.iPersonaService.modificar(cBuscar);
		
	}

}
