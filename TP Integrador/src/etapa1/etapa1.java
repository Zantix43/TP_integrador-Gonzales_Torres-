package etapa1;

import java.util.Arrays;
import java.util.Scanner;

public class etapa1 {
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
	
				
				if (contadorA[numero - 1] == false) {
					System.out.println("asiento comprado");
					contadorA[numero - 1] = true;
	
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
	
				
				if (contadorB[numero - 1] == false) {
					System.out.println("asiento comprado");
					contadorB[numero - 1] = true;
	
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
	
					if (contadorC[numero - 1] == false) {
						System.out.println("asiento comprado");
						contadorC[numero - 1] = true;
	
					}
				}
				break;
	
				}
			
		
	
			}
	}
	


