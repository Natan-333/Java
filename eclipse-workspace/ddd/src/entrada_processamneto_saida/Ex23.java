package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex23 {
	Scanner ler = new Scanner(System.in);

	String name, genre;
	int maritalStatus, yearsMarried;
	System.out.print("Informe seu nome: ");
	name = ler.next();
	System.out.print("Informe seu sexo (M para masculino) e (F para feminino): ");
	genre = ler.next();
	if (genre.equals("M") || genre.equals("F")) {
		System.out.println("1 - Solteiro(a)");
		System.out.println("2 - Casado(a)");
		System.out.println("3 - Separado(a)");
		System.out.println("4 - Divorciado(a)");
		System.out.println("5 - Viúvo(a)");
		System.out.println("Informe seu estado civil");
		maritalStatus = ler.nextInt();
		if (maritalStatus == 1 || maritalStatus == 2 || maritalStatus == 3 || maritalStatus == 4
				|| maritalStatus == 5) {
			if (maritalStatus == 2) {
				System.out.printf("Quantos anos de casado?");
				yearsMarried = ler.nextInt();
				System.out.printf("Olá %s, que legal que você está há %d casado(a)", name, yearsMarried);
			}
		} else {
			System.out.printf("Informe um estado civil que corresponde na lista");
		}
	} else {
		System.out.println("Informe um genêro válido.");
	}
	ler.close();
}

}