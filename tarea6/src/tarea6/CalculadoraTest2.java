package tarea6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

	@Before
    public void setUp() {
        System.out.println("---begin test---");
    }
     
    @Test
    public void test() {
        Calculadora calculate = new Calculadora();
        assertEquals(8, calculate.suma(3, 5));
        System.out.println("test case");
    }
     
    @After
    public void tearDown() {
        System.out.println("---end test---");
    }

}
