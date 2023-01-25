package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2BmApplication implements CommandLineRunner{

	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;
	
	
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
		
		
		
		
		Habitacion A1=new Habitacion();
		Habitacion A2=new Habitacion();		
		
		
		List<Habitacion> habitaciones =new ArrayList<>();
		habitaciones.add(A1);
		habitaciones.add(A2);
		
		
		Hotel hotel=new Hotel();
		hotel.setDireccion("Esmeraldas");
		hotel.setNombre("Casa Blanca");
		hotel.setHabitaciones(habitaciones);
		//this.hotelService.agregar(hotel);
		
		A1.setHotel(hotel);
		A1.setNumero("A1");
	    
		
		Hotel actulizar=this.hotelService.encontrar(1);	
		Habitacion hab = new Habitacion();
		actulizar.setDireccion("Salinas");
		actulizar.setHabitaciones(habitaciones);
		actulizar.setNombre("Casa Blanca");
		
		hab.setHotel(actulizar);
		hab.setNumero("A2");
		//this.habitacionService.agregar(hab);
		
		//Habitacion buscar = this.habitacionService.encontrar(10);
		//this.habitacionService.borrar(10);
//		this.hotelService.borrar(2);
//		this.hotelService.modificar(actulizar);
		
		Hotel buscar = this.hotelService.encontrar(1);
		System.out.println(buscar.getNombre());
		
		
	    List<Habitacion> habita = buscar.getHabitaciones();

	for ( var var : habita) 
		{ 
	   System.out.println(var);		}

		
	}

}
