import java.util.Locale;
import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double R, S, T;
		
		System.out.println("Digite valores para as seguintes variáveis:");
		
		System.out.print("R: ");
		R = sc.nextDouble();
		
		System.out.print("S: ");
		S = sc.nextDouble();
		
		System.out.print("T: ");
		T = sc.nextDouble();
		
		sc.close();
		
		System.out.println("Maior valor digitado: " + maior(R, S, T));
		
	}
	
	static double maior(double x, double y, double z) {
		if (x >= y && x >= z) {
			return x;
		}
		else if (y >= z){
			return y;
		}
		else {
			return z;
		}
	}

}
