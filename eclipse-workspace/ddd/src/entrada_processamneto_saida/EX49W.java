package entrada_processamneto_saida;

import java.util.Scanner;

public class EX49W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
int a, b, soma;
		
		System.out.println("Digite o início : ");
		a = ler.nextInt();
		
		System.out.println("Digite o final : ");
		b = ler.nextInt();
		
		while (b <= a) {
			System.out.println("O valor final deve ser maior do que o valor inicial.");
			System.out.println("Digite o final do intervalo: ");
			b = ler.nextInt();
		}
		
		soma = 0;
		
		while (a <= b) {
			soma = soma + a;
			a++;
		}
		
		System.out.println("A soma dos valores do intervalo é: " + soma);
		
		
		
	}


}


