package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double firstNote, secondNote, average;
		System.out.printf("Informe o valor da primeira nota (P1): ");
		firstNote = ler.nextDouble();
		System.out.printf("Informe o valor da segunda nota (P2): ");
		secondNote = ler.nextDouble();
		average = (firstNote + (2 * secondNote)) / 3;
		System.out.println(average);
		if (average >= 5)
			System.out.printf("Aprovado");
		else
			System.out.printf("Reprovado");
		ler.close();
	}
}