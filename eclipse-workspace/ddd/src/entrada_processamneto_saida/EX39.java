package entrada_processamneto_saida;

import java.util.Scanner;

public class EX39 {

	public static void main1(String[] args) {
		Scanner ler = new Scanner (System.in);

	}
			public static void main(String[] args) {
				int index = 1, t1 = -1, t2 = 1, t3 = 0;

				for (index = 1; index < 31; index++) {
					t3 = t1 + t2;
					t1 = t2;
					t2 = t3;

					System.out.printf("\n%d", t3);
				}
				System.out.println("\nFim");
		}
	}