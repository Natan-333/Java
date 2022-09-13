package entrada_processamneto_saida;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int a, b, soma;
		
		System.out.printf("digite o primeiro valor");
	    a = ler.nextInt();
	    
	    System.out.printf("digite o segundo valor");
	    b =ler.nextInt();
	   
	    soma = a * b;
	    
	    System.out.printf("a soma é %d", soma);
   
	    if (soma >= 100) {
			System.out.printf("terreno grande!");
		}
		else {
			System.out.printf("terreno normal");
		}
	}	    
}	