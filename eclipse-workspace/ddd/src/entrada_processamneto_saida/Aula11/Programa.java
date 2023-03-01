package Aula11;

import java.util.Scanner;

import java.util.HashMap;

public class Programa {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, Cliente> map = new HashMap<Integer, Cliente>();
		
		
		String PossuiContaBancaria;
		
		
		for (int index = 0; index <= 1; index++) {
			Cliente cliente = new Cliente();
			
			System.out.printf("\nDigite o ID da %dº pessoa: ", index + 1);
			cliente.setId(scanner.nextInt());
			
			System.out.printf("Digite o nome da %dº pessoa: ", index + 1);
			cliente.setNome(scanner.next());
			
			System.out.printf("Digite a idade da %dº pessoa: ", index + 1);
			cliente.setIdade(scanner.nextInt());
			
			System.out.printf("Digite o email da %dº pessoa: ", index + 1);
			cliente.setEmail(scanner.next());
			
			
			System.out.print("Você possui conta bancária? (S/N): ");
			PossuiContaBancaria = scanner.next().toLowerCase();
			
			if (PossuiContaBancaria.equals("s")) {
				ContaBancaria conta = new ContaBancaria();
				
				System.out.print("Digite a agência: ");
				conta.setAgencia(scanner.next());
				
				System.out.print("Digite o número: ");
				conta.setNumero(scanner.next());
				
				System.out.print("Digite o saldo da conta: ");
				conta.setSaldo(scanner.nextDouble());
				
				cliente.setConta(conta);
			} else {
				cliente.setConta(null);
			}
			
			map.put(index, cliente);
		}

		 map.forEach((key, value) -> {
			 System.out.print(key + "=" + value.exibirNomeIdade() + " ");
		 });
		
		scanner.close();
	}

}