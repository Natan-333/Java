package entrada_processamneto_saida;

import java.util.Scanner;  

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double firstNumber, secondNumber, thirdNumber, fourthNumber, media;
		
		System.out.print("Digite a primeira nota:");
		firstNumber = ler.nextDouble();
		
		System.out.print("Digite a segunda nota:");
		secondNumber = ler.nextDouble();
		
		System.out.print("Digite a terceira nota:");
		thirdNumber = ler.nextDouble();
		
		System.out.print("Digite a quarta nota:");
		fourthNumber = ler.nextDouble();
		
		media = (firstNumber + secondNumber + thirdNumber + fourthNumber) / 4;
		
		System.out.printf("A média é: %f", media);
		
		ler.close();
	}
}