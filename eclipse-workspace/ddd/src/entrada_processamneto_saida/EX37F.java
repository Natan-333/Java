package entrada_processamneto_saida;

import java.util.Scanner;

public class EX37F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int v1, i, r;

        System.out.printf("digite um valor positivo (obrigatorio): ");
        v1 = ler.nextInt();



        while(v1 <=0 || v1>20) {
            System.out.println("valor invalido, digite outro abaixo ");
            v1 = ler.nextInt();
        }

        for(i = 1; i<=10; i++) {
            r = v1 * i;
            System.out.printf("pressione enter: ");
            ler.nextLine();
            System.out.printf("%d X %d = %d ",v1, i, r);
        }
    }

}