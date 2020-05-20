package net.unir.allavona.isa;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	public static Calculadora calculadora;
	
	@Before
	public void init() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void testSuma() {
		// Comprobamos la suma básica
		assertEquals(Integer.valueOf(7), calculadora.suma(5, 2));
		
		// Comprobamos la propiedad conmutativa
		Integer a = calculadora.suma(5, 2);
		Integer b = calculadora.suma(2, 5);
		
		assertEquals(a, b);		
	}
	
	@Test
	public void testResta() {
		
	}
	
	@Test
	public void testMultiplicacion() {
		
	}
	
	@Test
	public void testDivision() {
		
	}
	
	@Test
	public void testRaizCuadrada() {
		
	}
}
