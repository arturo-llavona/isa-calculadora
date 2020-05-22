package net.unir.allavona.isa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	@Before
	public void init() {
		
	}
	
	@Test
	public void testSuma() {
		// Comprobamos la suma básica
		assertEquals(new Integer(7), Calculadora.suma(5, 2));
		
		// Comprobamos la propiedad conmutativa
		assertEquals(Calculadora.suma(5, 2), Calculadora.suma(2, 5));
		
		// Comprobamos la suma de un número positivo con otro negativo cuyo resultado es positivo
		assertEquals(new Integer(2), Calculadora.suma(5, -3));
		
		// Comprobamos la suma de un número positivo con otro negativo cuyo resultado es negativo
		assertEquals(new Integer(-2), Calculadora.suma(-5, 3));
		
		// Comprobamos la suma de dos números negativos
		assertEquals(new Integer(-8), Calculadora.suma(-5, -3));			
	}
	
	@Test
	public void testResta() {
		// Comprobamos la resta básica
		assertEquals(new Integer(3), Calculadora.resta(5, 2));
				
		// Comprobamos la resta de un número positivo con otro negativo cuyo resultado es positivo
		assertEquals(new Integer(8), Calculadora.resta(5, -3));
				
		// Comprobamos la reta de dos números negativos
		assertEquals(new Integer(-2), Calculadora.resta(-5, -3));			
	}
	
	@Test
	public void testMultiplicacion() {
		// Comprobamos la multiplicación básica
		assertEquals(new Integer(10), Calculadora.multiplica(5, 2));		
		
		// Comprobamos que la multiplicación por 0 da 0
		assertEquals(new Integer(0), Calculadora.multiplica(5, 0));
		
		// Comprobamos que la multiplicación por 1 da el mismo número
		assertEquals(new Integer(5), Calculadora.multiplica(5, 1));

		// Comprobamos la multiplicación de un número positivo por uno negativo
		assertEquals(new Integer(-15), Calculadora.multiplica(-5, 3));		

		// Comprobamos la multiplicación de dos números negativos
		assertEquals(new Integer(15), Calculadora.multiplica(-5, -3));		
		
		// Comprobamos la propiedad conmutativa
		assertEquals(Calculadora.multiplica(3, 5), Calculadora.multiplica(5, 3));		
	}
	
	@Test
	public void testDivision() {
		// Comprobamos la división exacta
		assertEquals(new Double(2), Calculadora.divide(4, 2));
		
		// Comprobamos la división con decimales
		assertEquals(new Double(2.5), Calculadora.divide(5, 2));
		
		// Comprobamos la divisón por cero
		assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), Calculadora.divide(5, 0));
		
		// Comprobamos la división con decimales, de un número positivo con otro negativo
		assertEquals(new Double(-2.5), Calculadora.divide(5, -2));		

		// Comprobamos la división con decimales, de dos números positivos
		assertEquals(new Double(2.5), Calculadora.divide(-5, -2));				
		
	}
	
	@Test
	public void testRaizCuadrada() {
		// Comprobamos la raiz cuadrada básica
		assertEquals(new Double(3), Calculadora.raizCuadrada(9));
		
		// Comprobamos la raiz cuadrada que da de resultado un decimal. Como la precisión debe ser mayor a 10-5 supongo 6 decimales.
		assertEquals(new Double(2.236068), Calculadora.raizCuadrada(5));
		
		// Comprobamos que la raiz cuadrada de un número negativo no se intenta calcular y devuelve null
		assertNull(Calculadora.raizCuadrada(-5));
	}
}
