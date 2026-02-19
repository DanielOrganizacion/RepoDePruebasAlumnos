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


}
