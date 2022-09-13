package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex13 {
		
		public static void main(String[] args) {
		     Scanner ler = new Scanner (System.in);

		     int a, b, c;
		     
		     System.out.printf("valor da a é");
			 a = ler.nextInt();
		     
			 System.out.printf("valor da b é");
			 b = ler.nextInt();
			 
			 System.out.printf("valor da c é");
			 c = ler.nextInt();
			 
			 
			 
			 if ((a>b) && (a>c)) {
				 System.out.printf("valor de a é maior");
			 } else if((b>a) && (b>c)) {
				 System.out.printf("valor de b é maior");
			 } else if ((c>a) && (c>b)) {
				System.out.printf("valor de c é maior");
				 
			}
			 }
			 
	}


