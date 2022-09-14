package entrada_processamneto_saida;

import java.util.Scanner;

public class EX48F {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);	
		
		
		
		int a, b, i;
		
		System.out.println("Digite um número qualquer: ");
		a = ler.nextInt();
		
		for (i=1; i<= 20; i++) {
			b = a + i;
			System.out.println(b);		
			
	}

	}
}


