package exercicio1;

import java.util.Scanner;

public class Tarefa12 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int maiorValor = Integer.MIN_VALUE;
	        int menorValor = Integer.MAX_VALUE;
	        int valor;

	        System.out.println("Digite valores positivos inteiros. Para parar, digite um valor negativo.");
	        
	        while (true) {
	            System.out.print("Digite um valor: ");
	            valor = sc.nextInt();
	            
	            if (valor < 0) {
	                break;
	            }
	            
	            if (valor > maiorValor) {
	                maiorValor = valor;
	            }
	            if (valor < menorValor) {
	                menorValor = valor;
	            }
	        }
	        
	        if (maiorValor == Integer.MIN_VALUE && menorValor == Integer.MAX_VALUE) {
	            System.out.println("Nenhum valor positivo foi informado.");
	        } else {
	            System.out.println("Maior valor informado: " + maiorValor);
	            System.out.println("Menor valor informado: " + menorValor);
	        }

	        sc.close();
	    }
	
}
