package net.unir.allavona.isa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculadoraHelper {
	private static String PATTERN_2OP = "^\\s*(\\-?\\d+)\\s*(\\+|-|:|/|\\*)\\s*(\\-?\\d+)\\s*";
	private static String PATTERN_RAIZ = "^\\s*raiz\\s*(\\-?\\d+)\\s*";
	
	public static String calcular(String cadena) {
		String result = "";
		Pattern p = Pattern.compile(PATTERN_2OP);
		Matcher m = p.matcher(cadena);
		
		if ( m.find() ) {
			String n1 = m.group(1);
			String op = m.group(2);
			String n2 = m.group(3);
			
			switch ( op ) {
				case "+" :
					result = String.valueOf(Calculadora.suma(Integer.valueOf(n1), Integer.valueOf(n2)));
					break;
				case "-" :
					result = String.valueOf(Calculadora.resta(Integer.valueOf(n1), Integer.valueOf(n2)));
					break;
				case "*" :
					result = String.valueOf(Calculadora.multiplica(Integer.valueOf(n1), Integer.valueOf(n2)));
					break;
				case ":":
				case "/":
					result = String.valueOf(Calculadora.divide(Integer.valueOf(n1), Integer.valueOf(n2)));
					break;
				default :
					result = Constantes.ERROR_ENTRADA_NO_RECONOCIDA;
			}						
		} else {
			p = Pattern.compile(PATTERN_RAIZ);
			m = p.matcher(cadena);
			
			if ( m.find() ) {
				String n = m.group(1);
				result = String.valueOf(Calculadora.raizCuadrada(Integer.valueOf(n)));
			} else {
				result = Constantes.ERROR_ENTRADA_NO_RECONOCIDA;
			}
		}			
		return result;
	}
}
