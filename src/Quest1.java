import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int n = sc.nextInt();
		System.out.println("-------------------//");
		
		int negativos = 0;
		for (int i = 0; i < n; i++) {
			System.out.printf("%s� n�mero: ", i+1);
			int aux = sc.nextInt();
			
			if (aux < 0) { negativos++; }
		}
		
		System.out.println("Total de valores negativos: " + negativos);
		
		
		sc.close();

	}

}
