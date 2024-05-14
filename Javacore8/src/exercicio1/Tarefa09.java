package exercicio1;

import java.util.Scanner;

public class Tarefa09 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int numValores = 10;
	        double soma = 0.0;
	        
	        double[] valores = new double[numValores];
	        
	        for (int i = 0; i < numValores; i++) {
	            System.out.print("Digite o valor " + (i + 1) + ": ");
	            valores[i] = sc.nextDouble();
	            soma += valores[i];
	        }
	        
	        double media = soma / numValores;
	        
	        System.out.println("Somatório dos valores: " + soma);
	        System.out.println("Média aritmética dos valores: " + media);
	        
	        sc.close();
	    }
	
}
