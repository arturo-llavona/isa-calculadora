package net.unir.allavona.isa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraMain {
    public static void main(String[] args) throws IOException {
    	printMenu();
    	int returned = 0;
    	do {
    		returned = askOperation();
    	} while ( returned != -1 );
    	System.out.println("Fin calculadora");
    }
    public static void printMenu() {
    	System.out.println("Calculadora");
    	System.out.println("-----------------------------------------");
    	System.out.println("Opciones disponibles: ");
    	System.out.println("\t - Suma (Ejemplo: 5 + 5)");
    	System.out.println("\t - Resta (Ejemplo: 5 - 5)");
    	System.out.println("\t - División (Ejemplo: 5 / 5)");
    	System.out.println("\t - Multiplicación (Ejemplo: 5 * 5)");
    	System.out.println("\t - Raiz cuadrada (Ejemplo: raiz 9)");
    	System.out.println("\t - Salir");
    	
    }
    public static int askOperation() throws IOException  {
    	System.out.print("Introduce la operación: ");
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String operacion = br.readLine();
    	if ( operacion.equalsIgnoreCase("SALIR") ) {
    		return -1;
    	} else {
    		System.out.println("Resultado: " + CalculadoraHelper.calcular(operacion));
    		return 0;
    	}
    }
}

