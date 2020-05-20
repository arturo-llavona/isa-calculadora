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
		assertEquals(new Integer(7), calculadora.suma(5, 2));
		
		// Comprobamos la propiedad conmutativa
		assertEquals(calculadora.suma(5, 2), calculadora.suma(2, 5));
		
		// Comprobamos la suma de un número positivo con otro negativo cuyo resultado es positivo
		assertEquals(new Integer(2), calculadora.suma(5, -3));
		
		// Comprobamos la suma de un número positivo con otro negativo cuyo resultado es negativo
		assertEquals(new Integer(-2), calculadora.suma(-5, 3));
		
		// Comprobamos la suma de dos números negativos
		assertEquals(new Integer(-8), calculadora.suma(-5, -3));			
	}
	
	@Test
	public void testResta() {
		// Comprobamos la resta básica
		assertEquals(new Integer(3), calculadora.resta(5, 2));
				
		// Comprobamos la resta de un número positivo con otro negativo cuyo resultado es positivo
		assertEquals(new Integer(8), calculadora.resta(5, -3));
				
		// Comprobamos la reta de dos números negativos
		assertEquals(new Integer(-2), calculadora.resta(-5, -3));			
	}
	
	@Test
	public void testMultiplicacion() {
		// Comprobamos la multiplicación básica
		assertEquals(new Integer(10), calculadora.multiplica(5, 2));		
		
		// Comprobamos que la multiplicación por 0 da 0
		assertEquals(new Integer(0), calculadora.multiplica(5, 0));
		
		// Comprobamos que la multiplicación por 1 da el mismo número
		assertEquals(new Integer(5), calculadora.multiplica(5, 1));

		// Comprobamos la multiplicación de un número positivo por uno negativo
		assertEquals(new Integer(-15), calculadora.multiplica(-5, 3));		

		// Comprobamos la multiplicación de dos números negativos
		assertEquals(new Integer(15), calculadora.multiplica(-5, -3));		
		
		// Comprobamos la propiedad conmutativa
		assertEquals(calculadora.multiplica(3, 5), calculadora.multiplica(5, 3));		
	}
	
	@Test
	public void testDivision() {
		// Comprobamos la división exacta
		assertEquals(new Double(2), calculadora.divide(4, 2));
		
		// Comprobamos la división con decimales
		assertEquals(new Double(2.5), calculadora.divide(5, 2));
		
		// Comprobamos la divisón por cero
		assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), calculadora.divide(5, 0));
		
		// Comprobamos la división con decimales, de un número positivo con otro negativo
		assertEquals(new Double(-2.5), calculadora.divide(5, -2));		

		// Comprobamos la división con decimales, de dos números positivos
		assertEquals(new Double(2.5), calculadora.divide(-5, -2));				
		
	}
	
	@Test
	public void testRaizCuadrada() {
		
	}
}
