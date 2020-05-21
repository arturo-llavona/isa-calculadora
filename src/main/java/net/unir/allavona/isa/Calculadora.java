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
	public static Double raizCuadrada(Integer a) {
		/**
		 * Algoritmo:
		 * 
		 * To calculate sqrt(S).
		 * 
		 * Step 1: Calculate nearest perfect square to S i.e (N2).
		 * Step 2: Calculate d = S - (N2)
		 * Step 3: Calculate P = d/(2*N)
		 * Step 4: Calculate A = N + P
		 * Step 5: Sqrt(S) will be nearly equal to A - (P2/2*A)
		 */
		
		// En caso de estar intentando hacer la raiz cuadrada de un número negativo, devolvemos null.
		if ( a < 0 ) {
			return null;
		}
		
		float s = a.floatValue();
		int pSq = 0;
		int N = 0;

		for (int i = (int) (s); i > 0; i--) {
			for (int j = 1; j < i; j++) {
				if (j * j == i) {
					pSq = i;
					N = j;
					break;
				}
			}
			if (pSq > 0)
				break;
		}

		float d = s - pSq;
		float P = d / (2.0f * N);
		float A = N + P;
		float sqrt_of_s = A - ((P * P) / (2.0f * A));		
		return Math.round(sqrt_of_s * 1000000.0) / 1000000.0;
	}
}
