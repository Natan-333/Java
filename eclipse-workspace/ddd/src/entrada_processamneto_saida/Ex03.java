package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);

		int a, b, area;
		
		System.out.printf("a base é");
		a = ler.nextInt();
		
		System.out.printf("a altura é");
		b	= ler.nextInt();
	
		area = (a * b) /2;
		
		System.out.printf("a area é %d", area);
		
	}

}
