package entrada_processamneto_saida;

public class EX41W {

	public static void main(String[] args) {
		int I = 1, firstNumber = -1, secondNumber = 1, thirdNumber = 1, sumNumbers = 0;

		while (I < 31) {
			System.out.printf("\n%d", secondNumber);
			sumNumbers = secondNumber + firstNumber + thirdNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			thirdNumber = sumNumbers;
			I = I + 1;
		}
	}

}