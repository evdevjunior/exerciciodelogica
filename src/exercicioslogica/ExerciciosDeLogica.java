package exercicioslogica;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ExerciciosDeLogica {
	
	public static void main(String[] args) {
		
		/*1
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
		*/
		
		// Salarios 
		double s1 = 1.400;
		double s2 = 2.500;
		double s3 = 3.450;
		double s4 = 4.320;
		double s5 = 5.389;
		double s6 = 2.343;
		double s7 = 3.210;
		
		// Calculo da média salárial
		double media = ((s1 + s2 + s3 + s4 + s5 + s6 + s7)/7);
		
		// Formata a media para duas casas decimais
		DecimalFormat df = new DecimalFormat("#.00");
		String resultado = df.format(media);
		
		System.out.println("Media de salarios da empresa " + resultado);
		
		
	}


}
