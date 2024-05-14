package exercicio1;

import java.util.Scanner;

public class Tarefa01 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite qual Tabuada deseja: ");
		int escolhaTabuada = sc.nextInt();

		int contador = 0;

		while (contador <= 10) {

			int resultado = contador * escolhaTabuada;
			System.out.println(contador + " X " + escolhaTabuada + " = " + resultado);
			contador++;

		}
		sc.close();
	}
	
}
