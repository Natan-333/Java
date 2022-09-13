package entrada_processamneto_saida;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double acceleration, speed, travelTime, kmPerHour;
		System.out.printf("Informe o valor da aceleração em m/s2: ");
		acceleration = ler.nextDouble();
		System.out.printf("Informe o valor da velocidade inicial em m/s: ");
		speed = ler.nextDouble();
		System.out.printf("Informe o tempo de percurso em segundos: ");
		travelTime = ler.nextDouble();
		kmPerHour = speed + (acceleration * travelTime);
		if (kmPerHour <= 40)
			System.out.printf("Veículo muito lento");
		else if (kmPerHour > 40 && kmPerHour <= 60)
			System.out.printf("Velocidade permitida");
		else if (kmPerHour > 60 && kmPerHour <= 80)
			System.out.printf("Velocidade de cruzeiro");
		else if (kmPerHour > 80 && kmPerHour <= 120)
			System.out.printf("Veículo rápido");
		else if (kmPerHour > 120)
			System.out.printf("Veículo rápido");
		ler.close();
	}
}