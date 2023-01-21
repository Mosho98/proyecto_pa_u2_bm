package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2BmApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudainteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService; 
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2BmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu = new Estudiante();
		//estu.setId(4);
		estu.setNombre("Ferxxo");
		estu.setApellido("Paucar");
		estu.setCedula("1753054285");
		estu.setCiudad("Quito");
		estu.setGenero("Masculino");
		this.estudainteService.agregar(estu);
		
		
		Ciudadano ciud = new Ciudadano();
		ciud.setNombre("Bryan");
		ciud.setApellido("Mullo");
		this.ciudadanoService.insertar(ciud);
		
		
		Empleado empl = new Empleado();
		empl.setSalario(new BigDecimal(20));
		empl.setFechaIngreso(LocalDateTime.now());
		empl.setCiudadano(ciud);
		
		ciud.setEmpleado(empl);
		
		
		//estu.setNombre("Juan");
		//estu.setCedula("12345678");
		//this.estudainteService.modificar(estu);
		
		
		//Estudiante estu2 = this.estudainteService.buscar(2);
		//System.out.println(estu2);
		
		//this.estudainteService.borrar(1);
	
	
}
}
