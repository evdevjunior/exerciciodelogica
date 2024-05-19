package exercicioslogica;

public class Temperatura {

	public static void main(String[] args) {
		
		double C, K, F, Re, Ra;
		C = 2.43;
		
		F = C * 1.8 + 32;
		K = C + 273.15;
		Re = C * 0.8;
		Ra = C * 1.8 +32 + 459.67;
		
		System.out.println("Temperatura em Fahrenheit  " + F);
		System.out.println("Temperatura em Kelvin  " + K);
		System.out.println("Temperatura em Réaumur  " + Re);
		System.out.println("Temperatura em Rankine  " + Ra);
		
	}

}
