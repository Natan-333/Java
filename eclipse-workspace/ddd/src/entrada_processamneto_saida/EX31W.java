package entrada_processamneto_saida;

import java.util.Scanner;

public class EX31W {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		
		int num, t, i;
		
		System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();
        
        while( num<0 ) {
        	System.out.printf("erro número negativo! Digite um número positivo:");
        	num = ler.nextInt();
        }
	}
}	