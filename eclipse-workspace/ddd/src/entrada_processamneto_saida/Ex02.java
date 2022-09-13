package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, area;
		
		System.out.printf("o lado é a");
		a = ler.nextInt();
		
	    area = a * a;
	    System.out.printf("a area é %d", area);

	}

}
