package tarea6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calc=new Calculadora();
	
	@Test
	void testSuma() {
		
		assertEquals(2,calc.suma(1,1));
		assertEquals(3,calc.suma(1,1));
	}

	@Test
	void testResta() {
		fail("Not yet implemented");
	}

	@Test
	void testMultiplica() {
		fail("Not yet implemented");
	}

	@Test
	void testDivide() {
		fail("Not yet implemented");
	}

}
