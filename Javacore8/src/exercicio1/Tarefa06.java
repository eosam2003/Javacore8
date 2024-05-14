package exercicio1;

import java.util.Scanner;

public class Tarefa06 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite a base (B): ");
	        double base = sc.nextDouble();
	        	        
	        System.out.print("Digite o expoente (E): ");
	        int expoente = sc.nextInt();
	        	        
	        double resultado = calcularPotencia(base, expoente);
	        	  
	        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
	        
	        sc.close();
	    }

	    public static double calcularPotencia(double base, int expoente) {
	        double resultado = 1;
	        
	        for (int i = 1; i <= expoente; i++) {
	            resultado *= base;
	        }
	        
	        return resultado;
	    }
	
}
