package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		

		double heigth, weight, imc;
		String gender;
		System.out.printf("Digite a sua altura em (m): ");
		heigth = ler.nextDouble();
		System.out.printf("Digite o seu peso (em Kg): ");
		weight = ler.nextDouble();
		System.out.printf("Digite \"M\" para Masculino e \"F\" para feminino: ");
		gender = ler.next();
		while (!gender.equals("M") && !gender.equals("F")) {
			System.out.printf("INFORME UM GENÊRO VALIDO. \"M\" para Masculino e \"F\" para feminino: ");
			gender = ler.next();
		}
		imc = weight / (heigth * heigth);
		if (gender.equals("M")) {
			if (imc < 20)
				System.out.printf("Abaixo do peso!");
			if (imc < 25)
				System.out.printf("Peso ideal!");
			else
				System.out.printf("Acima do peso!");
		}
		if (gender.equals("F")) {
			if (imc < 19)
				System.out.printf("Abaixo do peso!");
			if (imc < 24)
				System.out.printf("Peso ideal!");
			else
				System.out.printf("Acima do peso!");
		}
		ler.close();
	}
}	