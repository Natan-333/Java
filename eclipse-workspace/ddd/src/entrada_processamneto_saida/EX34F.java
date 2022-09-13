package entrada_processamneto_saida;

import java.util.Scanner;

public class EX34F {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int num = 5;
			int r;
			int i;
			
			for (i=1; i<=10; i++) {
				r = num * i;
				System.out.printf("sua tabuada é: %d", r);	
			}
		}
}