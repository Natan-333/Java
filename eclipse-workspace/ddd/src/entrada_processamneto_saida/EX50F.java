package entrada_processamneto_saida;

import java.util.Scanner;

public class EX50F {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o número inicial  ");
		a = ler.nextInt();
		
		System.out.println("Digite o número final do intervalo: ");
		b = ler.nextInt();
		
		for (a=1;a<=(b+1);a++) {
			if (a >= 10) {
				if (a % 2 == 0){
					System.out.println(a);
				}
			}
		}
		System.out.println("São os números pares no intervalo informado.");
		System.out.println("Programa Encerrado");
	}
	
}
