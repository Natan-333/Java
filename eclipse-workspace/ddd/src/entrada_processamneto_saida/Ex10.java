package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double firstNumber, secondNumber;
		
		System.out.println("Digite o primeiro número: ");
		firstNumber = scanner.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		secondNumber = scanner.nextDouble();
		
		if (firstNumber == secondNumber) {
			System.out.println("Os números são iguais");
		}
		if (firstNumber > secondNumber) {
			System.out.println("O primeiro valor informado é o maior");
		}
		
	}
}	