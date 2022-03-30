package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.com.model.Alumno;
import main.java.com.model.AlumnoException;
import main.java.com.model.Equipo;

class EquipoTest {

	@Test
	void testEquipoVacioAlPrincipio() {
		
		Equipo equipoA = new Equipo();
		assertEquals(equipoA.getListaAlumno().size(), 0);
	}
	
	@Test
	void testAddAlumnoAtributosAumentaTamanio() {
		
		Equipo equipoA = new Equipo();
		equipoA.addAlumno("Jose", "54756847W");
		
		assertEquals(equipoA.getListaAlumno().size(), 1);

	}
	
	@Test
	void testAddAlumnoClaseAumentaTamanio() {
		Equipo equipoA = new Equipo();
		Alumno alumno = new Alumno("Jose", "54756847W");
		equipoA.addAlumno(alumno);
		
		assertEquals(equipoA.getListaAlumno().size(), 1);

		
	}
	
	@Test
	void lanzoExceptionConAlumnoRepetido() {
		try {
			
			Equipo equipoA = new Equipo();
			equipoA.addAlumno("Jose", "54756847W");
			equipoA.addAlumno("Jose", "54756847W");

			assert(false);
		}catch(AlumnoException e){
			
			assert(true);
		}
		
	}
	
	@Test
	void testDeleteAlumnoAtributosDisminuyeTamanio() {
		
		Equipo equipoA = new Equipo();
		Alumno al1=new Alumno("Antonio","2222323123w");
		equipoA.addAlumno(al1);
		equipoA.borrarAlumnoConDniyNombre("Antonio","2222323123w");
		
		assertEquals(equipoA.getListaAlumno().size(), 0);

	}
	
	@Test
	void testDeleteAlumnoClaseDisminuyeTamanio() {
		Equipo equipoA = new Equipo();
		Alumno alumno = new Alumno("Jose", "54756847W");
		equipoA.addAlumno(alumno);
		equipoA.borrarAlumno(alumno);
		
		
		assertEquals(equipoA.getListaAlumno().size(), 0);
		
	
	
	}
	
	@Test
	void testSiEstaAlumnoEnLista() {
		Equipo equipo=new Equipo();
		Alumno al1 = new Alumno("Joseba","28896792Z");
		equipo.getListaAlumno().add(al1);
		
		assertEquals(equipo.comprobarAlumno(al1),al1);
	}
	
	@Test
	void testNoEstaAlumnoEnLista() {
		Equipo equipo=new Equipo();
		Alumno al1 = new Alumno("Joseba","28896792Z");
		
		
		assertEquals(equipo.comprobarAlumno(al1),null);
	}
	
	@Test
	void testHayAlumnoEnInterseccion() {
		Equipo equipo1=new Equipo();
		Equipo equipo2=new Equipo();
		Alumno al1 = new Alumno("Joseba","28896792Z");
		Alumno al2 = new Alumno("Manuel","54896787M");
		equipo1.getListaAlumno().add(al1);
		equipo1.getListaAlumno().add(al2);
		equipo2.getListaAlumno().add(al1);

		Equipo equipo3= equipo1.interseccionEquipos(equipo2);
		
		
		assertEquals(equipo3.getListaAlumno().size(),1);
		assertEquals(equipo3.getListaAlumno().get(0), al1);
	}

	@Test
	void testNoHayAlumnoEnInterseccion() {
		Equipo equipo1=new Equipo();
		Equipo equipo2=new Equipo();
		Alumno al1 = new Alumno("Joseba","28896792Z");
		Alumno al2 = new Alumno("Manuel","54896787M");
		equipo1.getListaAlumno().add(al1);
		equipo2.getListaAlumno().add(al2);

		Equipo equipo3= equipo1.interseccionEquipos(equipo2);
		
		
		assertEquals(equipo3.getListaAlumno().size(),0);
	}
	

}
