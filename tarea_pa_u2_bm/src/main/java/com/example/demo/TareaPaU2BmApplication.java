package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Curso;
import com.example.demo.modelo.Estudiante;
import com.example.demo.service.ICedulaService;
import com.example.demo.service.ICursoService;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IPersonaService;

@SpringBootApplication
public class TareaPaU2BmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TareaPaU2BmApplication.class, args);
	}

//	@Autowired
//	private IPersonaService iPersonaService ;
//	@Autowired
//	private ICedulaService cedulaService;
	
	@Autowired
	private ICursoService cursoService;
	
	@Autowired
	private IEstudianteService estudianteService;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Persona c1=new Persona();
//		c1.setNombre("Bryan");
//		
//		Cedula p1=new Cedula();
//		p1.setNumero("1753054815");
//		p1.setPersona(c1);
//		c1.setCedula(p1);
		
		//this.iPersonaService.agregar(c1);
//		this.cedulaService.elminar(1);
//		
//		Persona cBuscar=this.iPersonaService.buscar(2);
//		
//		cBuscar.setNombre("Fernando");
//		
//		this.iPersonaService.modificar(cBuscar);
		
		
		Estudiante e1 = new Estudiante();
		Estudiante e2 = new Estudiante();
		
		List<Estudiante> estudiantes =new ArrayList<>();
		estudiantes.add(e1);
		estudiantes.add(e2);
		
		Curso c1 = new Curso();
		Estudiante est = new Estudiante();
		c1.setNumeroCurso("A003");
		c1.setEstudiantes(estudiantes);
		
		est.setNombre("Bryan");
		est.setApellido("Mullo");
		est.setCurso(c1);
		//this.cursoService.agregar(c1);
		//this.estudianteService.agregar(est);
		
		Curso actualizar = this.cursoService.buscar(1);
		Estudiante est1 = new Estudiante();
		actualizar.setEstudiantes(estudiantes);
		actualizar.setNumeroCurso("B002");
		
		est1.setCurso(actualizar);
		this.estudianteService.agregar(est1);
		Curso buscar = this.cursoService.buscar(1);
		System.out.println(buscar.getNumeroCurso());
		
		List<Estudiante> estu = buscar.getEstudiantes();
		
		for(var var : estu)
{
	System.out.println(var);
}
		
		Estudiante buscarE = this.estudianteService.buscar(6);
			this.estudianteService.elminar(7);
			this.cursoService.elminar(3);
			this.cursoService.modificar(actualizar);
		
	}

}
