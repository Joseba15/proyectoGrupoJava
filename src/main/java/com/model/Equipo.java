package main.java.com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Equipo<T> {

	private String nombre;
	private List<T> listaAlumno= new ArrayList<T>();
	
	


	public Equipo() {}


	public Equipo(String nombre, List<T> listaAlumno) {
		this.nombre = nombre;
		this.listaAlumno = listaAlumno;
	}
	
	
	public boolean addAlumno (T alumn) {
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
			throw new AlumnoException("El alumno ya existe");
		}else {
					
			listaAlumno.add((T) al);
			resultado = true;
		}
		return resultado;
		
	}
	public boolean borrarAlumno(T alumnoNuevo) {
		boolean existeAlumno=false;
		if(listaAlumno.contains(alumnoNuevo)) {
			listaAlumno.remove(alumnoNuevo);
			existeAlumno=true;
		}else {
			throw new AlumnoException("El alumno no existe");
		}
		
		return existeAlumno;
	}
	
	public boolean borrarAlumnoConDniyNombre(String nombre, String dni) {
		boolean existeAlumno=false;
		Alumno al1=new Alumno(nombre,dni);
		if(listaAlumno.contains((T)al1)) {
			listaAlumno.remove((T)al1);
			existeAlumno=true;
		}else {
			throw new AlumnoException("El alumno no existe");
		}
		
		return existeAlumno;
	}
	
	public Set<T> unirmeEquipos(T equipoB){
		
		Set<T> conjuntoNuevo=new HashSet<T>();
		conjuntoNuevo.addAll(listaAlumno);
		conjuntoNuevo.add(equipoB);
		return conjuntoNuevo;
		
		
	}
	
	public T comprobarAlumno (T al) {
		if (!listaAlumno.contains(al)) {
			al=null;
		}	
		return al;
	}
	
	public Equipo interseccionEquipos (Equipo otroEquipo) {
		 List<T> listaConjunta=new ArrayList<T>();
		 
		for (int i = 0; i < this.listaAlumno.size(); i++) {
			if (otroEquipo.getListaAlumno().contains(this.listaAlumno.get(i))) {
				listaConjunta.add(this.listaAlumno.get(i));
			}
		}
		Equipo equipoInter = new Equipo("equipoInter",listaConjunta);
		
		return equipoInter ;
	}
	
	
	
	public List<T> getListaAlumno() {
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
