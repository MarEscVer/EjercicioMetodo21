package unico;

public class Ejercicio21 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa muestre al azar el nombre de una carta de la baraja
		 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
		 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
		 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A
		 * (que sería el 1). Deberemos por tanto generar de manera aleatoria primero el
		 * palo y posteriormente la carta perteneciente al palo. Crea un programa que
		 * llame a 2 métodos, uno generará de forma aleatoria el palo y el otro método
		 * la carta. NOTA: Recordad que usando la librería Math podía generar número
		 * aleatorios.
		 */

		String palo;
		String carta;
		int numeroPalo;
		int numeroCarta;

		numeroPalo = (int) (Math.random() * 4) + 1;
		numeroCarta = (int) (Math.random() * 13) + 1;

		palo = paloRandom(numeroPalo);
		carta = cartaRandom(numeroCarta);
		
		Util.escribir(carta + " de " + palo);
	}

	public static String paloRandom(int random) {
		String palo = "";

		switch (random) {
		case 1:
			palo = "picas";
			break;
		case 2:
			palo = "corazones";
			break;
		case 3:
			palo = "diamantes";
			break;
		case 4:
			palo = "tréboles";
		default:
		}
		return palo;
	}

	public static String cartaRandom(int random) {
		String carta;
		switch (random) {
		case 1:
			carta = "As";
			break;
		case 11:
			carta = "J";
			break;
		case 12:
			carta = "Q";
			break;
		case 13:
			carta = "K";
			break;
		default:
			carta = String.valueOf(random);
		}
		return carta;
	}
}
