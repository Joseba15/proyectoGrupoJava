package main.java.com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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
			throw new AlumnoException("El alumno ya existe");
		}else {
					
			listaAlumno.add(al);
			resultado = true;
		}
		return resultado;
		
	}
	public boolean borrarAlumno(Alumno alumnoNuevo) {
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
		if(listaAlumno.contains(al1)) {
			listaAlumno.remove(al1);
			existeAlumno=true;
		}else {
			throw new AlumnoException("El alumno no existe");
		}
		
		return existeAlumno;
	}
	
	public Set<Alumno> unirmeEquipos(List<Alumno> grupoUnido){
		
		Set<Alumno> conjuntoNuevo=new HashSet<Alumno>();
		conjuntoNuevo.addAll(listaAlumno);
		conjuntoNuevo.addAll(grupoUnido);
		return conjuntoNuevo;
		
		
	}
	
	public Alumno comprobarAlumno (Alumno al) {
		if (!listaAlumno.contains(al)) {
			al=null;
		}	
		return al;
	}
	
	public Equipo interseccionEquipos (Equipo otroEquipo) {
		 List<Alumno> listaConjunta=new ArrayList<Alumno>();
		 
		for (int i = 0; i < this.listaAlumno.size(); i++) {
			if (otroEquipo.getListaAlumno().contains(this.listaAlumno.get(i))) {
				listaConjunta.add(this.listaAlumno.get(i));
			}
		}
		Equipo equipoInter = new Equipo("equipoInter",listaConjunta);
		
		return equipoInter ;
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
