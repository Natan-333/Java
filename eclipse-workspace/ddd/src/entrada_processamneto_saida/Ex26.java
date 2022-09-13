package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
			int value, result;
			System.out.printf("Digite qualquer valor inteiro: ");
			value = ler.nextInt();
			if (value > 0) {
				result = value * 2;
				System.out.printf("O dobro do valor é: %d", result);
			} else {
				result = value * 3;
				System.out.printf("O dobro do valor é: %d", result);
			}
			ler.close();
		}
	
}
