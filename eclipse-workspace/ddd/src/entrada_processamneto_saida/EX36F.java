package entrada_processamneto_saida;

import java.util.Scanner;

public class EX36F {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int value, startInterval, endInterval, index, result;

		System.out.print("Informe um valor qualquer: ");
		value = scanner.nextInt();

		while (value <= 0) {
			System.out.print("Informe um valor positivo: ");
			value = scanner.nextInt();
		}

		System.out.print("Informe o ínicio do intervalo: ");
		startInterval = scanner.nextInt();
		
		System.out.print("Informe o ínicio do intervalo: ");
		endInterval = scanner.nextInt();

		while (endInterval <= startInterval) {
			System.out.print("O valor final do intervalo deve ser maior que o valor inicial: ");
			startInterval = scanner.nextInt();
		}


		for (index = startInterval; index < endInterval + 1; index++) {
			result = value * index;
			System.out.printf("\n%d X %d = %d", value, index, result);
			scanner.close();
		}
	}

}
