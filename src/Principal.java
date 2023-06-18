
public class Principal {

	public static void main(String[] args) {

		String cadena = "LA OSA PEREZOSA";
		String lista = "OSA";
		String resultado = "";

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != (lista.charAt(0))) {
				resultado = resultado + cadena.charAt(i);
			} else {
				String subcadena = cadena.substring(i, i + lista.length());
				if (subcadena.equals(lista)) {
					i = i + lista.length()-1;
				}
			}
		}
		System.out.println(resultado);
	}
}