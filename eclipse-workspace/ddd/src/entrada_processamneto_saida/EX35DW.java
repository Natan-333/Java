package entrada_processamneto_saida;

import java.util.Scanner;

public class EX35DW {

	public static void main(String[] args) {}
		public static void main1(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int valor, r, i;
			
			do {
			System.out.printf("Digite o valor da multiplicação(apenas positivos): ");
			valor = ler.nextInt();
			}while (valor < 0);
			
			i = 1;
			
			do {
				r = valor * i;
				System.out.printf("\n%d X %d = %d", valor, i, r);
				i = i + 1;
			}while (i < 11);

		}

	}