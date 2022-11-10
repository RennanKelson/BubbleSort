import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int []vetor = new int [100];
		int troca;
		
		for (int i = 0; i < vetor.length; i++) {
	        Random random = new Random();
	        vetor [i] = random.nextInt(100);
	        System.out.printf(vetor[i] + "  ");
		}
		System.out.println();
		for (int j = 0; j < vetor.length; j++) {
			for (int i = 0; i < vetor.length -1; i++) {
				if (vetor [i] > vetor [i+1]) {
					troca = vetor [i];
					vetor [i] = vetor [i+1];
					vetor [i+1] = troca;
				}
			}
		}
		for (int i = 0; i < vetor.length; i++) {		
			System.out.printf(vetor[i] + "  ");
		}
	}
}
