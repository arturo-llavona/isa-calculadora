package net.unir.allavona.isa;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraHelperTest {
	
	@Before
	public void init() {
		
	}
	
	@Test
	public void testCalcular() {
		// Comprobamos que entiende operaciones de positivos
		assertTrue("10".equals(CalculadoraHelper.calcular("5 + 5")));
		
		// Comprobamos que entiende operaciones de un positivo y un negativo
		assertTrue("2".equals(CalculadoraHelper.calcular("5 + -3")));
		
		// Comprobamos que entiende operaciones de un negativo y un positivo
		assertTrue("-2".equals(CalculadoraHelper.calcular("-5 + 3")));		

		// Comprobamos que entiende operaciones de dos negativos
		assertTrue("-8".equals(CalculadoraHelper.calcular("-5 + -3")));	

		// Comprobamos que entiende raices cuadradas
		assertTrue("3.0".equals(CalculadoraHelper.calcular("raiz 9")));		
		
		// Comprobamos que no permite hacer operaciones con decimales
		assertTrue(Constantes.ERROR_ENTRADA_NO_RECONOCIDA.equals(CalculadoraHelper.calcular("2.5 + 2")));
		
		assertTrue(Constantes.ERROR_ENTRADA_NO_RECONOCIDA.equals(CalculadoraHelper.calcular("a + 2")));
				
		assertTrue(Constantes.ERROR_ENTRADA_NO_RECONOCIDA.equals(CalculadoraHelper.calcular("2 2")));
		
	}
}
