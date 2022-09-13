package entrada_processamneto_saida;

import java.util.Scanner;

public class EX34W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num = 5;
		int r;
		int i = 5;
		
		while(i < 11) {
			r = num * i;
			System.out.printf("\n%d X %d = %d", num, i, r);
			i = i + 1;
		}
				
	}

}