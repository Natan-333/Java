package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int alt, peso, imc;
		
		 System.out.printf("valor da altura é");
		 alt = ler.nextInt();
		 
		 System.out.printf("valor peso");
		 peso = ler.nextInt();
		
	imc =(peso / (alt*alt));
	
		System.out.printf("seu peso é %d", imc );
	
	}
	

}
