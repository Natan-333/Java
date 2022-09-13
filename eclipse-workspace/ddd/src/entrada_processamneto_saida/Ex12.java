package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex12 {

		public static void main(String[] args) {
		     Scanner ler = new Scanner (System.in);
				 
		     int b, a, area;
				 
			 System.out.printf("a altura é");
			 a = ler.nextInt();
					
			 System.out.printf("a base é");
			 b = ler.nextInt();
			
			 area = b * a;	 
			    if (area <= 100) {
					System.out.printf("terreno pequeno!");
				}
				else {
					System.out.printf("terreno normal");
				}
			}	    
			
	}


