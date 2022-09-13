package entrada_processamneto_saida;

public class EX39W {

	public static void main(String[] args) {
		int I = 1, previousNumber = 0, nextNumber = 1, sumNumbers = 0;

		while (I < 31) {
			System.out.printf("\n%d", nextNumber);
			sumNumbers = nextNumber + previousNumber;
			previousNumber = nextNumber;
			nextNumber = sumNumbers;
			I = I + 1;
		}
	}
}