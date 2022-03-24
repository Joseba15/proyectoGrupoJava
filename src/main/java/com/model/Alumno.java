package main.java.com.model;

import java.util.Objects;

public class Alumno {

	private String nombre;
	private String dni;
	
	
	public Alumno() {}


	public Alumno(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDni() {
		return dni;
	}


	@Override
	public String toString() {
		return "Alumno con nombre : " + nombre + " y dni : " + dni +"\n " ;
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}


	@Override
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		if (obj !=null) {
			
			Alumno other = (Alumno) obj;
			sonIguales=this.dni.equalsIgnoreCase(other.getDni());
		}
		
	
		return sonIguales;
	}
	
	
	
	
	
	
	
	
}
