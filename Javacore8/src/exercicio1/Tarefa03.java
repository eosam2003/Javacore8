package exercicio1;

public class Tarefa03 {

	public static void main(String[] Args) {

		int n1 = 0;
		int i;

		for (i = 2; i <= 500; i += 2) {
			if (i % 2 == 0)
				n1 += i;
			System.out.println(i + " = " + n1);
		}
	}
	
}
