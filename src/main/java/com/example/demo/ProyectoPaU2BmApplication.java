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
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2BmApplication implements CommandLineRunner{

	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2BmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		
//		Ciudadano ciu=new Ciudadano();
//		ciu.setNombre("Bryan");
//		ciu.setApellido("Mullo"); 
//		
//		this.ciudadanoService.insertar(ciu);
//	
//		
//		Empleado empl= new Empleado();
//		empl.setFechaIngreso(LocalDateTime.now());
//		empl.setSalario(new BigDecimal(100));
//		empl.setCiudadano(ciu);
//		
//		ciu.setEmpleado(empl);
		
		
		
		//segundo ejemplo
		
//		Ciudadano ciu2=new Ciudadano();
//		ciu2.setNombre("Bryan");
//		ciu2.setApellido("Mullo"); 
//		
//		
//		Empleado empl2= new Empleado();
//		empl2.setFechaIngreso(LocalDateTime.now());
//		empl2.setSalario(new BigDecimal(100));
//		empl2.setCiudadano(ciu2);
//		ciu2.setEmpleado(empl2);
//		
//		//this.ciudadanoService.insertar(ciu2);
//		this.empleadoService.agregar(empl2);
	}

}
