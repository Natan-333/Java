package entrada_processamneto_saida;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double graus, fahrenheit;
		
		System.out.print("Qual a temperatura em celsius?");
		graus = scanner.nextDouble();
		
		fahrenheit = (graus * 1.8) + 32;
		
		System.out.printf("O resultado em fahrenheit é: %f", fahrenheit);
		scanner.close();
	}
}