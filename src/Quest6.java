
public class Quest6 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 0;
		b = 1;
		c = a + b;
		
		System.out.println("0\n1");
		
		while (c <= 100) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
		}
		
		
	}
	

}
