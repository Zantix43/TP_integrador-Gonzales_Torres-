package etapa3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class etapa3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		/* aviso hicimos el punto 3,4 y 5 aqui */

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

		boolean general = false;

		while (general == false) {
			try {
				System.out.println("\nque fila desea? (A,B,C)");

				letra = entrada.next();
				
				if(!letra.equals("A") && !letra.equals("B") && !letra.equals("C") && !letra.equals("a") && !letra.equals("b") && !letra.equals("c")) {
	                throw new InputMismatchException(" no se encuentra esta fila");

				}

				switch (letra.toUpperCase()) {

				case "A":

					while (ocupadoA == false) {
						System.out.println("\nque numero de asiento desea?(4 asientos por fila DEL 1 AL 4)");
						numero = entrada.nextInt();
						if (numero < 0 || numero > 4) {
							throw new ArithmeticException("no existen salas con este numero");
						}

						while (numero < 0 || numero > 4) {
							System.out.println("\nnumero de fila no encontrado, vuelva a intertarlo:");
							numero = entrada.nextInt();
						}

						while (contadorA[numero - 1] == true) {
							System.out.println("\neste asciento ya fue comprado elija otro");
							numero = entrada.nextInt();

							while (contadorA[numero - 1] == true && numero - 1 == A[numero - 1]) {
								System.out.println("\ningrese otro numero de asciento");
								numero = entrada.nextInt();
							}
						}
						if (contadorA[numero - 1] == false) {
							System.out.println("\nasiento comprado");
							contadorA[numero - 1] = true;
							ventas_totales += 500;
						}

						if (contadorA[0] == true && contadorA[1] == true && contadorA[2] == true
								&& contadorA[3] == true) {
							System.out.println("\ntodos los asientos de la fila A ya fueron comprados");
							System.out.println("\ntotal gastado: " + ventas_totales);
							ocupadoA = true;
						}
					}
					break;

				case "B":

					while (ocupadoB == false) {
						System.out.println("\nque numero de asiento desea?(4 asientos por fila DEL 1 AL 4)");
						numero = entrada.nextInt();
						if (numero < 0 || numero > 4) {
							throw new ArithmeticException("no existen salas con este numero");
						}

						while (numero < 0 || numero > 4) {
							System.out.println("\nnumero de fila no encontrado, vuelva a intertarlo:");
							numero = entrada.nextInt();
						}

						while (contadorB[numero - 1] == true) {
							System.out.println("\neste asciento ya fue comprado elija otro");
							numero = entrada.nextInt();

							while (contadorB[numero - 1] == true && numero - 1 == B[numero - 1]) {
								System.out.println("\ningrese otro numero de asciento");
								numero = entrada.nextInt();
							}
						}
						if (contadorB[numero - 1] == false) {
							System.out.println("\nasiento comprado");
							contadorB[numero - 1] = true;
							ventas_totales += 500;
						}

						if (contadorB[0] == true && contadorB[1] == true && contadorB[2] == true
								&& contadorB[3] == true) {
							System.out.println("\ntodos los asientos de la fila A ya fueron comprados");
							System.out.println("\ntotal gastado: " + ventas_totales);
							ocupadoB = true;
						}
					}
					break;

				case "C":
					while (ocupadoC == false) {

						System.out.println("\nque numero de asiento desea?(4 asientos por fila DEL 1 AL 4)");
						numero = entrada.nextInt();
						if (numero < 0 || numero > 4) {
							throw new ArithmeticException("no existen salas con este numero");
						}

						while (numero < 0 || numero > 4) {
							System.out.println("\nnumero de fila no encontrado, vuelva a intertarlo:");
							numero = entrada.nextInt();
						}

						while (contadorC[numero - 1] == true) {
							System.out.println("\neste asciento ya fue comprado elija otro");
							numero = entrada.nextInt();

							while (contadorC[numero - 1] == true && numero - 1 == C[numero - 1]) {
								System.out.println("\ningrese otro numero de asiento");
								numero = entrada.nextInt();
							}
						}
						if (contadorC[numero - 1] == false) {
							System.out.println("\nasiento comprado");
							contadorC[numero - 1] = true;
							ventas_totales += 1000;
						}

						if (contadorC[0] == true && contadorC[1] == true && contadorC[2] == true
								&& contadorC[3] == true) {
							System.out.println("\ntodos los asientos de la fila C ya fueron comprados");
							System.out.println("\ntotal gastado: " + ventas_totales);
							ocupadoC = true;
						}
					}
					break;

				}
				if (ocupadoA == true && ocupadoB == true && ocupadoC == true) {
					System.out.println("\nsalas llenas");
					System.out.println("\ngastaste en total " + ventas_totales);
					general = true;
				}
			} catch (ArithmeticException e) {
				System.out.println("Error fila no encontrada");
			} catch (InputMismatchException e) {
				entrada.nextLine();
				System.out.println("ingreso de dato incorrecto "+e.getMessage());
			}
		}

	}
}