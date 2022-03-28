package main.java.com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Equipo {

	private String nombre;
	private List<Alumno> listaAlumno= new ArrayList<Alumno>();
	
	


	public Equipo() {}


	public Equipo(String nombre, List<Alumno> listaAlumno) {
		this.nombre = nombre;
		this.listaAlumno = listaAlumno;
	}
	
	
	public boolean addAlumno (Alumno alumn) {
		boolean resultado = false;
		if (listaAlumno.contains(alumn)) {
			throw new AlumnoException("El alumno ya existe");
		}else {
			
			listaAlumno.add(alumn);
			resultado = true;
		}
		return resultado;
		
		
	}
	public boolean addAlumno (String nombre, String dni) {
		Alumno al = new Alumno(nombre, dni);
		
		boolean resultado = false;
				if (listaAlumno.contains(al)) {
					throw new AlumnoException();
				}else {
					
					listaAlumno.add(al);
					resultado = true;
				}
		return resultado;
		
	}
	
	
	
	public List<Alumno> getListaAlumno() {
		return listaAlumno;
	}
	
	public void MostrarListaAlumnos() {
		System.out.println(listaAlumno);
	}


	@Override
	public String toString() {
		return "Equipo con nombre : " + nombre + ", con alumnos : " + listaAlumno.toString() ;
	}


	public String getNombre() {
		return nombre;
	}

	
}
