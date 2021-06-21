import java.util.Scanner;

public class Quest5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Digite um valor para n: ");
		n = sc.nextInt();
				
		int fatorial = fatorial(n);
		
		if (fatorial > 0) {
			System.out.println("Fatorial de " + n + ": " + fatorial);
		}
		else {
			System.out.println("Não foi possível imprimir o fatorial de " + n + "!");
		}
		
		sc.close();

	}
	
	static int fatorial(int num) {
		
		if (num < 0) {
			return -1;
		}
		
		int fat = 1;
		
		for (int i = num; i > 0; i--) {
			fat *= i;
		}
		
		return fat;
		
	}

}
