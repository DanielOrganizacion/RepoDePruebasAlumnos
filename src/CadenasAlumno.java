/**
 * 
 */

public class CadenasAlumno {
	/**
	 * Método 1 : Bertelli Aguilera, Daniel
	 * 
	 */

	public boolean sonIguales(String cadena1, String cadena2) {

		boolean sonIguales = false;

		if (cadena1.length() == cadena2.length()) {
			for (int i = 0; i < cadena1.length(); i++) {
				if (cadena1.charAt(i) != cadena2.charAt(i)) {
					sonIguales = false;
					break;
				} else
					sonIguales = true;
			}

		}

		else
			sonIguales = false;

		return sonIguales;
	}

	/**
	 * Método 2 Briz Ortega, Félix José

	 * 
	 * 
	 */
	public boolean esMayor(String cadena1, String cadena2) {

		boolean esMayor = false;

		if (sonIguales(cadena1, cadena2))
			esMayor = true;
		else {
			for (int i = 0; i < cadena1.length(); i++) {
				if (cadena1.charAt(i) < cadena2.charAt(i)) {
					esMayor = true;
					break;
				}
			}
		}
		return esMayor;
	}

	/**
	 * Método 3 Cantero Fernández, Jesús
	 * 
	 * 
	 */
	public boolean esMenor(String cadena1, String cadena2) {

		boolean esMenor = false;

		if (sonIguales(cadena1, cadena2))
			esMenor = true;
		else {
			for (int i = 0; i < cadena1.length(); i++) {
				if (cadena1.charAt(i) > cadena2.charAt(i)) {
					esMenor = true;
					break;
				}
			}
		}
		return esMenor;
	}

	/**
	 * Método 4 Cortés Pérez-Cejuela, Brian
	 * 
	 * 
	 **/
	public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2) {

		boolean sonIguales = true;
		char c1, c2;

		if (cadena1.length() == cadena2.length()) {
			for (int i = 0; i < cadena1.length(); i++) {
				c1 = cadena1.charAt(i);
				c2 = cadena2.charAt(i);
				if (c1 >= 'a' && c1 <= 'z')
					c1 -= 32;
				if (c2 >= 'a' && c2 <= 'z')
					c2 -= 32;
				if (c1 != c2) {
					sonIguales = false;
					break;
				}
			}
		} else
			sonIguales = false;
		return sonIguales;
	}

	/**
	 * Método 5 Díaz García, Blas
	 * 
	 * 
	 */
	public String reemplazaTodos(String cadena, String regla, String cambio) {

		String nuevaCadena = "";
		String temporal = "";
		int lonRegla = regla.length();
		int i = 0;

		while (i < cadena.length()) {
			temporal = extraerSubstring(cadena, i, i + lonRegla);
			if (sonIguales(temporal, regla)) {
				nuevaCadena += cambio;
				i += lonRegla;
			} else {
				nuevaCadena += String.valueOf(cadena.charAt(i));
				i++;
			}
		}
		return nuevaCadena;
	}

	/**
	 * Método 6 García Negrillo, Claudia
	 * 
	 * 
	 */
	public String reemplazaPrimero(String cadena, String regla, String cambio) {

		String nuevaCadena = "";
		String temporal = "";
		int lonRegla = regla.length();
		int i = 0;
		boolean encontrado = false;

		while (i < cadena.length()) {
			if (!encontrado) {
				temporal = extraerSubstring(cadena, i, i + lonRegla);
				if (sonIguales(temporal, regla)) {
					nuevaCadena += cambio;
					i += lonRegla;
					for (; i < cadena.length(); i++) {
						nuevaCadena += String.valueOf(cadena.charAt(i));
					}
					encontrado = true;
				} else {
					nuevaCadena += String.valueOf(cadena.charAt(i));
					i++;
				}
			}
		}
		return nuevaCadena;
	}

	/**
	 * Método González Real, Alejandro
	 * 
	 * 
	 */
	public String quitaEspacios(String cadena) {

		String nuevaCadena = "";
		int delante = 0;
		int detras = 0;

		while (cadena.charAt(delante) == ' ') {
			delante++;
		}

		while (cadena.charAt((cadena.length() - 1) - detras) == ' ') {
			detras++;
		}

		for (int i = 0; i < (cadena.length()) - detras; i++) {
			if (i >= delante)
				nuevaCadena += cadena.charAt(i);
		}

		return nuevaCadena;
	}

	/**
	 * Método Guerrero Pérez, Luis
	 * 
	 * 
	 */
	public String convertirMayusculas(String cadena) {

		String nuevaCadena = "";
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z') {
				char c = cadena.charAt(i);
				c -= 32;
				nuevaCadena += c;
			} else
				nuevaCadena += cadena.charAt(i);
		}
		return nuevaCadena;
	}

	/**
	 * Método López Cózar, Eduardo
	 * 
	 * 
	 */
	public String convertirMinusculas(String cadena) {

		String nuevaCadena = "";
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z') {
				char c = cadena.charAt(i);
				c += 32;
				nuevaCadena += c;

			} else
				nuevaCadena += cadena.charAt(i);
		}
		return nuevaCadena;

	}

	/**
	 * Método 8 no
	 * 
	 */
	public long longitudCadena(String cadena) {

		char[] c;

		c = cadena.toCharArray();
		return (long) c.length;
	}

	/**
	 * Método 9 Montes López, Laura
	 * 
	 */
	public boolean empiezaCon(String cadena, String prefijo) {

		boolean empiezaCon = false;
		int lonPrefijo;
		String aux = "";

		lonPrefijo = prefijo.length();

		if (lonPrefijo > cadena.length())
			System.out.println("El prefijo es demasiado largo");

		else {
			for (int i = 0; i < lonPrefijo; i++) {
				aux += cadena.charAt(i);
			}

			if (sonIguales(prefijo, aux))
				empiezaCon = true;
		}

		return empiezaCon;
	}

	/**
	 * Método 10 Moral García, Luo del
	 * 
	 * 
	 */
	public boolean acabaEn(String cadena, String sufijo) {

		boolean acabaEn = false;
		int lonSufijo;
		String aux = "";

		lonSufijo = sufijo.length();

		if (lonSufijo > cadena.length())
			System.out.println("El prefijo es demasiado largo");

		else {
			for (int i = cadena.length() - lonSufijo; i < cadena.length(); i++) {
				aux += cadena.charAt(i);
			}

			if (sonIguales(sufijo, aux))
				acabaEn = true;
		}

		return acabaEn;
	}

	/**
	 * Método 11 Moral Liébana, David
	 * 
	 * 
	 */
	public long posicionPrimeraCadena(String cadena, String letra) {

		int posicion = -1;
		int lonLetra;
		String aux;

		lonLetra = letra.length();

		for (int i = 0; i < cadena.length() - lonLetra; i++) {
			aux = extraerSubstring(cadena, i, i + lonLetra);
			if (sonIguales(aux, letra)) {
				posicion = i;
				break;
			}
		}
		return (long) posicion;
	}

	/**
	 * Método 12 Moral Rama, Hugo
	 * 
	 * 
	 */
	public String extraerSubstring(String cadena, int posicionInicio) {

		String nuevaCadena = "";

		if (posicionInicio < 0 || posicionInicio >= cadena.length()) {
			System.out.println("Posición de inicio incorreta");
			return cadena;
		}

		else {
			for (int i = posicionInicio; i < cadena.length(); i++) {
				nuevaCadena += String.valueOf(cadena.charAt(i));
			}
			return nuevaCadena;
		}
	}

	/**
	 * Método 13 Palma Acosta, Jaime
	 * 
	 */
	public String extraerSubstring(String cadena, int posicionInicio, int posicionFinal) {

		String nuevaCadena = "";

		if (posicionInicio < 0 || posicionInicio >= cadena.length() || posicionFinal < posicionInicio
				|| posicionFinal > cadena.length()) {
			if (posicionInicio < 0 || posicionInicio >= cadena.length())
				System.out.println("Posición de inicio incorreta");
			if (posicionFinal < posicionInicio || posicionInicio >= cadena.length())
				System.out.println("Posición final incorreta");
			return cadena;
		} else {
			for (int i = posicionInicio; i <= posicionFinal - 1; i++) {
				nuevaCadena += String.valueOf(cadena.charAt(i));
			}
			return nuevaCadena;
		}
	}

	/**
	 * Método 14 Quero Pérez, Juan
	 * 
	 * 
	 */
	public String concatenaCadenas(String cadena1, String cadena2) {

		String nuevaCadena = cadena1;

		for (int i = 0; i < cadena2.length(); i++) {
			nuevaCadena += cadena2.charAt(i);
		}

		return nuevaCadena;

	}

	/**
	 * Método 15 Ribot Rosa, Paula
	 * 
	 * 
	 */
	public boolean esUnPalindromo(String valor) {
		String inverso = "";
		for (int i = 0; i < valor.length(); i++) {
			inverso = valor.charAt(i) + inverso;
		}
		return valor.compareToIgnoreCase(inverso) == 0;
	}

	/**
	 * Método ???
	 * 
	 * 
	 */
	public int numeroDeVocales(String valor) {
		int nVocales = 0;
		for (int i = 0; i < valor.length() - 1; i++) {
			if (isVocal(valor.charAt(i)))
				nVocales++;
		}
		return nVocales;
	}

	/**
	 * Método USO DE VARIOS NO SE TESTEA
	 * 
	 */

	private boolean isVocal(char caracter) {
		caracter = Character.toLowerCase(caracter);
		String s = caracter + "";
		return s.matches("[aeiou]");
	}

	/**
	 * Método
	 * 
	 */

	public boolean empiezaPorVocal(String valor) {

		return valor.toLowerCase().matches("^[aeiou].*");
	}

}
