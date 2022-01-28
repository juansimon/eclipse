package tarea6;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest3 {

	Calculadora calculate = new Calculadora();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("---Inicio de las pruebas---");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		 System.out.println("---Final de las pruebas---");
	}

	@Test
	void testCalculadora() {
		
		 System.out.println("Casos de prueba de todos los m�todos");
	     assertEquals(8, calculate.suma(3, 5));
	     assertEquals(-2, calculate.resta(3, 5));
	     assertEquals(15, calculate.multiplica(3, 5));
	     assertEquals(3, calculate.divide(15, 5));
	}
	
	@Test
	void testSuma() {
		System.out.println("Casos de prueba del m�todo suma");
		assertEquals(2,calculate.suma(1,1));
		assertNotEquals(3,calculate.suma(1,1));
	}
	
	@Test
	public void testDivision1() {
		System.out.println("Casos de prueba del m�todo divisi�n");
		  try {
		    assertEquals(0, calculate.divide(15, 0));
		  } catch ( Exception e) {
			System.out.println("Divisi�n por 0 producida");	    
		  }
		}

}
