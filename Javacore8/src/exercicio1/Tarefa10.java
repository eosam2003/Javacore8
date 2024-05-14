package exercicio1;

public class Tarefa10 {
	   public static void main(String[] args) {
	        int soma = 0;
	        int contador = 0;
	        
	        for (int i = 50; i <= 70; i++) {
	            if (i % 2 == 0) { 
	                soma += i;
	                contador++;
	            }
	        }
	        
	        double media = (double) soma / contador;
	        
	        System.out.println("Somatório dos valores pares entre 50 e 70: " + soma);
	        System.out.println("Média aritmética dos valores pares entre 50 e 70: " + media);
	    }
	
}
