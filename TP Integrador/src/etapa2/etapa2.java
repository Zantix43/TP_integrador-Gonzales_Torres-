package etapa2;

import java.util.Scanner;

public class etapa2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] A = { 0, 1, 2, 3 };

		int[] B = { 0, 1, 2, 3 };

		int[] C = { 0, 1, 2, 3 };

		boolean[] contadorA = { false, false, false, false };

		boolean[] contadorB = { false, false, false, false };

		boolean[] contadorC = { false, false, false, false };

		int clientes;

		boolean ocupadoA = false;

		boolean ocupadoB = false;

		boolean ocupadoC = false;

		String letra;

		int numero;

		int ventas_totales = 0;

		System.out.println("que fila desea? (A,B,C)");
		letra = entrada.next();

		switch (letra.toUpperCase()) {

		case "A":
			while (ocupadoA == false) {

				System.out.println("que numero de asiento desea?(4 asientos por fila DEL 1 AL 4)");
				numero = entrada.nextInt();

				while (numero < 0 || numero > 4) {
					System.out.println("numero de fila no encontrado, vuelva a intertarlo:");
					numero = entrada.nextInt();
				}

				while (contadorA[numero - 1] == true) {
					System.out.println("este asciento ya fue comprado elija otro");
					numero = entrada.nextInt();

					while (contadorA[numero - 1] == true && numero - 1 == A[numero - 1]) {
						System.out.println("\ningrese otro numero de asciento");
						numero = entrada.nextInt();
					}
				}
				if (contadorA[numero - 1] == false) {
					System.out.println("asiento comprado");
					contadorA[numero - 1] = true;
					ventas_totales += 500;
				}

				if (contadorA[0] == true && contadorA[1] == true && contadorA[2] == true && contadorA[3] == true) {
					System.out.println("todos los asientos de la fila A ya fueron comprados");
					ocupadoA = true;
				}
			}
			break;

		case "B":
			while (ocupadoB == false) {

				System.out.println("que numero de asiento desea?(4 asientos por fila DEL 1 AL 4)");
				numero = entrada.nextInt();

				while (numero < 0 || numero > 4) {
					System.out.println("numero de fila no encontrado, vuelva a intertarlo:");
					numero = entrada.nextInt();
				}

				while (contadorB[numero - 1] == true) {
					System.out.println("este asciento ya fue comprado elija otro");
					numero = entrada.nextInt();

					while (contadorB[numero - 1] == true && numero - 1 == B[numero - 1]) {
						System.out.println("\ningrese otro numero de asciento");
						numero = entrada.nextInt();
					}
				}
				if (contadorB[numero - 1] == false) {
					System.out.println("asiento comprado");
					contadorB[numero - 1] = true;
					ventas_totales += 700;
				}

				if (contadorB[0] == true && contadorB[1] == true && contadorB[2] == true && contadorB[3] == true) {
					System.out.println("todos los asientos de la fila A ya fueron comprados");
					ocupadoB = true;
				}
			}
			break;
			
		case "C":
			while (ocupadoC == false) {

				System.out.println("que numero de asiento desea?(4 asientos por fila DEL 1 AL 4)");
				numero = entrada.nextInt();

				while (numero < 0 || numero > 4) {
					System.out.println("numero de fila no encontrado, vuelva a intertarlo:");
					numero = entrada.nextInt();
				}

				while (contadorC[numero - 1] == true) {
					System.out.println("este asciento ya fue comprado elija otro");
					numero = entrada.nextInt();

					while (contadorC[numero - 1] == true && numero - 1 == C[numero - 1]) {
						System.out.println("\ningrese otro numero de asciento");
						numero = entrada.nextInt();
					}
				}
				if (contadorC[numero - 1] == false) {
					System.out.println("asiento comprado");
					contadorC[numero - 1] = true;
					ventas_totales += 1000;
				}

				if (contadorC[0] == true && contadorC[1] == true && contadorC[2] == true && contadorC[3] == true) {
					System.out.println("todos los asientos de la fila A ya fueron comprados");
					
				}
			}
			break;

		}
	}
}