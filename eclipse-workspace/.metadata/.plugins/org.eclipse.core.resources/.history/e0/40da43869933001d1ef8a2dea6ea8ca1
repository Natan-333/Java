package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double heigth, weight, imc;
		String gender;
		System.out.printf("Digite a sua altura em (m): ");
		heigth = scanner.nextDouble();
		System.out.printf("Digite o seu peso (em Kg): ");
		weight = scanner.nextDouble();
		System.out.printf("Digite \"M\" para Masculino e \"F\" para feminino: ");
		gender = scanner.next();
		while (!gender.equals("M") && !gender.equals("F")) {
			System.out.printf("INFORME UM GENÊRO VALIDO. \"M\" para Masculino e \"F\" para feminino: ");
			gender = scanner.next();
		}
		imc = weight / (heigth * heigth);


	}

}
