package exercicio1;

import java.util.Scanner;

public class Tarefa11 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double areaTotal = 0.0;
	        String continuar = "SIM";
	        
	        while (continuar.equalsIgnoreCase("SIM")) {
	            System.out.print("Digite o nome do cômodo: ");
	            String nomeComodo = scanner.nextLine();
	            
	            System.out.print("Digite a largura do cômodo em metros: ");
	            double largura = scanner.nextDouble();
	            
	            System.out.print("Digite o comprimento do cômodo em metros: ");
	            double comprimento = scanner.nextDouble();
	            
	            double areaComodo = largura * comprimento;
	            System.out.println("A área do " + nomeComodo + " é: " + areaComodo + " metros quadrados.");
	            
	            areaTotal += areaComodo;
	            
	            System.out.print("Deseja calcular a área de outro cômodo? (SIM/NAO): ");
	            scanner.nextLine();
	            continuar = scanner.nextLine();
	        }
	        
	        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados.");
	        
	        scanner.close();
	    }
	
}
