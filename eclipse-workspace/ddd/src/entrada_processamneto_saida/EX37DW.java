package entrada_processamneto_saida;

import java.util.Scanner;

public class EX37DW {

	public static void main(String[] args) {}
		public static void main1(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			String confirmation;
			int value, index, result;
			
			value = 1;
			
			do {
				for (index = 1; index < 21; index++) {
				    result = value * index;
				    System.out.printf("\n%d X %d = %d", value, index, result);
				    
				    if (index == 20) {
				    	System.out.print("\nDigite 'OK' para continuar: ");
						confirmation = scanner.next();
						
						do {
							System.out.print("\nDigite 'OK' para continuar: ");
							confirmation = scanner.next();
						} while (!confirmation.equals("OK"));
						
						value = value + 1;
				    }
				}
			} while (value < 20);
			
			System.out.print("Thank you");
		}

	}