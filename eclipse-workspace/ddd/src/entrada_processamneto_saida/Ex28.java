package entrada_processamneto_saida;

import java.util.Arrays;
import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int firstNumber, secondNumber, thirdNumber;
		System.out.print("Digite o primeiro número: ");
		firstNumber = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		secondNumber = ler.nextInt();
		System.out.print("Digite o terceiro número: ");
		thirdNumber = ler.nextInt();
		int[] listNumbers = { firstNumber, secondNumber, thirdNumber };
		Arrays.sort(listNumbers);
		System.out.println("\nOrdem crescente dos valores: " + Arrays.toString(listNumbers));
		ler.close();
	}

}
