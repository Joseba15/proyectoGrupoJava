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
	void testUnionDeEquipos() {
		Equipo equipoA = new Equipo();
		Alumno al1=new Alumno("Antonio","2222323123w");
		Alumno al2=new Alumno("Joseba","2227323123w");
		Alumno al3=new Alumno("Pilar","2227923123w");
		Equipo equipoB = new Equipo();
		equipoA.addAlumno(al1);
		equipoA.addAlumno(al2);
		equipoB.addAlumno(al1);
		equipoB.addAlumno(al3);
		
		equipoA.unirmeEquipos(equipoB);
		
		assertEquals(equipoA.unirmeEquipos(equipoB).size(),3 );
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
	
	
	
	//############################################################
	
	@Test
	void testAddNumeroAtributosAumentaTamanio() {
		
		Equipo equipoA = new Equipo();
		equipoA.addAlumno(1);
		
		assertEquals(equipoA.getListaAlumno().size(), 1);

	}
	
	
	
	@Test
	void lanzoExceptionConEnteroRepetido() {
		try {
			
			Equipo equipoA = new Equipo();
			equipoA.addAlumno(1);
			equipoA.addAlumno(1);

			assert(false);
		}catch(AlumnoException e){
			
			assert(true);
		}
		
	}
	
	
	
	@Test
	void testDeleteNumeroClaseDisminuyeTamanio() {
		Equipo equipoA = new Equipo();		
		Integer al = 2; 
		
		equipoA.addAlumno(al);
		equipoA.borrarAlumno(al);
		
		
		assertEquals(equipoA.getListaAlumno().size(), 0);
		
	
	
	}
	
	@Test
	void testSiEstaEnteroEnLista() {
		Equipo equipo=new Equipo();
		Integer al1 = 1;
		equipo.getListaAlumno().add(al1);
		
		assertEquals(equipo.comprobarAlumno(al1),al1);
	}
	
	@Test
	void testNoEstaEnteroEnLista() {
		Equipo equipo=new Equipo();
		Integer al1 = 2;
		
		
		assertEquals(equipo.comprobarAlumno(al1),null);
	}
	
	@Test
	void testHayEnteroEnInterseccion() {
		Equipo equipo1=new Equipo();
		Equipo equipo2=new Equipo();
		Integer al1 = 1;
		Integer al2 = 2;
		equipo1.getListaAlumno().add(al1);
		equipo1.getListaAlumno().add(al2);
		equipo2.getListaAlumno().add(al1);

		Equipo equipo3= equipo1.interseccionEquipos(equipo2);
		
		
		assertEquals(equipo3.getListaAlumno().size(),1);
		assertEquals(equipo3.getListaAlumno().get(0), al1);
	}

	@Test
	void testNoHayEnteroEnInterseccion() {
		Equipo equipo1=new Equipo();
		Equipo equipo2=new Equipo();
		Integer al1 = 5;
		Integer al2 = 6;
		equipo1.getListaAlumno().add(al1);
		equipo2.getListaAlumno().add(al2);

		Equipo equipo3= equipo1.interseccionEquipos(equipo2);
		
		
		assertEquals(equipo3.getListaAlumno().size(),0);
	}
	
	

}
