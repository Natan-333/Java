package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int number;
		System.out.printf("Digite um valor inteiro: ");
		number = ler.nextInt();
		if (number % 2 == 0)
			System.out.printf("O valor informado é PAR");
		else
			System.out.printf("O valor informado é IMPAR");
		ler.close();
	
	}

}
