package entrada_processamneto_saida;

import java.util.Scanner;

public class EX35F {

	public static void main(String[] args) {}
		public static void main1(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int valor, r, i;
			
			System.out.printf("Digite o valor da multiplicação: ");
			valor = ler.nextInt();
			
			while (valor < 0) {
				System.out.printf("Digite o numero novamente(apenas positivos):  ");
				valor = ler.nextInt();
			}i = 1;
			
			for (i=1; i<=10; i++) {
				r = valor * i;
				System.out.printf("\n%d X %d = %d", valor, i, r);
			}

		}

	}