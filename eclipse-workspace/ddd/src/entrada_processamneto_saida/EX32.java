package entrada_processamneto_saida;

import java.util.Scanner;

public class EX32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int v1, v2;

        System.out.printf("digite o valor:");
        v1 = ler.nextInt();

        System.out.printf("digite o segundo valor:");
        v2 = ler.nextInt();

        while(v2 < v1) {
            System.out.println("valor incorreto digite o segundo valor novamente:  ");
            v2 = ler.nextInt();
        }
        System.out.printf("valor correto");
		
	}

}
