package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double firstNote, minimumNote;
		System.out.printf("Informe o valor da primeira nota (P1): ");
		firstNote = ler.nextDouble();
		minimumNote = (15 - firstNote) / 2;
		System.out.printf("O aluno precisa tirar no minímo %f pontos para ser aprovado", minimumNote);
		ler.close();
	
	}

}
