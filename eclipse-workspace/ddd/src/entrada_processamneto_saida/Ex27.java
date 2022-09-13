package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner (System.in);
		 
		int value, result;
		System.out.printf("Digite qualquer valor inteiro: ");
		value = ler.nextInt();
		if (value % 2 == 0) {
			result = value + 5;
			System.out.println(result);
		} else {
			result = value + 8;
			System.out.println(result);
		}
		ler.close();
	}


}
