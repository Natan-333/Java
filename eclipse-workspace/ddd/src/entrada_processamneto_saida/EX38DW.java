package entrada_processamneto_saida;

public class EX38DW {

	public static void main(String[] args) {}
		public static void main1(String[] args) {
			int index = 1, finalValue = 0, currentValue;

			do {
				currentValue = index;
				finalValue = finalValue + currentValue;
				index = index + 1;
			} while (index < 101);

			System.out.printf("O resultado da soma no intervalo de um a cem deu: %d", finalValue);
		}

	}