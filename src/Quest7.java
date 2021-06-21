import java.util.Scanner;

public class Quest7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota, total=0;
		int pessima=0, ruim=0, boa=0, otima=0;
	
		boolean notaValida;
		
		do {
		
		System.out.print("Digite a nota: ");
		nota = sc.nextInt();
		notaValida = nota >= 0 && nota <= 100;
		
		if (notaValida) {
			total++;
			if (nota <= 25) {
				pessima++;
			}
			else if (nota <= 50) {
				ruim++;
			}
			else if (nota <= 75) {
				boa++;
			}
			else {
				otima++;
			}
		}
			
		} while (notaValida);
		
			
		sc.close();
		
		System.out.println();
		System.out.println("Porcentagem de avaliações:");
		System.out.println("Ótimas: " + porcentagem(otima, total) + "%");
		System.out.println("Boas: " + porcentagem(boa, total) + "%");
		System.out.println("Ruins: " + porcentagem(ruim, total) + "%");
		System.out.println("Péssimas: " + porcentagem(pessima, total) + "%");

	}
	
	static int porcentagem(int numerador, int denominador) {
		return (int) Math.round((numerador*100.0)/denominador);
	}

}
