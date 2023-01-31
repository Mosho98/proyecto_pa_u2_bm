package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.service.IAutorService;

@SpringBootApplication
public class ProyectoPaU2BmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2BmApplication.class, args);
	}

//	@Autowired
//	private IPersonaService iPersonaService ;
//	@Autowired
//	private ICedulaService cedulaService;
	
	@Autowired
	private IAutorService autorService;
	
	
	@Override
	public void run(String... args) throws Exception {
		Libro l1 = new Libro();
		Set<Autor> autores = new HashSet<Autor>();
		
		   Autor a1 = new Autor();
			a1.setNombre("WS");

			autores.add(a1);
			
			
		l1.setNombre("P.web");
		l1.setAutores(autores);
		Libro l2 = new Libro();
		l2.setNombre("Redes");
		l2.setAutores(autores);
		   Set<Libro> libro = new HashSet<Libro>();
		
		   libro.add(l1);
		   libro.add(l2);
		   
				   a1.setLibros(libro);
		   
		   
		   this.autorService.agregar(a1);
	}

}
