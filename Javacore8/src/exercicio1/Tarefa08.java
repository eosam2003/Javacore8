package exercicio1;

public class Tarefa08 {
	  public static void main(String[] args) {
	        System.out.println("Celsius \t Fahrenheit");    
	     
	        for (int celsius = 10; celsius <= 100; celsius += 10) {
	            double fahrenheit = (9.0 * celsius + 160) / 5.0;
	            System.out.printf("%d \t\t %.1f%n", celsius, fahrenheit);
	        }
	    }
	
}
