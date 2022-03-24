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
			//throw new Exception();
			resultado = false;
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
					//throw new Exception();
					resultado = false;
				}else {
					
					listaAlumno.add(al);
					resultado = true;
				}
		return resultado;
		
	
		
		
	}
	
	


	@Override
	public String toString() {
		return "Equipo con nombre : " + nombre + ", con alumnos : " + listaAlumno.toString() ;
	}


	public String getNombre() {
		return nombre;
	}

	
	/*
	 * Metodo que se usará en los tests 
	 */
	public static List<Alumno> generarLista () {
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(new Alumno("Hermenegildo", "21454718Z"));
		listaAlumnos.add(new Alumno("Jose", "77484741A"));
		listaAlumnos.add(new Alumno("Joseba", "66582487F"));
		listaAlumnos.add(new Alumno("Antonio", "47154221D"));
		listaAlumnos.add(new Alumno("Pilar", "47412548J"));
		listaAlumnos.add(new Alumno("Vicente", "74586318P"));
		listaAlumnos.add(new Alumno("Alejandra", "65899856T"));		
		
		
		return listaAlumnos;
		
		
	}
}
