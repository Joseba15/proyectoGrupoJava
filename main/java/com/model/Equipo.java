package main.java.com.model;

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


	@Override
	public String toString() {
		return "Equipo con nombre : " + nombre + ", con alumnos : " + listaAlumno.toString() ;
	}


	public String getNombre() {
		return nombre;
	}

	
}
