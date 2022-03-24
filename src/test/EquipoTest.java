package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.com.model.Equipo;

class EquipoTest {

	@Test
	void testEquipoVacioAlPrincipio() {
		
		Equipo equipoA = new Equipo();
		assertEquals(equipoA.getAlumnos().size, 0);
	}
	
//	@Test
//	void testAddAlumnoAtributosAumentaTamanio() {
//		
//		Equipo equipoA = new Equipo();
//		equipoA.addAlumno("Jose", "54756847W")
//
//	}

}
