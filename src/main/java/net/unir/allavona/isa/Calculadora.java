	package net.unir.allavona.isa;

public class Calculadora {
		
	public static Integer suma(Integer a, Integer b ) {
		return a+b;
	}
	public static Integer resta(Integer a, Integer b) {
		return a-b;
	}
	public static Integer multiplica(Integer a, Integer b) {
		return a*b;
	}
	public static Double divide(Integer a, Integer b) {
		return (double) a / (double) b;
	}
	
	public static float baskhali(float n, float aprox) {
		float d = n - (aprox*aprox);
		float P = d / (aprox*2);
		float A = aprox + P;
		return A - (P*P) / (A*2);
	}
	
	public static Double raizCuadrada(Integer a) {
		if ( a <= 0 ) {
			return null;
		}
		int n = 1;
		for ( int i = 1 ; i < a ; i++ ) {
			if ( i * i > a ) {
				n = i;
				break;
			}
		}		
		float b = baskhali(a, n);
		b = baskhali(a, b);
		return Math.round(b * 1000000.0) / 1000000.0;
	}
}
