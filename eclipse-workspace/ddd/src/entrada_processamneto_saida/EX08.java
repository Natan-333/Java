package entrada_processamneto_saida;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.printf("digite o primeiro numero: ");
		valor1 = ler.nextInt();
		
		System.out.printf("digite o segundo numero: ");
		valor2 = ler.nextInt();
		
		if (valor1 > valor2) {
			System.out.printf("o priemiro valor é o maior!");
		}
		else {
			System.out.printf("o segundo valor é o maior!");
		}
		
	}
}


