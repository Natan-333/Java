package entrada_processamneto_saida;

import java.util.Scanner;

public class EX33 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String sexo;

        System.out.printf("digite seu sexo em m/f: ");
        sexo = ler.next();

        while((!sexo.equals ("m"))  && (!sexo.equals ("f"))) {
            System.out.printf("sexo invalido digite corretamente abaixo");
            sexo = ler.next();
            }System.out.printf("sexo correto");

	}

}
