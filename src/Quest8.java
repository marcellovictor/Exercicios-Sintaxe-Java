import java.util.Scanner;

public class Quest8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ordem da matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		System.out.println("Digite os elementos para cada posição:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("[%s][%s]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		if (testaMatrizMagica(mat, n)) {
			System.out.println("A matriz fornecida É um quadrado mágico!");
		}
		else {
			System.out.println("A matriz fornecida NÃO é um quadrado mágico!");
		}
		
		
		
		sc.close();
	}
	
	static boolean testaMatrizMagica(int[][] matriz, int n) {
		int soma, valorEsperado = 0;
		
		// Teste das linhas
		for (int i = 0; i < n; i++) {
			soma = 0;
			for (int j = 0; j < n; j++) {
				soma += matriz[i][j];
			}
			if (i == 0) {
				valorEsperado = soma;
			}
			else if (soma != valorEsperado) {
				return false;
			}
		}
		
		// Teste das colunas
		for (int i = 0; i < n; i++) {
			soma = 0;
			for (int j = 0; j < n; j++) {
				soma += matriz[j][i];
			}
			if (soma != valorEsperado) {
				return false;
			}
		}
		
		//Teste diagonal principal
		
		soma = 0;
		for (int i = 0; i < n; i++) {
			soma += matriz[i][i];
		}
		if (soma != valorEsperado) {
			return false;
		}
		
		
		//Teste diagonal secundaria
		
		soma = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j + 1 == n - 1) {
					soma += matriz[i][j];
				}
			}
		}
		if (soma != valorEsperado) {
			return false;
		}
		
		
		return true;
		
	}
		

}
